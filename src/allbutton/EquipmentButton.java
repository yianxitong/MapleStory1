package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;

public class EquipmentButton extends ButtonBase
{
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/菜单/人物装备-未激活.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/菜单/人物装备-激活.png"),0,0,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/菜单/人物装备-按下.png"),0,0,this);break;
		}
	}
}
