package object;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Boss extends JPanel
{
	private int x;
	private int y;
	private int bx;
	private int by;
	private int xmax;
	private int xmin;
	private int Offsetx;
	private int Offsety;

	private int Stage;//½×¶Î
	private int HP;//Ñª/
	private int Round;//»ØºÏ
	private int atk;//¹¥»÷Á¦
	private int zhuangtai;
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
	public void paint(Graphics g)
	{
		switch(Stage)
		{
		case 0:
		{
			switch(zhuangtai)
			{
			case 0:
			case 1:
			}
		}
		case 1:
		case 2:
		case 3:
		case 4:
		}
	}
}
