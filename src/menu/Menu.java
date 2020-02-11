package menu;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;


public class Menu extends JPanel
{
	protected int state=0;/**×´Ì¬
	* 0=Î´¼¤»î
	* 1=¼¤»î
	* */
	public int getstate()
	{
		return state;
	}
	public void setstate(int m)//¸Ä±ä×´Ì¬
	{
		state=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/²Ëµ¥.png"),0,0,this);
	}
}
