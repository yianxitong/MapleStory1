package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class SkillWindow extends JPanel
{
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}

	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/技能框/面板.png"),0,0,this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/技能/新技能/横扫.png"),3,50,this);
		g.drawString("横扫", 45, 60);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/技能/新技能/开天.png"),3,90,this);
		g.drawString("开天", 45, 100);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/技能/新技能/辟地.png"),3,130,this);
		g.drawString("辟地", 45, 140);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/技能/新技能/嗜血.png"),3,170,this);
		g.drawString("嗜血", 45, 180 );
	}
}
