package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class SetWindow extends JPanel
{
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��������/1.png"),0,0, this);
	}
}