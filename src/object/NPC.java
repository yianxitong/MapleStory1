package object;

import java.awt.*;


import javax.swing.JPanel;

public class NPC extends JPanel
{
	private int num;//NPC±àºÅ
	public NPC(int m_num)
	{
		num=m_num;
	}
	public void paint(Graphics g)
	{
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/gilrs/girlshow_00114.png"),0,0,this);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/girl_hold/girl_hold_0029.png"),-40,-50,273,180,this);
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ºÚ»¯µÄÎåÆïÊ¿/°Â×È.png"),0,0,this);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ºÚ»¯µÄÎåÆïÊ¿/ºú¿Ë.png"),0,0,this);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ºÚ»¯µÄÎåÆïÊ¿/Ã×¹ş¶û.png"),0,0,this);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ºÚ»¯µÄÎåÆïÊ¿/ÒÁ¿¨¶ûÌØ.png"),0,0,this);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ºÚ»¯µÄÎåÆïÊ¿/ÒÁÀòÄÈ.png"),0,0,this);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/±»¹¥»÷/×ó.png"),0,0,this);
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ËÀÍö/dead_0038.png"),0,0,this);
			break;
		}
		}
	}
}
