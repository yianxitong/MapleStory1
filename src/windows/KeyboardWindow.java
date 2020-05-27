package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class KeyboardWindow extends JPanel
{
	int x=20;
	int y=20;
	public void movex(int m_x)
	{
		x=m_x;
	}
	public void movey(int m_y)
	{
		y=m_y;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼üÅÌ/¼üÅÌ.png"),x,y,this);
		g.drawString("x="+Integer.toString(x)+"y="+Integer.toString(y),x-10,y-10);
	}
}
