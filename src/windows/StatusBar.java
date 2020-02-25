package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.*;

public class StatusBar extends JPanel
{
	private int lv;//当前等级
	
	private int hp;//当前血量
	private int mp;//当前蓝量
	private int exp;//当前经验值
	
	private int allhp;//总血量
	private int allmp;//总蓝量
	private int allexp;//总经验值
	
	private int length=142;//最大长度

	private int atk;
	public StatusBar()//状态条初始化
	{
		try 
		{
			Scanner in=new Scanner(Paths.get("./游戏存档/Player.txt"));
			lv=in.nextInt();
			hp=in.nextInt();
			mp=in.nextInt();
			exp=in.nextInt();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		allhp=1000+200*(lv-1);
		allmp=1000+50*(lv-1);
		allexp=500+1000*(lv-1);
		atk=lv*500;
	}
	public int getatk()
	{
		return atk;
	}
	public void addexp(int m_exp)
	{
		exp+=m_exp;
		if(exp>=allexp)
		{
			exp=0;
			lv++;
			allhp=1000+200*(lv-1);
			allmp=1000+50*(lv-1);
			allexp=500+1000*(lv-1);
			hp=allhp;
			mp=allmp;
			atk=lv*500;
		}
	}
	
	public int getLV()
	{
		return lv;
	}
	
	
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/状态条/状态条.png"),0,0,this);

		g.setColor(Color.RED); //血条
		g.fillRect(141, 23, (int)((double)hp/allhp*length), 15);
		g.setColor(Color.BLUE); //蓝条
		g.fillRect(340, 23, (int)((double)mp/allmp*length), 15);
		g.setColor(Color.YELLOW); //经验条
		g.fillRect(539, 23, (int)((double)exp/allexp*length), 15);
		
		//数字比例6.7619 /比例3
		String hptxt="["+Integer.toString(hp)+"/"+Integer.toString(allhp)+"]";
		int hptxtnuml=Integer.toString(hp).length()+Integer.toString(allhp).length();//血量数字显示的数字长度
		int hptxtx=272-(int)(hptxtnuml*6.7619);//相应横坐标
		
		String mptxt="["+Integer.toString(mp)+"/"+Integer.toString(allmp)+"]";
		int mptxtnuml=Integer.toString(mp).length()+Integer.toString(allmp).length();//蓝量数字显示的数字长度
		int mptxtx=471-(int)(mptxtnuml*6.7619);//相应横坐标
		
		String exptxt="["+Integer.toString(exp)+"/"+Integer.toString(allexp)+"]";
		int exptxtnuml=Integer.toString(exp).length()+Integer.toString(allexp).length();//蓝量数字显示的数字长度
		int exptxtx=670-(int)(exptxtnuml*6.7619);//相应横坐标
		
		//状态栏上文字数字显示，如 hp[50/300]
		
		g.setColor(Color.WHITE);
		g.drawString(hptxt, hptxtx,34);
		g.drawString(mptxt, mptxtx,34);
		g.drawString(exptxt, exptxtx,34);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 25));//设置字体
		g.drawString(Integer.toString(lv), 50,38);//等级
		
		
		
	}
}
