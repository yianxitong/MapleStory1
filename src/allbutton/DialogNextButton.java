package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;

public class DialogNextButton extends ButtonBase 
{
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/确认未激活.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/确认激活.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/确认按下.png"),0,0,this);break;
		}
	}
}
