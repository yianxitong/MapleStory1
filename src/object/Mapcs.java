package object;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class Mapcs extends JPanel
{
	//屏幕显示起点
	private int x=0;
	private int y=0;
	
	//人物位置
	private int renx=0;
	private int reny=0;
	
	private int mapNo=0;//地图编号
	
	public void setmapNo(int num)
	{
		mapNo=num;
		x=0;
		y=0;
		renx=0;
		reny=0;
	}
	
	//移动地图
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public void movey(int m_y)
	{
		y+=m_y;
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	//人物位置
	public void moverenx(int m_x)
	{
		renx+=m_x;
	}
	public void movereny(int m_y)
	{
		reny+=m_y;
	}
	public void setrenxy(int m_x,int m_y)
	{
		renx=m_x;
		reny=m_y;
	}
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	//获取人物位置
	public int getrenx()
	{
		return renx;
	}
	public int getreny()
	{
		return reny;
	}
	public int AllowMoveR()//可以向右
	{
		switch(mapNo)
		{
		case 0:
		{
			if(renx>3095)
				return 0;
			break;
		}
		case 1:
		{
			if(renx>=2170)
				return 0;
			break;
		}
		case 2:
		{
			if(renx>=2690
					||(renx>=1705&&renx<=1710&&reny<=425&&reny>365))
				return 0;
			break;
		}
		case 3:
		{
			if(renx>=1365)
				return 0;
			break;
		}
		case 4:
		{
			if(renx>=1570
					||(renx>=175&&renx<=180&&reny<=1310&&reny>1130)
					||(renx>=630&&renx<=635&&reny<=1130&&reny>1070))
				return 0;
			break;
		}
		case 5:
		{
			if(renx>=1650
					||(renx>=1150&&renx<=1160&&reny<=1570&&reny>1505))
				return 0;
			break;
		}
		case 6:
		{
			if(renx>=1365)
				return 0;
			break;
		}
		}
		return 1;
		
	}
	public int AllowMoveL()//可以向左
	{
		switch(mapNo)
		{
		case 0:
		{
			if(renx<0)
				return 0;
			break;
		}
		case 1:
		{
			if(renx<=0
					||(renx>=740&&renx<=760&&reny<=340&&reny>275)
					||(renx>=925&&renx<=940&&reny<=400&&reny>340))
				return 0;
			break;
		}
		case 2:
		{
			if(renx<=0)
				return 0;
			break;
		}
		case 3:
		{
			if(renx<=0)
				return 0;
			break;
		}
		case 4:
		{
			if(renx<=0
					||(renx>=1090&&renx<=1095&&reny<=830&&reny>770))
				return 0;
			break;
		}
		case 5:
		{
			if(renx<=0)
				return 0;
			break;
		}
		case 6:
		{
			if(renx<=0)
				return 0;
			break;
		}
		}
		return 1;
	}
	public int ToGround()//到地面
	{
		switch(mapNo)
		{
		case 0:
		{
			if(reny==790
					||(renx>=597&&renx<=736&&reny==757)
					||(renx>=600&&renx<=710&&reny==727)
					||(renx>=589&&renx<=694&&reny==695)
					||(renx>=586&&renx<=686&&reny==668)
					||(renx>=589&&renx<=677&&reny==643)
					||(renx>=594&&renx<=674&&reny==619)
					||(renx>=600&&renx<=682&&reny==595))
				return 0;
			break;
		}
		case 1:
		{
			if((renx>=925&&renx<=2173&&reny==400)
					||(renx>=760&&renx<=950&&reny==340)
					||(renx>=0&&renx<=770&&reny==275))
				return 0;
			break;
		}
		case 2:
		{
			if((renx>=1695&&renx<=2690&&reny==365)
					||(renx>=0&&renx<=1710&&reny==425))
				return 0;
			break;
		}
		case 3:
		{
			if((renx>=500&&renx<=1280&&reny==300)
					||(renx>=50&&renx<=1100&&reny==660)
					||(renx>=0&&reny<=1366&&reny==1020))
				return 0;
			break;
		}
		case 4:
		{
			if((renx>=0&&renx<=175&&reny==1310)
					||(renx>=0&&renx<=200&&reny==1010)
					||(renx>=170&&renx<=630&&reny==1130)
					||(renx>=620&&renx<=1573&&reny==1070)
					||(renx>=0&&renx<=1100&&reny==770)
					||(renx>=1095&&renx<=1573&&reny==830)
					||(renx>=0&&renx<=290&&reny==410)
					||(renx>=260&&renx<=650&&reny==110)
					||(renx>=620&&renx<=1573&&reny==290))
				return 0;
			break;
		}
		case 5:
		{
			if((renx>=0&&renx<=1150&&reny==1570)
					||(renx>=1145&&renx<=1651&&reny==1505)
					||(renx>=0&&renx<=1260&&reny==1270)
					||(renx>=380&&renx<=1265&&reny==970)
					||(renx>=1225&&renx<=1480&&reny==910)
					||(renx>=130&&renx<=710&&reny==900)
					||reny==670
					||(renx>=250&&renx<=520&&reny==535)
					||(renx>=490&&renx<=630&&reny==500)
					||(renx>=535&&renx<=690&&reny==460)
					||(renx>=570&&renx<=700&&reny==420)
					||(renx>=615&&renx<=770&&reny==385)
					||(renx>=190&&renx<=1430&&reny==350))
				return 0;
			break;
		}
		case 6:
		{
			if((renx>=0&&renx<=1366&&reny==1290)
					||(renx>=1235&&renx<=1366&&reny==930)
					||(renx>=695&&renx<=1170&&reny==870)
					||(renx>=140&&renx<=400&&reny==1055)
					||(renx>=385&&renx<=530&&reny==1015)
					||(renx>=435&&renx<=580&&reny==980)
					||(renx>=470&&renx<=600&&reny==935)
					||(renx>=520&&renx<=660&&reny==905)
					||(renx>=90&&renx<=600&&reny==880)
					||(renx>=95&&renx<=375&&reny==650)
					||(renx>=185&&renx<=370&&reny==500))
				return 0;
			break;
		}
		}
		return 1;
	}
	
	public MapSwitch MapSwitch()
	{
		switch(mapNo)
		{
		case 0:
		{
			if(renx>100&&renx<160&&reny==790)
				return new MapSwitch(1,1940,200); 
		}
		case 1:
		{
			if(renx>1905&&renx<1965&&reny==400)
				return new MapSwitch(0,130,740);
			if(renx>30&&renx<90&&reny==275)
				return new MapSwitch(2,2420,200);
			if(renx>825&&renx<885&&reny==340)
				return new MapSwitch(3,1155,250);
		}
		case 2:
		{
			if(renx>2395&&renx<2455&&reny==365)
				return new MapSwitch(1,60,220);
			if(renx>145&&renx<225&&reny==425)
				return new MapSwitch(6,95,1200);
		}
		case 3:
		{
			if(renx>1130&&renx<1190&&reny==300)
				return new MapSwitch(1,855,200);
		}
		case 4:
		{
			if(renx>20&&renx<75&&reny==1310)
				return new MapSwitch(2,185,200);
			if(renx>1385&&renx<1435&&reny==290)
				return new MapSwitch(5,115,1440);
		}
		case 5:
		{
			if(renx>90&&renx<=140&&reny==1570)
				return new MapSwitch(4,1410,240);
			if(renx>1175&&renx<1230&&reny==350)
				return new MapSwitch(6,95,1200);
		}
		case 6:
		{
			if((renx>70&&renx<130&&reny==1290))
				return new MapSwitch(5,1200,300);
		}
		}
		return new MapSwitch(0,0,0);
	}
	public int CanSwitch()
	{
		switch(mapNo)
		{
		case 0:
		{
			if(renx>100&&renx<160&&reny==790)
				return 1;
			break;
		}
		case 1:
		{
			if((renx>1905&&renx<1965&&reny==400)
					||(renx>30&&renx<90&&reny==275)
					||(renx>825&&renx<885&&reny==340))
				return 1;
			break;
		}
		case 2:
		{
			if((renx>2395&&renx<2455&&reny==365)
					||(renx>145&&renx<225&&reny==425))
				return 1;
			break;
		}
		case 3:
		{
			if(renx>1130&&renx<1190&&reny==300)
				return 1;
			break;
		}
		case 4:
		{
			if((renx>20&&renx<75&&reny==1310)
					||(renx>1385&&renx<1435&&reny==290))
				return 1;
			break;
		}
		case 5:
		{
			if((renx>90&&renx<=140&&reny==1570)
					||(renx>1175&&renx<1230&&reny==350))
				return 1;
			break;
		}
		case 6:
		{
			if((renx>70&&renx<130&&reny==1290))
				return 1;
			break;
		}
		}
		return 0;
	}
	
	public int CanShin()   //爬绳子
	{
		switch(mapNo)
		{
		case 3:
		{
			if((renx>=685&&renx<=710&&reny>=300&&reny<660)//695<x<700可能比较合适
					||(renx>=970&&renx<=995&&reny>=660&&reny<1020)
					||(renx>=240&&renx<=265&&reny>=660&&reny<1020))	
				return 1;
			break;
		}
		case 4:
		{
			if((renx>=100&&renx<=110&&reny>=1010&&reny<1245)
					||(renx>=1140&&renx<=1155&&reny>=830&&reny<995)
					||(renx>=1375&&renx<=1390&&reny>=290&&reny<770)
					||(renx>=110&&renx<=115&&reny>=410&&reny<700)
					||(renx>=330&&renx<=340&&reny>=110&&reny<395))
				return 1;
			break;
		}
		case 5:
		{
			if((renx>=425&&renx<=435&&reny>=1270&&reny<1490)
					||(renx>=1210&&renx<=1220&&reny>=970&&reny<1190)
					||(renx>=290&&renx<=300&&reny>=670&&reny<885)
					||(renx>=915&&renx<=920&&reny>=670&&reny<890)
					||(renx>=330&&renx<=335&&reny>=535&&reny<640))
				return 1;
			break;
		}
		case 6:
		{
			if((renx>=490&&renx<=500&&reny>=1015&&reny<1280)
					||(renx>=145&&renx<=155&&reny>=650&&reny<860)
					||(renx>=1290&&renx<=1300&&reny>=930&&reny<1270))
				return 1;
			break;
		}
		}
		return 0;
	}
	public void paint(Graphics g)
	{
		switch(mapNo)
		{
		case 0://女皇之路
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/圣地/女皇之路.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("女皇之路",0,10);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/树林/树林.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("树林",0,10);
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/边塞/边塞.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("边塞",0,10);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/要塞/要塞.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("要塞",0,10);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/上山路1/上山路1.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("上山路1",0,10);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/上山路2/上山路2.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("上山路2",0,10);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/地图/云海山巅/云海山巅.png"),x,y,this);
			g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),645,540);
			g.drawString("云海山巅",0,10);
			break;

		}
		}
	}
}
