package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;

public class AbilityButton extends ButtonBase
{
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�˵�/�˵�/��������-����.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�˵�/�˵�/��������-����.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�˵�/�˵�/��������-����.png"),0,0,this);break;
		}
	}
}