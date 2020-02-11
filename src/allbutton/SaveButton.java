package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;


public class SaveButton extends ButtonBase
{
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-Î´¼¤»î.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-¼¤»î.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-°´ÏÂ.png"),0,0,this);break;
		}
	}
}
