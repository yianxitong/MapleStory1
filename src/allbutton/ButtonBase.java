package allbutton;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class ButtonBase extends JPanel
{
	protected int state=0;/**状态
	* 0=未激活
	* 1=激活
	* 2=按下
	* */
	public int getstate()
	{
		return state;
	}
	public void setstate(int m)//改变状态
	{
		state=m;
	}
	public abstract void paint(Graphics g);
}
