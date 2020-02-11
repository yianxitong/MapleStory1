package object;

import java.awt.*;


import javax.swing.JPanel;

public class NPC extends JPanel
{
	private int num;//NPC编号
	public NPC(int m_num)
	{
		num=m_num;
	}
	public void paint(Graphics g)
	{
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/希纳斯/希纳斯.png"),0,0,this);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/南哈特/南哈特带名字.png"),0,0,this);
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/米哈尔栏杆带名字.png"),0,0,this);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/伊莉娜带名字.png"),0,0,this);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/奥兹带名字.png"),0,0,this);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/伊卡尔特带名字.png"),0,0,this);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/胡克带名字.png"),0,0,this);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/麦吉/年轻.png"),0,0,this);
			break;
		}
		}
	}
}
