package object;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Monster extends JPanel
{
	private int MonsterID;
	private int zhuangtai=0;
	private int Target;//´ú±íÊÇ·ñÓÐ¹¥»÷Ä¿±ê
	private int HP;//¹ÖÎïÑªÁ¿
	private int Defense;//·ÀÓùÁ¦
	private int DHP=0;//µôÑªÁ¿
	private int Atk=0;
	private int x;
	private int y;
	private int bx;
	private int by;
	private int xmax;
	private int xmin;
	private int Offsetx;
	private int Offsety;
	public int getTarget()
	{
		return Target;
	}
	public int getID()
	{
		return MonsterID;
	}
	public void setTarget()
	{
		Target=1;
	}
	public Monster(int id,int m_x,int m_y,int m_xmax,int m_xmin)
	{
		MonsterID=id;
		switch(MonsterID)
		{
		case 0:
		{
			HP=1000;
			Defense=20;
			Atk=10;
			break;
		}
		case 1:
		{
			HP=5000;
			Defense=100;
			Atk=40;
			break;
		}
		case 2:
		{
			HP=10000;
			Defense=200;
			Atk=50;
			break;
		}
		case 3:
		{
			HP=50000;
			Defense=1000;
			Atk=60;
			break;
		}
		case 4:
		{
			HP=50000;
			Defense=1000;
			Atk=60;
			break;
		}
		case 5:
		{
			HP=100000;
			Defense=1000;
			Atk=10;
			break;
		}
		}
		xmax=m_xmax;
		xmin=m_xmin;
		Target=0;
		x=m_x;
		y=m_y;
		bx=x;
		by=y;
	}
	public int getxmax()
	{
		return xmax;
	}
	public int getxmin()
	{
		return xmin;
	}
	public void moveOxy(int m_x,int m_y)
	{
		Offsetx=m_x;
		Offsety=m_y;
	}
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public int getHP()
	{
		return HP;
	}
	public void setzhuangtai(int m)
	{
		zhuangtai=m;
	}
	
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public void Battack(int atk)
	{
		DHP=(atk-Defense)<=0?1:atk-Defense;
	}
	
	public int getAtk()
	{
		return Atk;
	}
	
	public int NewMonster()     //·µ»ØµÄÊÇ¾­ÑéÖµ
	{
		x=bx;
		y=by;
		Target=0;
		switch(MonsterID)
		{
		case 0:
		{
			HP=1000;
			return 2000;
		}
		case 1:
		{
			HP=5000;
			return 1000;
		}
		case 2:
		{
			HP=10000;
			return 3000;
		}
		case 3:
		{
			HP=50000;
			return 10000;
		}
		case 4:
		{
			HP=50000;
			return 100000;
		}
		case 5:
		{
			HP=100000;
			return 100000;
		}
		}
		return 0;
	}
	public void paint(Graphics g)
	{
		switch(MonsterID)
		{
		case 0:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/enemy1_hold_00001.png"),x-Offsetx-41,y+Offsety-85,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/enemy1_hold_00000.png"),x-Offsetx-16,y+Offsety-85,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/×ó×ß.gif"),x-Offsetx-50,y+Offsety-80,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/ÓÒ×ß.gif"),x-Offsetx-26,y+Offsety-80,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/azz.png"),x-Offsetx-41,y+Offsety-72,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/azy.png"),x-Offsetx-37,y+Offsety-72,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/enemy1_hold_00000.png"),x-Offsetx-151,y+Offsety-60,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/enemy1_hold_00000.png"),x-Offsetx-37,y+Offsety-60,this);break;
			}
			break;
		}
		case 1:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÅÖ×ó.png"),x-Offsetx-41,y+Offsety-120,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÅÖÓÒ.png"),x-Offsetx-58,y+Offsety-120,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/×ó×ß2.gif"),x-Offsetx-43,y+Offsety-120,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/ÓÒ×ß2.gif"),x-Offsetx-68,y+Offsety-120,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÅÖ×ó.png"),x-Offsetx-43,y+Offsety-120,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÅÖÓÒ.png"),x-Offsetx-72,y+Offsety-120,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÅÖ×ó.gif"),x-Offsetx-84,y+Offsety-100,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÅÖÓÒ.gif"),x-Offsetx-97,y+Offsety-100,this);break;
			}
			
			break;
		}
		case 2:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÊÝ×ó.png"),x-Offsetx-37,y+Offsety-100,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÊÝÓÒ.png"),x-Offsetx-28,y+Offsety-100,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/ÊÝ×ó.gif"),x-Offsetx-39,y+Offsety-95,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/ÊÝÓÒ.gif"),x-Offsetx-25,y+Offsety-95,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÊÝ×ó.png"),x-Offsetx-45,y+Offsety-85,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÊÝÓÒ.png"),x-Offsetx-50,y+Offsety-85,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÊÝ×ó.gif"),x-Offsetx-124,y+Offsety-90,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÊÝÓÒ.gif"),x-Offsetx-29,y+Offsety-90,this);break;
			}
			//System.out.printf("%d\n",Offsetx);
			break;
		}
		case 3:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÅÖ×ó.png"),x-Offsetx-41,y+Offsety-120,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/²»¶¯/ÅÖÓÒ.png"),x-Offsetx-58,y+Offsety-120,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/×ó×ß2.gif"),x-Offsetx-43,y+Offsety-120,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/ÓÒ×ß2.gif"),x-Offsetx-68,y+Offsety-120,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÅÖ×ó.png"),x-Offsetx-43,y+Offsety-120,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/°¤×á/ÅÖÓÒ.png"),x-Offsetx-72,y+Offsety-120,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÅÖ×ó.gif"),x-Offsetx-84,y+Offsety-100,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/¹¥»÷/ÅÖÓÒ.gif"),x-Offsetx-97,y+Offsety-100,this);break;
			}
			break;
		}
		case 4:
		{
			switch(zhuangtai)
			{
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/Öí×ó.gif"),x-Offsetx-70,y+Offsety-180,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Í·Ìú¹Ö/×ß/Öí×ó.gif"),x-Offsetx-64,y+Offsety-180,this);break;
			}
			break;
		}
		case 5:
		{
			switch(zhuangtai)
			{
			case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/Õ¾Á¢/×ó.gif"),x-Offsetx-118,y+Offsety-179,this);break;
			case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/Õ¾Á¢/ÓÒ.gif"),x-Offsetx-112,y+Offsety-179,this);break;
			case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/ÒÆ¶¯/×ó.gif"),x-Offsetx-123,y+Offsety-175,this);break;
			case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/ÒÆ¶¯/ÓÒ.gif"),x-Offsetx-110,y+Offsety-175,this);break;
			case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/±»¹¥»÷/×ó.png"),x-Offsetx-125,y+Offsety-207,this);break;
			case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/±»¹¥»÷/ÓÒ.png"),x-Offsetx-101,y+Offsety-207,this);break;
			case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/¹¥»÷/×ó.gif"),x-Offsetx-213,y+Offsety-202,this);break;
			case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¹ÖÎï/¿ÌÓ¡Ê¯Í·ÈË/¹¥»÷/ÓÒ.gif"),x-Offsetx-218,y+Offsety-202,this);break;
			}
			break;
		}
		}
		
		if(zhuangtai==4||zhuangtai==5)
		{
			HP-=DHP;
			System.out.printf("HP=%d\n",HP);
			Target=1;
			int DOffset=0;
			while(DHP>0)
			{
				switch(DHP%10)
				{
				case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/0.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=37;break;
				case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/1.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=25;break;
				case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/2.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=34;break;
				case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/3.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=33;break;
				case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/4.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/5.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=34;break;
				case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/6.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/7.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=33;break;
				case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/8.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Êý×Ö/¹¥»÷/9.png"),x-Offsetx-DOffset,y+Offsety-150,this);DOffset+=36;break;
				}
				DHP/=10;
			}
		}
		
	}
	
	
}
