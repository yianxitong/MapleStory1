package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class BackpackWindow extends JPanel
{
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/背包道具/物品道具.png"),0,0,this);
	}
}