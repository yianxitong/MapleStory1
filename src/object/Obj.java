package object;
import java.awt.*;
import javax.swing.*;

public class Obj extends JPanel
{
	private int zhuangtai=2;//����״̬
	
	//��Ļ����
	private int level; //����ȼ�
	private int x;
	private int y;
	
	public void setzhuangtai(int a)//����״̬
	{
		zhuangtai=a;
	}
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	//��������Ļ���ƶ�
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public void movey(int m_y)
	{
		y+=m_y;
	}
	
	//��ȡ�����ڵ�ͼ�ϵ�����
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public Obj(int m_x,int m_y)//�����ʼ��Ļλ��
	{
		x=m_x;
		y=m_y;
	}
	
	public void paint(Graphics g)
	{
		
		switch(zhuangtai)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk"+"18"+".png"),x-30,y-68,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk21.png"),x-30,y-68,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk24.png"),x-30,y-68,this);break;
		case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk27.png"),x-30,y-68,this);break;
		case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk18_2.png"),x-30,y-68,this);break;
		case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk21_2.png"),x-30,y-68,this);break;
		case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk24_2.png"),x-30,y-68,this);break;
		case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��·/hero1_walk27_2.png"),x-30,y-68,this);break;
		case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ��/hero1_walk18.png"),x-30,y-68,this);break;
		case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ��/hero1_walk18_2.png"),x-30,y-68,this);break;
		case 10:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ծ/hero1_321.png"),x-96,y-68,this);break;
		case 11:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��Ծ/hero1_321_2.png"),x-86,y-68,this);break;
		case 12:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ſ��/�泯��ſ��.png"),x-70,y-40,this);break;
		case 13:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/ſ��/�泯��ſ��.png"),x,y-40,this);break;
		case 14:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk113_2.png"),x-90,y-70,this);break;
		case 15:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk115_2.png"),x-90,y-70,this);break;
		case 16:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk116_2.png"),x-90,y-70,this);break;
		case 17:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk118_2.png"),x-90,y-70,this);break;
		case 18:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk120_2.png"),x-90,y-70,this);break;
		case 19:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk125_2.png"),x-90,y-70,this);break;
		case 20:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk129_2.png"),x-90,y-70,this);break;
		case 21:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk131_2.png"),x-90,y-70,this);break;
		case 22:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk136_2.png"),x-90,y-70,this);break;
		case 23:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk113.png"),x-90,y-70,this);break;
		case 24:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk115.png"),x-90,y-70,this);break;
		case 25:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk116.png"),x-90,y-70,this);break;
		case 26:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk118.png"),x-90,y-70,this);break;
		case 27:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk120.png"),x-90,y-70,this);break;
		case 28:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk125.png"),x-90,y-70,this);break;
		case 29:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk129.png"),x-90,y-70,this);break;
		case 30:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk131.png"),x-90,y-70,this);break;
		case 31:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/hero1_atk136.png"),x-90,y-70,this);break;
		case 32:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�ڿ�ǰ��/hero1_3_00082.png"),x-27,y-70,this);break;
		case 33:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�ڿ�ǰ��/hero1_3_00083.png"),x-27,y-70,this);break;
	//	case 34:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/���ҽ�2/���ҽ���.gif"),x,y-130,this);break;
	//	case 35:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/���ҽ�2/���ҽ���.gif"),x,y-130,this);break;
		case 34:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00057.png"),x,y-70,this);break;
		case 35:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00058.png"),x,y-70,this);break;
		case 36:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00059.png"),x,y-70,this);break;
		case 37:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00060.png"),x,y-70,this);break;
		case 38:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00061.png"),x,y-70,this);break;
		case 39:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00062.png"),x,y-70,this);break;
		case 40:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00063.png"),x,y-70,this);break;
		case 41:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00064.png"),x,y-70,this);break;
		case 42:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00065.png"),x,y-70,this);break;
		case 43:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00066.png"),x,y-70,this);break;
		case 44:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00067.png"),x,y-70,this);break;
		case 45:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00068.png"),x,y-70,this);break;
		case 46:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00069.png"),x,y-70,this);break;
		case 47:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00070.png"),x,y-70,this);break;
		case 48:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00071.png"),x,y-70,this);break;
		case 49:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00072.png"),x,y-70,this);break;
		case 50:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00073.png"),x,y-70,this);break;
		case 51:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00074.png"),x,y-70,this);break;
		case 52:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00075.png"),x,y-70,this);break;
		case 53:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00076.png"),x,y-70,this);break;
		case 54:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00077.png"),x,y-70,this);break;
		case 55:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00078.png"),x,y-70,this);break;
		case 56:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00079.png"),x,y-70,this);break;
		case 57:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00080.png"),x,y-70,this);break;
		case 58:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00081.png"),x,y-70,this);break;
		case 59:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00082.png"),x,y-70,this);break;
		case 60:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00083.png"),x,y-70,this);break;
		case 61:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00084.png"),x,y-70,this);break;
		case 62:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00085.png"),x,y-70,this);break;
		case 63:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00086.png"),x,y-70,this);break;
		case 64:g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/��ɫ/�Ϲ�ȭ/hero1_4_00087.png"),x,y-70,this);break;
		}
		g.drawString("��Ļλ�ã�"+"x="+Integer.toString(x)+"y="+Integer.toString(y),645,525);
	}
}
