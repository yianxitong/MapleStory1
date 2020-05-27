package object;
import java.awt.*;
import javax.swing.*;

public class Obj extends JPanel
{
	private int zhuangtai=2;//ÈËÎï×´Ì¬
	
	//ÆÁÄ»×ø±ê
	private int level; //ÈËÎïµÈ¼¶
	private int x;
	private int y;
	
	public void setzhuangtai(int a)//ÉèÖÃ×´Ì¬
	{
		zhuangtai=a;
	}
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	//ÈËÎïÔÚÆÁÄ»ÖĞÒÆ¶¯
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public void movey(int m_y)
	{
		y+=m_y;
	}
	
	//»ñÈ¡ÈËÎïÔÚµØÍ¼ÉÏµÄ×ø±ê
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public Obj(int m_x,int m_y)//ÈËÎï³õÊ¼ÆÁÄ»Î»ÖÃ
	{
		x=m_x;
		y=m_y;
	}
	
	public void paint(Graphics g)
	{
		
		switch(zhuangtai)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk"+"18"+".png"),x-30,y-68,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk21.png"),x-30,y-68,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk24.png"),x-30,y-68,this);break;
		case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk27.png"),x-30,y-68,this);break;
		case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk18_2.png"),x-30,y-68,this);break;
		case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk21_2.png"),x-30,y-68,this);break;
		case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk24_2.png"),x-30,y-68,this);break;
		case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/hero1_walk27_2.png"),x-30,y-68,this);break;
		case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Õ¾Á¢/hero1_walk18.png"),x-30,y-68,this);break;
		case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Õ¾Á¢/hero1_walk18_2.png"),x-30,y-68,this);break;
		case 10:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÌøÔ¾/hero1_321.png"),x-96,y-68,this);break;
		case 11:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÌøÔ¾/hero1_321_2.png"),x-86,y-68,this);break;
		case 12:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Å¿ÏÂ/Ãæ³¯×óÅ¿ÏÂ.png"),x-70,y-40,this);break;
		case 13:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Å¿ÏÂ/Ãæ³¯ÓÒÅ¿ÏÂ.png"),x,y-40,this);break;
		case 14:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk113_2.png"),x-90,y-70,this);break;
		case 15:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk115_2.png"),x-90,y-70,this);break;
		case 16:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk116_2.png"),x-90,y-70,this);break;
		case 17:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk118_2.png"),x-90,y-70,this);break;
		case 18:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk120_2.png"),x-90,y-70,this);break;
		case 19:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk125_2.png"),x-90,y-70,this);break;
		case 20:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk129_2.png"),x-90,y-70,this);break;
		case 21:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk131_2.png"),x-90,y-70,this);break;
		case 22:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk136_2.png"),x-90,y-70,this);break;
		case 23:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk113.png"),x-90,y-70,this);break;
		case 24:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk115.png"),x-90,y-70,this);break;
		case 25:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk116.png"),x-90,y-70,this);break;
		case 26:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk118.png"),x-90,y-70,this);break;
		case 27:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk120.png"),x-90,y-70,this);break;
		case 28:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk125.png"),x-90,y-70,this);break;
		case 29:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk129.png"),x-90,y-70,this);break;
		case 30:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk131.png"),x-90,y-70,this);break;
		case 31:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/¹¥»÷/hero1_atk136.png"),x-90,y-70,this);break;
		case 32:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÌÚ¿ÕÇ°Ìá/hero1_3_00082.png"),x-27,y-70,this);break;
		case 33:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÌÚ¿ÕÇ°Ìá/hero1_3_00083.png"),x-27,y-70,this);break;
		
		case 34:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00059.png"),x,y-70,this);break;
		case 35:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00062.png"),x,y-70,this);break;
		case 36:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00065.png"),x,y-70,this);break;
		case 37:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00067.png"),x,y-70,this);break;
		case 38:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00070.png"),x,y-70,this);break;
		case 39:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00078.png"),x,y-70,this);break;
		case 40:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00081.png"),x,y-70,this);break;
		case 41:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00059_2.png"),x,y-70,this);break;
		case 42:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00062_2.png"),x,y-70,this);break;
		case 43:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00065_2.png"),x,y-70,this);break;
		case 44:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00067_2.png"),x,y-70,this);break;
		case 45:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00070_2.png"),x,y-70,this);break;
		case 46:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00078_2.png"),x,y-70,this);break;
		case 47:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/ÉÏ¹´È­/shang/hero1_4_00081_2.png"),x,y-70,this);break;

		case 65:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00035.png"),x,y-130,this);break;
		case 66:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00037.png"),x,y-130,this);break;
		case 67:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00039.png"),x,y-130,this);break;
		case 68:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00041.png"),x,y-130,this);break;
		case 69:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00043.png"),x,y-130,this);break;
		case 70:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00045.png"),x,y-130,this);break;
		case 71:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00047.png"),x,y-130,this);break;
		case 72:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00049.png"),x,y-130,this);break;
		case 73:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00051.png"),x,y-130,this);break;
		case 74:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00053.png"),x,y-130,this);break;
		case 75:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00055.png"),x,y-130,this);break;
		case 76:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00057.png"),x,y-130,this);break;
		case 77:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00059.png"),x,y-130,this);break;
		case 78:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00061.png"),x,y-130,this);break;
		case 79:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/µ¹¹Ò½ğ¹³2/dao/1_6_00062.png"),x,y-130,this);break;
		
		case 80:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/½ğÉ«³åÈ­/chong/hero1_2_00071.png"),x,y-130,this);break;
		case 81:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/½ğÉ«³åÈ­/chong/hero1_2_00073.png"),x,y-130,this);break;
		case 82:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/½ğÉ«³åÈ­/chong/hero1_2_00075.png"),x,y-130,this);break;
		case 83:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/½ğÉ«³åÈ­/chong/hero1_2_00077.png"),x,y-130,this);break;
		case 84:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÂÌÉ«/½ğÉ«³åÈ­/chong/hero1_2_00079.png"),x,y-130,this);break;
		}
		g.drawString("ÆÁÄ»Î»ÖÃ£º"+"x="+Integer.toString(x)+"y="+Integer.toString(y),645,525);
	}
}
