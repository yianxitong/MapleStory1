package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;

public class DialogEndButton extends ButtonBase 
{

	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/停止对话未激活.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/停止对话激活.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/停止对话按下.png"),0,0,this);break;
		}
	}

}
