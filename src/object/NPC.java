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
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Å®Éñ/Å®Éñ.png"),0,0,this);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÏÍÕß/Õ¾/Õ¾.png"),-40,-50,273,180,this);
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÆïÊ¿/ÆïÊ¿1.png"),0,0,this);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÆïÊ¿/ÆïÊ¿2.png"),0,0,this);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÆïÊ¿/ÆïÊ¿3.png"),0,0,this);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÆïÊ¿/ÆïÊ¿4.png"),0,0,this);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/ÆïÊ¿/ÆïÊ¿5.png"),0,0,this);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¸ßÊÖ/Õ¾.png"),0,0,this);
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¸ßÊÖ/Õ¾.png"),0,0,this);
			break;
		}
		}
	}
}
