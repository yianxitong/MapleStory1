package allbutton;

import java.awt.*;

import javax.swing.*;

public class SystemButton extends JPanel
{
	private int state=0;/**状态
	* 0=未激活
	* 1=激活
	* 2=按下
	* */
	
	public void setstate(int m)
	{
		state=m;
	}
	
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/系统/未激活.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/系统/激活.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/系统/按下.png"),0,0,this);break;
		}
	}
}
