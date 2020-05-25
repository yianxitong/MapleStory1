package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class TaskWindow extends JPanel
{
	private int progress;//进度
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}
	public void setProgress(int m)
	{
		progress=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/任务框/任务框.png"),0,0,this);
		g.drawString("游戏进度 "+Integer.toString(progress)+"/100", 50, 70);
		switch(progress)
		{
		case 0:
			{
				g.drawString("初次来到这个世界...", 20, 110);
				g.drawString("去问问情况吧", 20, 125);
				break;
			}
		case 1:g.drawString("继续和老者对话吧", 20,110);break;
		case 2:g.drawString("去地图左边与喽啰对话", 20, 110);break;
		case 3:
			{
				g.drawString("也许...", 50,110);
				g.drawString("并不简单...", 50,125);
				g.drawString("再去找老者吧", 50,140);
				break;
			}
		case 4:g.drawString("继续和老者对话吧", 20,110);break;
		case 5:g.drawString("继续和老者对话吧", 20,110);break;
		case 6:g.drawString("去右边地图提升级别吧", 20, 110);break;
		case 7:
			{
				g.drawString("已经达到了10级", 20, 110);
				g.drawString("去找老者吧", 20, 125);
				break;
			}
		case 8:g.drawString("继续和老者对话吧", 20,110);break;
		case 9:g.drawString("继续和老者对话吧", 20,110);break;
		}
	}
}
