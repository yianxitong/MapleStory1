package windows;


import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.PublicKey;

import javax.swing.*;

import org.jsfml.audio.Sound;
import org.jsfml.audio.SoundBuffer;
import org.jsfml.system.Clock;
import org.jsfml.system.Time;

import menu.Menu;
import object.*;
import dialog.*;
import allbutton.*;

public class MainWindow extends JFrame
{
	
	public static MainWindow MWD;
	/**���﷽��״̬
	 * 0=��
	 * 1=��
	 * */	
	private int Direction; 
	/**�������״̬
	 * 0=��
	 * 1=��
	 * */
	private int Drop=1;
	/**��Ծ�߳�״̬
	 * 0=δ����
	 * 1=������
	 * */
	private int jumping=0;	
	/**�����߳�״̬
	 * 0=δ����
	 * 1=������
	 * */	
	private int droping=0;
	/**
	 * �Ƿ��ƶ��߳�
	 * 0=��ֹ
	 * 1=�ƶ�
	 */
	private int moving=0;
	private int attacking=0;
	private int battacking=0;
	private int badirection=0;
	/**��ǰʹ�õ�ͼ���
	 * 0=Ů��֮·
	 * */
	private int mapNo=0;
	private int mapymax;//��ͼ���������ֵ
	private int mapxmax;//��ͼ���������ֵ
	private int progress=0;//��Ϸ����
	private boolean isSoundPlay=true;
	/********/
	private int NpcOffsetx=0;//NPCx��ƫ��
	private int NpcOffsety=0;//NPCy��ƫ��
	private int diax,diay;//�����¼�����Ա��϶�
	private int movetime=0;//�ƶ��ƴ�
	private int gwjc1=0;//����ƴ�1
	private int gwjc2=0;//����ƴ�2
	private int dmg;
	
	private Obj ren=new Obj(0,0);//������ɫ
	private TaskWindow taskw=new TaskWindow();
	private NpcDialog dialog=new NpcDialog();//�Ի���
	private DialogNextButton nextb=new DialogNextButton();//ȷ�ϰ�ť
	private DialogEndButton endb=new DialogEndButton();//ֹͣ�Ի���ť
	private SkillWindow skillw=new SkillWindow();//���ܿ�
	private EquipmentWindow equw=new EquipmentWindow();//װ����
//	private BackpackWindow backpackw=new BackpackWindow();//����
	private SetWindow set=new SetWindow();//���ð�ť
	
	private Mapcs map=new Mapcs();//��ͼ
	private NPC []npc=//����NPC
		{
			new NPC(0),new NPC(1),new NPC(2),new NPC(3),new NPC(4),new NPC(5),new NPC(6),new NPC(7)
		};
	private StatusBar statusbar=new StatusBar();//״̬��
	private SystemButton sysb=new SystemButton();//ϵͳ��ť
	private Menu menu=new Menu();//�˵�
	
	private SoundButton soundb=new SoundButton();//������ť
	
	private ButtonBase []menubutton=//�˵���ť
		{
			new EquipmentButton(),new BackpackButton(),
			new SkillButton(),new AbilityButton(),
			new TaskButton(),new KeySetButton(),
			new SaveButton()
		};
	public StatusBar getStatusBar()
	{
		return statusbar;
	}
	
	private Monster [][]gw=
		{
			{
				new Monster(0,1370,400,2170,925),new Monster(0,1800,400,2170,925),
				new Monster(0,560,275,760,0),new Monster(0,255,275,760,0)
			},
			{
				new Monster(1,2160,365,2680,1710),new Monster(1,2280,365,2680,1710),new Monster(1,1980,365,2680,1710),
				new Monster(1,1480,425,1700,0),new Monster(1,1130,425,1700,0),new Monster(1,550,425,1700,0)
			},
			{
				new Monster(2,650,300,1270,500),new Monster(2,930,300,1270,500),
				new Monster(2,210,660,1100,50),new Monster(2,500,660,1100,50),new Monster(2,720,660,1100,50),new Monster(2,960,660,1100,50),
				new Monster(3,340,1020,1365,0),new Monster(3,720,1020,1365,0),new Monster(5,1170,1020,1365,0)
			},
		};    //id,x,y,x-max,y-max
	private Monster newgw=null;//����������ʱ����
	private Thread DropTest=new Thread(new TestRunnable(0));//׹���߳�
	private Thread Jump=new Thread(new TestRunnable(1));//��Ծ�߳�
	private Thread Attack=new Thread(new TestRunnable(2));//�����߳�
	private Thread newMonster=new Thread(new TestRunnable(3));
	private Thread Newgw=new Thread(new TestRunnable(4));
	private Thread atLV10=new Thread(new TestRunnable(5));
	private Thread atMap4=new Thread(new TestRunnable(6));
	private Thread Battack=new Thread(new TestRunnable(7));
	private Thread MJump=new Thread(new TestRunnable(8));
	private Thread atMap5=new Thread(new TestRunnable(9));
	private Thread atMap6=new Thread(new TestRunnable(10));
	private Thread movesee=new Thread(new TestRunnable(11));
	private Thread Bgm=new Thread(new TestRunnable(13));
	private Thread skill1=new Thread(new TestRunnable(14));
	private Thread skill2=new Thread(new TestRunnable(15));
	private Thread skill3=new Thread(new TestRunnable(16));
	
	public MainWindow()//���촰��
	{	
		/**������
		 * ����˳���Ǵ��ϵ���
		 * */
		for(ButtonBase temp:menubutton)//�˵���ť
			add(temp);
		add(menu);//�˵����
		add(sysb);//ϵͳ��ť
		add(statusbar);//״̬��
		add(nextb);//ȷ�ϰ�ť
		add(endb);//ֹͣ�Ի���ť
		add(dialog);//�Ի���
		add(taskw);
		add(skillw);//������
		add(equw);//װ����
//		add(backpackw);//����
		add(soundb);
		add(set);
		
		
		for(NPC temp:npc)//NPC
			add(temp);
		add(ren);//����
		for(Monster []tempgwsz:gw)
		{
			for(Monster tempgw:tempgwsz)
				add(tempgw);
		}
		add(map);//��ͼ
		
		//���ó�ʼλ��
		ren.setBounds(0, 0, 806, 629);//����ȫ���ƶ�
		NPCshow();
		map.setBounds(0,0, 806, 629);//��ͼȫ���ƶ�
		statusbar.setBounds(0, 544, 800, 56);//״̬��
		sysb.setBounds(695, 555, 94, 37);//ϵͳ��ť
		menu.setBounds(692, 355, 100, 200);//�˵���
		for(int i=0;i<menubutton.length;i++)//�˵���ť
			menubutton[i].setBounds(695, 362+i*26, 94, 26);
		//��Ӽ���
		this.addKeyListener(new keypress());//�Դ��ڼ��̼�����������Ϳ�ݼ�
		sysb.addMouseListener(new mouselisten(0,7));//ϵͳ��ť������
		for(int i=0;i<menubutton.length;i++)//�˵���ť����
			menubutton[i].addMouseListener(new mouselisten(0,i));
		for(int i=0;i<npc.length;i++)
			npc[i].addMouseListener(new mouselisten(2,i));
		dialog.addMouseMotionListener(new mouselisten(3,0));
		dialog.addMouseListener(new mouselisten(3,0));
		nextb.addMouseListener(new mouselisten(0,8));
		endb.addMouseListener(new mouselisten(0,9));
		taskw.addMouseListener(new mouselisten(4,0));
		taskw.addMouseMotionListener(new mouselisten(4,0));
		soundb.addMouseListener(new mouselisten(1,0));

		
		dialog.setVisible(false);
		endb.setVisible(false);
		nextb.setVisible(false);
		//���ڳ�ʼ��
		this.setLayout(null);
		this.setTitle("Redemption");//���ڱ���
		this.setSize(806, 629);
		/**���ڴ�С
		 * ������800x600
		 * ����״̬����ʾ��ȫ����
		 * ����800x600�Ĵ���ģʽ
		 * ����Ų��һ��Ȼһ����
		 * */
		this.setResizable(false);//�̶����ڴ�С
		this.setVisible(true);//��ʾ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ȷ��������ȷ�˳�����
		new Thread(Bgm).start();
		
		gomap(1500,450);//Ů��֮· 1500,300
	}
	
	public boolean changeStateOfSound() {
		isSoundPlay=!isSoundPlay;
		return !isSoundPlay;
	}
	
	public void gomap(int x,int y)//�����ͼ �л���ͼʱ��Ҫ����ͼһ����ʼλ��
	{
		/**
		 * ȱ�ݣ�
		 * ���ܿ�����������Ļ�е�λ��
		 * ����ά�������������
		 * */
		map.setmapNo(mapNo);//�л���ͼ
		switch(mapNo)
		{
		case 0:
		{
			mapymax=941;
			mapxmax=3095;
			//new Thread(newMonster).start();
			break;
		}
		case 1:
		{
			mapymax=535;
			mapxmax=2170;
			new Thread(newMonster).start();
			break;
		}
		case 2:
		{
			mapymax=522;
			mapxmax=2690;
			new Thread(newMonster).start();
			break;
		}
		case 3:
		{
			mapymax=1132;
			mapxmax=1365;
			new Thread(newMonster).start();
			break;
		}
		case 4:
		{
			mapymax=1422;
			mapxmax=1573;
			new Thread(newMonster).start();
			break;
		}
		case 5:
		{
			mapymax=1676;
			mapxmax=1651;
			new Thread(newMonster).start();
			break;
		}
		case 6:
		{
			mapymax=1405;
			mapxmax=1366;
			break;
		}
		}
		
		ren.setxy((x>mapxmax-403?x-mapxmax+806:(x<806?x:403)),y>mapymax-315?y-mapymax+629:(y<629?y:315));
		//map.moverenx(x>mapxmax-403?mapxmax-806:(x<806?0:x-403));
		//map.moverenx(x);
	//	map.movereny(y);
		map.setrenxy(x, y);
		//map.movex(-x);
		map.setxy(-(x>mapxmax-403?mapxmax-806:(x<806?0:x-403)),-(y>mapymax-315?mapymax-629:(y<629?0:y-315)));
		//map.movex(x>mapxmax-403?mapxmax-806:(x<806?0:x-403));
		//map.movey(-y);
		NpcOffsetx=x>mapxmax-403?mapxmax-806:(x<806?0:x-403);
		NpcOffsety=-(y>mapymax-315?mapymax-629:(y<629?0:y-315));
		menu.setVisible(false);
		for(ButtonBase temp:menubutton)//�˵���ť
			temp.setVisible(false);
		MainWindow.this.repaint();
		new Thread(DropTest).start();
	}
	public void NPCshow()//��ʾNPC
	{
		switch(mapNo)
		{
		case 0:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(true);
			npc[0].setBounds(2350-NpcOffsetx,720+NpcOffsety,123,101);
			npc[1].setBounds(1300-NpcOffsetx,695+NpcOffsety,170,120);//����
			npc[2].setBounds(732-NpcOffsetx,515+NpcOffsety,97,103);
			npc[3].setBounds(465-NpcOffsetx,705+NpcOffsety,97,109);
			npc[4].setBounds(788-NpcOffsetx,695+NpcOffsety,78,122);
			npc[5].setBounds(302-NpcOffsetx,420+NpcOffsety,77,116);
			npc[6].setBounds(663-NpcOffsetx,635+NpcOffsety,77,119);
			break;
		}
		case 1:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			for(Monster tempgw:gw[0])
				tempgw.setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			//gw[0][0].setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			//gw[0][1].setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			break;
		}
		case 2:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			for(Monster tempgw:gw[1])
				tempgw.setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			break;
		}
		case 3:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			for(Monster tempgw:gw[2])
				tempgw.setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			break;
		}
		case 4:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			for(Monster tempgw:gw[3])
				tempgw.setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			break;
		}
		case 5:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			for(Monster tempgw:gw[4])
				tempgw.setBounds(map.getx(), map.gety(), mapxmax, mapymax);
			break;
		}
		case 6:
		{
			for(int i=0;i<7;i++)
				npc[i].setVisible(false);
			npc[7].setBounds(300-NpcOffsetx,230+NpcOffsety,78,91);//��
			break;
		}
		}
	}
	public void movesee(int m)
	{
		System.out.printf("��ͼ�ƶ�����\n");
			ren.setVisible(false);
			int i=m;
			//����
			while(i-->0)
			{
				try
				{
					Thread.sleep(3);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				/*if(ren.gety()>=100||map.getreny()<=100)
					ren.movey(-1);
				else 
				{*/
					map.movey(1);
					NpcOffsety+=1;
				//}
				//map.movereny(-1);
				NPCshow();
				MainWindow.this.repaint();
			}
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			//����
			while(i++<m)
			{
				try
				{
					Thread.sleep(3);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				/*if(ren.gety()>=100||map.getreny()<=100)
					ren.movey(-1);
				else 
				{*/
					map.movey(-1);
					NpcOffsety-=1;
				//}
				//map.movereny(-1);
				NPCshow();
				MainWindow.this.repaint();
			}
			ren.setVisible(true);
			if(progress==35)
			{
				dialog.setDialog(7,progress);
				dialog.setBounds(145+0, 120+0, 515, 180);
				nextb.setBounds(475+145, 160+120, 37, 20);
				endb.setBounds(5+145, 160+120, 90, 20);
				dialog.setVisible(true);
				endb.setVisible(false);
				nextb.setVisible(true);
			}
			if(progress==39)
			{
				dialog.setDialog(7,progress);
				dialog.setBounds(145+0, 120+0, 515, 180);
				nextb.setBounds(475+145, 160+120, 37, 20);
				endb.setBounds(5+145, 160+120, 90, 20);
				dialog.setVisible(true);
				endb.setVisible(false);
				nextb.setVisible(true);
			}
	}
	
	public class TestRunnable  implements Runnable//�߳��ڲ���
	{
		private int Note;/**ִ�б�ǩ
		 * 0=��׹
		 * 1=��Ծ
		 * 2=����
		 * 3=����
		 * */
		public TestRunnable(int num)//�����ǩ
		{
			Note=num;
		}
		public void run() 
		{
			switch(Note)
			{
			case 0:
			{	
				if(droping==0)//ȷ��ͬһʱ��ִֻ��һ����׹�߳�
				{
					droping=1;//�����Ѿ�����׹
					jumping=1;//��׹�н�ֹ��Ծ
					if(Drop!=2)
					Drop=map.ToGround();
					while(Drop==1)
					{
						if(attacking==0)
						ren.setzhuangtai(Direction==0?11:10);
						try
						{
							Thread.sleep(3);
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
						if(ren.gety()<=430/*||map.getreny()>=mapymax-200*/)
							ren.movey(1);
						else 
						{
							map.movey(-1);
							NpcOffsety-=1;
						}
						map.movereny(1);
						Drop=map.ToGround();
						NPCshow();
						MainWindow.this.repaint();
						if(attacking==0)
						ren.setzhuangtai(Direction==0?9:8);
					}
					droping=0;//��׹����
					jumping=0;//��Ծ����
					//MainWindow.this.repaint();
				}
				break;
			}
			case 1:
			{
				if(jumping==0)//ȷ��ͬһʱ��ֻ��ִ��һ����Ծ�߳�
				{
					jumping=1;//����������Ծ
					Drop=1;//�����������뿪����
					droping=1;//��Ծ��;��ֹ������׹�߳�
					for(int i=0;i<100;i++)
					{
						try
						{
							Thread.sleep(3);
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
						if(ren.gety()>=100||map.getreny()<=100)
							ren.movey(-1);
						else 
						{
							map.movey(1);
							NpcOffsety+=1;
						}
						map.movereny(-1);
						NPCshow();
						MainWindow.this.repaint();
					}
					try
					{
						Thread.sleep(5);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					droping=0;//������׹
					new Thread(DropTest).start();//������׹
				}
				break;
			}
			case 2:
			{
				if(attacking==0)
				{
					attacking=1;
				for(int attacktime=0;attacktime<9;attacktime++)
				{
					
					ren.setzhuangtai(Direction==0?attacktime+14:attacktime+23);
					//MainWindow.this.repaint();
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					MainWindow.this.repaint();
				}
				attacking=0;
				ren.setzhuangtai(Direction==0?9:8);
				}
				break;
			}
			case 3:
			{
				switch(mapNo)
				{
				case 0:break;
				case 1:
				case 2:
				case 3:
				case 5:
				{		
					int m_No=mapNo;
					for(Monster tempgw:gw[mapNo-1])
						tempgw.setVisible(true);
					while(mapNo==m_No)
					{
						for(Monster tempgw:gw[mapNo-1])
						{
							if(!(
									attacking==1&&
									(Direction==0?((tempgw.getx()<=map.getrenx()&&tempgw.getx()>=map.getrenx()-115)?1:0):
										          ((tempgw.getx()>=map.getrenx()&&tempgw.getx()<=map.getrenx()+115)?1:0))==1&&  //����ˮƽ�����ϱ�������Χ�ж�  
									(tempgw.gety()<=map.getreny()&&tempgw.gety()>=map.getreny()-100) // �������ݷ��򱻹�����Χ
								)  
							  )
							{
								if(tempgw.getTarget()==0)  //�ַǹ���״̬
								{
									switch((int)(Math.random()*1000)%6)
									{
									case 0:tempgw.setzhuangtai(0);break;
									case 1:tempgw.setzhuangtai(1);break;
									case 2:
									case 3:
										{for(int i=0;i<10;i++)
											{
											if(tempgw.getx()>=tempgw.getxmin()) 
												tempgw.movex(-2); 
											if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10)
											    {
												dmg = tempgw.getAtk();
												statusbar.battack(dmg);
												new Thread(Battack).start();
												badirection=1;
												}
											tempgw.setzhuangtai(2); 
											MainWindow.this.repaint();
											}
										break;
										}
									case 4:
									case 5:
										{for(int i=0;i<10;i++)
											{if(tempgw.getx()<=tempgw.getxmax()) 
												tempgw.movex(2);
											if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10)
											{
												dmg = tempgw.getAtk();
												statusbar.battack(dmg);
												new Thread(Battack).start();
												badirection=0;
												} 
											tempgw.setzhuangtai(3); 
											MainWindow.this.repaint();}
										break;
										}
									}
									//tempgw.setzhuangtai((int)(Math.random()*1000)%4);
								} //�Ӵ�����
								else
								{
							
									switch(tempgw.getx()>map.getrenx()?2:3)
									{
									case 2:
									{
										if(tempgw.getx()-100<=map.getrenx()) {
											tempgw.setzhuangtai(6);
											dmg = tempgw.getAtk();
											statusbar.battack(dmg);
										}
										else if(tempgw.getx()>=tempgw.getxmin()) 
										{
											for(int i=0;i<5;i++)
											{
												tempgw.movex(-2);
												if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10)
												{
													dmg = tempgw.getAtk();
													statusbar.battack(dmg);
													new Thread(Battack).start();
													badirection=1;
												}
												tempgw.setzhuangtai(2);MainWindow.this.repaint();
											}
										}
										break;
									}
									case 3:
									{
										if(tempgw.getx()+100>=map.getrenx()) 
											{
											    tempgw.setzhuangtai(7);
											    dmg = tempgw.getAtk();
												statusbar.battack(dmg);
											}
										else if(tempgw.getx()<=tempgw.getxmax()) 
										{
											for(int i=0;i<5;i++)
											{
												tempgw.movex(2);
												if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10)
												{
													dmg = tempgw.getAtk();
													statusbar.battack(dmg);
													new Thread(Battack).start();badirection=0;
												}
												tempgw.setzhuangtai(3);MainWindow.this.repaint();
											}
										}
										break;
									}
									}
									
									//tempgw.setzhuangtai(tempgw.getx()>map.getrenx()?2:3);
								}   //���﹥��״̬
								try
								{
									Thread.sleep(100);
								}
								catch(Exception e1)
								{
									e1.printStackTrace();
								}
								MainWindow.this.repaint();
							}
							else
							{
								switch(Direction==0?5:4)
								{
								case 5:if(tempgw.getx()>=tempgw.getxmin()) tempgw.movex(-5);tempgw.setzhuangtai(5);break;
								case 4:if(tempgw.getx()<=tempgw.getxmax()) tempgw.movex(5);tempgw.setzhuangtai(4);break;
								}     //������
								//tempgw.setzhuangtai(Direction==0?5:4);
								tempgw.Battack(statusbar.getatk()+(int)(Math.random()*100));
								try
								{
									Thread.sleep(700);
								}
								catch(Exception e1)
								{
									e1.printStackTrace();
								}
								MainWindow.this.repaint();
								if(tempgw.getHP()<=0)
								{
									tempgw.setVisible(false);
									statusbar.addexp(tempgw.NewMonster());
									newgw=tempgw;
									new Thread(Newgw).start();
								}
							}
						}
					}
					for(Monster tempgw:gw[m_No-1])
						tempgw.setVisible(false);
					break;
				}
				case 4:
				{
					if(progress>=32)
						break;
					int m_No=mapNo;
					for(Monster tempgw:gw[mapNo-1])
						tempgw.setVisible(true);
					while(mapNo==m_No)
					{
						for(Monster tempgw:gw[mapNo-1])
						{
							switch(tempgw.getx()>map.getrenx()?2:3)
							{
							case 2:
							{
								if(tempgw.getx()>=tempgw.getxmin()) 
								{for(int i=0;i<5;i++)
								{
									tempgw.movex(-1);
									if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10)
									{
										new Thread(Battack).start();
										badirection=1;
										}
									tempgw.setzhuangtai(2);MainWindow.this.repaint();
								}
								}
								break;
							}
							case 3:
							{
								
								if(tempgw.getx()<=tempgw.getxmax()) 
								{for(int i=0;i<5;i++){tempgw.movex(1);if(tempgw.gety()==map.getreny()&&tempgw.getx()>=map.getrenx()-10&&tempgw.getx()<=map.getrenx()+10){new Thread(Battack).start();badirection=0;};tempgw.setzhuangtai(3);MainWindow.this.repaint();}}
								break;
							}
							}
							try
							{
								Thread.sleep(5);
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
							}
						
						}
						
					}
					for(Monster tempgw:gw[m_No-1])
						tempgw.setVisible(false);
					break;
				}
				
			}
				break;
			}
			case 4:
			{
				int tempmapNo=mapNo;
				Monster tempgw=newgw;
				if(progress==10)
				{
					switch(tempgw.getID())
					{
					case 0:gwjc1++;break;
					case 1:gwjc2++;break;
					}
					if(gwjc1>=30&&gwjc2>=30)
					{
						progress=11;                
						gwjc1=0;
						gwjc2=0;
					}
				}
				if(progress==14)
				{
					switch(tempgw.getID())
					{
					case 2:gwjc1++;break;
					case 3:gwjc2++;break;
					}
					if(gwjc1>=30&&gwjc2>=30)
					{
						progress=15;
						gwjc1=0;
						gwjc2=0;
					}
				}
				if(progress==31)
				{
					if(tempgw.getID()==5)
					gwjc1++;
					if(gwjc1>=30)
					{
						progress=32;
						gwjc1=0;
						gwjc2=0;
					}
				}
				try
				{
					Thread.sleep(5000);
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				if(tempmapNo==mapNo)
					tempgw.setVisible(true);
				break;
			}
			case 5:
			{
				while(statusbar.getLV()<10)
				{
					try
					{
						Thread.sleep(5000);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
				if(progress==6)
				progress=7;
				break;
			}
			case 6:
			{
				while(mapNo!=4)
				{
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
				if(progress==19)
					{progress=20;movesee(800);}
					break;
			}
			case 7:
			{
				if(battacking==0)
				{
					battacking=1;
					Direction=badirection;
					int i=15;
					ren.setzhuangtai(Direction==0?11:10);
					new Thread(Jump).start(); 
					switch(badirection)
					{
					case 0:
					{
						while(i--!=0)
						{
						if(map.AllowMoveR()==1)
						{
							if(ren.getx()<=600||map.getrenx()>mapxmax-200)
							{
								ren.movex(5);
								map.moverenx(5);
							}
							else
							{
								map.movex(-5);
								map.moverenx(5);
								NpcOffsetx+=5;
								NPCshow();
							}
						}
						try
						{
							Thread.sleep(50);
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
						}
						break;
					}
					case 1:
					{
						while(i--!=0)
						{
						if(map.AllowMoveL()==1)
						{
							//if(ren.getx()<=600||map.getrenx()>mapxmax-200)
							if(ren.getx()>=200||map.getrenx()<210)
							{
								ren.movex(-5);
								map.moverenx(-5);
							}
							else
							{
								map.movex(5);
								map.moverenx(-5);
								NpcOffsetx-=5;
								NPCshow();
							}
						}
						try
						{
							Thread.sleep(50);
						}
						catch(Exception e1)
						{
							e1.printStackTrace();
						}
						}
						break;
					}
				}
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					battacking=0;
				}
				break;
			}	
			case 8:
			{
				if(moving==1)
				{
					int i=23;
					new Thread(Jump).start();
					switch(Direction)
					{
					case 0:
					{
						while(i--!=0)
						if(map.AllowMoveL()==1)
						{
							//if(ren.getx()<=600||map.getrenx()>mapxmax-200)
							if(ren.getx()>=200||map.getrenx()<210)
							{
								ren.movex(-5);
								map.moverenx(-5);
							}
							else
							{
								map.movex(5);
								map.moverenx(-5);
								NpcOffsetx-=5;
								NPCshow();
							}
							try
							{
								Thread.sleep(50);
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
							}
							MainWindow.this.repaint();
						}
						break;
					}
					case 1:
					{
						while(i--!=0)
						if(map.AllowMoveR()==1)
						{
							if(ren.getx()<=600||map.getrenx()>mapxmax-200)
							{
								ren.movex(5);
								map.moverenx(5);
							}
							else
							{
								map.movex(-5);
								map.moverenx(5);
								NpcOffsetx+=5;
								NPCshow();
							}
							try
							{
								Thread.sleep(50);
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
							}
							MainWindow.this.repaint();
						}
						break;
					}
					}
				}
				break;
			}
			case 9:
			{
				while(mapNo!=5)
				{
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
				if(progress==28)
					{progress=29;movesee(800);}
					break;
			}
			case 10:
			{
				while(mapNo!=6)
				{
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
				if(progress==34)
					{progress=35;movesee(800);}
					break;
			}
			case 11:
			{		
				movesee(800);
				break;
			}
			case 12:
			{
				//��
				
			}
			
			case 13:
			{
				Time ZERO = null;
				Time d = ZERO.getSeconds(14);
				SoundBuffer bgm = new SoundBuffer();
				try {
				    bgm.loadFromFile(Paths.get("�����ز�","2.wav"));
//				    d = bgm.getDuration();
//				    System.out.print(d);
				} catch(IOException ex) {
				    ex.printStackTrace();
				}
				//Create a sound and set its buffer
				Sound sound = new Sound();
				sound.setBuffer(bgm);
				sound.play();
				Clock c = new Clock();
				long s =  c.getElapsedTime().asMilliseconds();
				while(true) {
					if(isSoundPlay) {
						if(c.getElapsedTime().asMilliseconds()==(s+15000)) {
							c.restart();
							s=c.getElapsedTime().asMilliseconds();
							sound.play();
						}			
					}
					else {
						sound.pause();
						}
				}
			}
			case 14:
			{
				if(attacking==0)
				{
					attacking=1;
				for(int attacktime=0;attacktime<7;attacktime++)
				{
					
					ren.setzhuangtai(Direction==0?attacktime+41:attacktime+34);

					try
					{
						Thread.sleep(100);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					MainWindow.this.repaint();
				}
				attacking=0;
				ren.setzhuangtai(Direction==0?9:8);
				}
				break;
			}
			case 15:
			{
				if(attacking==0)
				{
					attacking=1;
				for(int attacktime=0;attacktime<13;attacktime++)
				{
					
					ren.setzhuangtai(Direction==0?attacktime+78:attacktime+65);

					try
					{
						Thread.sleep(100);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					MainWindow.this.repaint();
				}
				attacking=0;
				ren.setzhuangtai(Direction==0?9:8);
				}
				break;
			}
			case 16:
			{
				if(attacking==0)
				{
					attacking=1;
				for(int attacktime=0;attacktime<9;attacktime++)
				{
					
					ren.setzhuangtai(Direction==0?attacktime+100:attacktime+91);
	
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					MainWindow.this.repaint();
				}
				attacking=0;
				ren.setzhuangtai(Direction==0?9:8);
				}
				break;
			}
		}	
		}
	}
	public class mouselisten implements MouseListener,MouseMotionListener//������
	{
		private int assembly;/**���
		 * 0=��ť
		 * 1=����
		 * 2=NPC
		 * 3=�Ի���
		 * 4=�����
		 */
		private int menu_num;/**�˵���ʶ
		 * 0=����װ��
		 * 1=��Ʒ����
		 * 2=���＼��
		 * 3=��������
		 * 4=������Ϣ
		 * 5=��������
		 * 6=����浵
		 * 7=ϵͳ��ť
		 * 8=�Ի���ȷ��
		 * 9=�Ի���ֹͣ�Ի�
		 */
		public mouselisten(int a,int b)//�����������
		{
			assembly=a;
			menu_num=b;
		}
		public void mouseClicked(MouseEvent e){}//��굥�� 		
		public void mousePressed(MouseEvent e)//��갴��
		{
			switch(assembly)
			{
			case 0:	//��ť
			{
				switch(menu_num)
				{
				case 0:case 1:case 2:case 3:case 4:case 5:case 6:
				{
					menubutton[menu_num].setstate(2);
					MainWindow.this.repaint();
					break;
				}
				case 7:
				{
					sysb.setstate(2);
					MainWindow.this.repaint();
					break;
				}
				case 8:
				{
					nextb.setstate(2);
					MainWindow.this.repaint();
					break;
				}
				case 9:
				{
					endb.setstate(2);
					MainWindow.this.repaint();
					break;
				}
				}
				break;
			}
			case 1:
			{
			}
			case 2:
			{
				dialog.setDialog(menu_num,progress);
				dialog.setBounds(145+0, 120+0, 515, 180);
				nextb.setBounds(475+145, 160+120, 37, 20);
				endb.setBounds(5+145, 160+120, 90, 20);
				if((progress==0&&menu_num==1)
						||(progress==1&&menu_num==1)
						||(progress==2&&(menu_num>=2&&menu_num<=6))
						||(progress==3&&menu_num==1)
						||(progress==4&&menu_num==1)
						||(progress==5&&menu_num==1)
						||(progress==7&&menu_num==1)
						||(progress==8&&menu_num==1)
						||(progress==9&&menu_num==1)
						||(progress==11&&menu_num==1)
						||(progress==12&&menu_num==1)
						||(progress==13&&menu_num==1)
						||(progress==15&&menu_num==1)
						||(progress==16&&menu_num==1)
						||(progress==17&&menu_num==1)
						||(progress==18&&menu_num==1)
						||(progress==20&&menu_num==1)
						||(progress==21&&menu_num==1)
						||(progress==22&&menu_num==1)
						||(progress==23&&menu_num==1)
						||(progress==24&&menu_num==1)
						||(progress==25&&menu_num==1)
						||(progress==26&&menu_num==1)
						||(progress==27&&menu_num==1)
						||(progress==29&&menu_num==1)
						||(progress==30&&menu_num==1)
						||(progress==32&&menu_num==1)
						||(progress==33&&menu_num==1)
						)
					nextb.setVisible(true);
				else
					nextb.setVisible(false);
				endb.setVisible(true);
				dialog.setVisible(true);
				MainWindow.this.repaint();
				break;
			}
			case 3:case 4:
			{
				diax=e.getX();
				diay=e.getY();
				break;
			}
			}
		}
		public void mouseReleased(MouseEvent e)//����ͷ�
		{
			switch(assembly)
			{
			case 0://ϵͳ��ť
			{
				switch(menu_num)
				{
				case 3:case 6:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
					break;
				}
				case 0:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
					equw.setVisible(!equw.ChangeDisplay());
					equw.setBounds(200,200,200,300);
					break;
				}
			  /*case 1:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
					backpackw.setVisible(!backpackw.ChangeDisplay());
					backpackw.setBounds(200,200,200,300);
					break;
				}*/
				case 2:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
					skillw.setVisible(!skillw.ChangeDisplay());
					skillw.setBounds(200,200,200,300);
					break;
				}
				case 4:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
					taskw.setProgress(progress);
					taskw.setVisible(!taskw.ChangeDisplay());
					taskw.setBounds(200,200,200,300);
					break;
				}
				case 5:
				{
					menubutton[menu_num].setstate(0);
					MainWindow.this.repaint();
			/*		soundb.setVisible(!soundb.ChangeDisplay());
					soundb.setBounds(350,200,200,300);
					set.setVisible(!set.ChangeDisplay());
					set.setBounds(300,100,200,300);					
			*/
					break;
				}
				case 7:
				{
				sysb.setstate(0);
				if(menu.getstate()==0)
				{
					menu.setstate(1);
					menu.setVisible(true);
					for(ButtonBase temp:menubutton)
						temp.setVisible(true);
				}
				else
				{
					menu.setstate(0);
					menu.setVisible(false);
					for(ButtonBase temp:menubutton)
						temp.setVisible(false);
				}
				MainWindow.this.repaint();
				break;
				}
				case 8:
				{
					nextb.setstate(0);
					progress++;
					System.out.printf("��ǰ���ȣ�%d\n",progress);
					dialog.setVisible(false);
					endb.setVisible(false);
					nextb.setVisible(false);
					MainWindow.this.repaint();
					if(progress==1) statusbar.addexp(999999);
					if(progress==3) statusbar.addexp(999999);
					if(progress==4) statusbar.addexp(999999);
					if(progress==5) statusbar.addexp(999999);
					if(progress==6)
					{
						new Thread(atLV10).start();
					}
					if(progress==8) statusbar.addexp(9500);
					if(progress==9) statusbar.addexp(999999);
					if(progress==12) statusbar.addexp(999999);
					if(progress==13) statusbar.addexp(999999);
					if(progress==16) statusbar.addexp(999999);
					if(progress==17) statusbar.addexp(999999);
					if(progress==18) statusbar.addexp(999999);
					if(progress==19) 
						new Thread(atMap4).start();
					if(progress==21) statusbar.addexp(999999);
					if(progress==22) statusbar.addexp(999999);
					if(progress==23) statusbar.addexp(999999);
					if(progress==24) statusbar.addexp(999999);
					if(progress==25) statusbar.addexp(999999);
					if(progress==26) statusbar.addexp(999999);
					if(progress==28)
						new Thread(atMap5).start();
					if(progress==34)
						new Thread(atMap6).start();
					if(progress==36)
					{
						dialog.setDialog(7,progress);
						dialog.setBounds(145+0, 120+0, 515, 180);
						nextb.setBounds(475+145, 160+120, 37, 20);
						endb.setBounds(5+145, 160+120, 90, 20);
						dialog.setVisible(true);
						endb.setVisible(false);
						nextb.setVisible(true);
					}
					if(progress==37)
					{
						dialog.setDialog(8,progress);
						dialog.setBounds(145+0, 120+0, 515, 180);
						nextb.setBounds(475+145, 160+120, 37, 20);
						endb.setBounds(5+145, 160+120, 90, 20);
						dialog.setVisible(true);
						endb.setVisible(false);
						nextb.setVisible(true);
					}
					if(progress==38)
					{
						dialog.setDialog(8,progress);
						dialog.setBounds(145+0, 120+0, 515, 180);
						nextb.setBounds(475+145, 160+120, 37, 20);
						endb.setBounds(5+145, 160+120, 90, 20);
						dialog.setVisible(true);
						endb.setVisible(false);
						nextb.setVisible(true);
					}
					if(progress==39)
					{
						new Thread(movesee).start();
					}
					if(progress==40)
					{
						System.out.printf("chengg\n");
					}
						
						
					break;
				}
				case 9:
				{
					endb.setstate(0);
					dialog.setVisible(false);
					endb.setVisible(false);
					nextb.setVisible(false);
					MainWindow.this.repaint();
					break;
				}
				}
				break;
			}
			case 1:
			{
			//	soundb.changeState();
			//	changeStateOfSound();
				break;
			}
			}
		}
		public void mouseEntered(MouseEvent e)//������
		{
			switch(assembly)
			{
			case 0:
			{
				switch(menu_num)
				{
				case 0:case 1:case 2:case 3:case 4:case 5:case 6:
				{
					menubutton[menu_num].setstate(1);
					MainWindow.this.repaint();
					break;
				}
				case 7:
				{
					sysb.setstate(1);
					MainWindow.this.repaint();
					break;
				}
				case 8:
				{
					nextb.setstate(1);
					MainWindow.this.repaint();
					break;
				}
				case 9:
				{
					endb.setstate(1);
					MainWindow.this.repaint();
					break;
				}
				}
				break;
			}
			
			}
		}
		public void mouseExited(MouseEvent e)//����뿪
		{
			switch(assembly)
			{
			case 0://ϵͳ��ť
			{
				{
					switch(menu_num)
					{
					case 0:case 1:case 2:case 3:case 4:case 5:case 6:
					{
						menubutton[menu_num].setstate(0);
						MainWindow.this.repaint();
						break;
					}
					case 7:
					{
						sysb.setstate(0);
						MainWindow.this.repaint();
						break;
					}
					case 8:
					{
						nextb.setstate(0);
						MainWindow.this.repaint();
						break;
					}
					case 9:
					{
						endb.setstate(0);
						MainWindow.this.repaint();
						break;
					}
					}
				}
				break;
			}
			
			}
		}

		public void mouseDragged(MouseEvent e)//�����϶�
		{
			switch(assembly)
			{
			case 3:
			{
				//�ưɣ������Ļλ��-����λ��=����ڴ����ڵ�������꣬�ټ�ȥ�������ʱ��ȡ����Ļ���� ����ʵ�ֶ����϶���
				dialog.setBounds(e.getXOnScreen()-MainWindow.this.getX()-diax,e.getYOnScreen()-MainWindow.this.getY()-diay, 515, 180);
				nextb.setBounds(e.getXOnScreen()-MainWindow.this.getX()-diax+475, e.getYOnScreen()-MainWindow.this.getY()-diay+160, 37, 20);
				endb.setBounds(e.getXOnScreen()-MainWindow.this.getX()-diax+5, e.getYOnScreen()-MainWindow.this.getY()-diay+160, 90, 20);
				MainWindow.this.repaint();
				break;
			}
			case 4:
			{
				taskw.setBounds(e.getXOnScreen()-MainWindow.this.getX()-diax,e.getYOnScreen()-MainWindow.this.getY()-diay, 200, 300);
				MainWindow.this.repaint();
				break;
			}
			}
		}
		public void mouseMoved(MouseEvent e) 
		{
		}
		
		
	}
	public class keypress extends KeyAdapter//���̼���
	{
		public void keyPressed(KeyEvent e)//���¡���ס
		{
			if(e.getKeyCode()==KeyEvent.VK_W)//�� ������
			{
				/*if(ren.gety()>=100||map.getreny()<=100)
					ren.movey(-5);
				else 
				{
					map.movey(5);
					NpcOffsety+=5;
				}
				map.movereny(-5);
				NPCshow();*/
				if(map.CanSwitch()==1)
				{
					int no;
					int x;
					int y;
					MapSwitch a=map.MapSwitch();
					no=a.MapNo;
					x=a.x;
					y=a.y;
					mapNo=no;
					gomap(x,y);
					//System.out.printf("x=%d y=%d\n",x,y);
				}
				if(map.CanShin()==1)
				{
						Drop=2;
						ren.setzhuangtai((movetime++%2)+32);
						if(ren.gety()>=100||map.getreny()<=100)
							ren.movey(-5);
						else 
						{
							map.movey(5);
							NpcOffsety+=5;
						}
						map.movereny(-5);
						NPCshow();
				}
				MainWindow.this.repaint();
				if(Drop==2&&map.CanShin()==0)
				{
					ren.setzhuangtai(Direction==0?11:10);
					new Thread(Jump).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_S)//��
			{			
				
				if(Drop==0)//ȷ�������ڵ�����
					ren.setzhuangtai(Direction==0?12:13);
				if(map.CanShin()==1)
				{
						Drop=2;
						ren.setzhuangtai((movetime++%2)+32);
						if(ren.gety()<=430)
							ren.movey(5);
						else 
						{
							map.movey(-5);
							NpcOffsety-=5;
						}
						map.movereny(5);
						NPCshow();
				}
				MainWindow.this.repaint();
				if(Drop==2&&map.CanShin()==0)
				{
					//ren.setzhuangtai(Direction==0?11:10);
					//new Thread(Jump).start();
					ren.setzhuangtai(Direction==0?8:9);
					Drop=0;
					new Thread(DropTest).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_D)//��
			{
				if(Drop!=2)
				{
				Direction=1;
				//System.out.printf("Drop=%d��movetime=%d\n",Drop,movetime);
				if(Drop==0)
				{
				ren.setzhuangtai(movetime++%4);
				moving=1;
				}
				if(map.AllowMoveR()==1)
				{
					if(ren.getx()<=600||map.getrenx()>mapxmax-200)
					{
						ren.movex(5);
						map.moverenx(5);
					}
					else
					{
						map.movex(-5);
						map.moverenx(5);
						NpcOffsetx+=5;
						NPCshow();
					}
				}
				MainWindow.this.repaint();
				new Thread(DropTest).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_A)//��
			{
				if(Drop!=2)
				{
				Direction=0;
				if(Drop==0)
				{
					ren.setzhuangtai(movetime++%4+4);
					moving=1;
				}

				if(map.AllowMoveL()==1)
				{
					//if(.getx()<=600||map.getrenx()>mapxmax-200)
					if(ren.getx()>=200||map.getrenx()<210)
					{
						ren.movex(-5);
						map.moverenx(-5);
					}
					else
					{
						map.movex(5);
						map.moverenx(-5);
						NpcOffsetx-=5;
						NPCshow();
					}
				}
				MainWindow.this.repaint();
				new Thread(DropTest).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_J)
			{
				if(Drop!=2)
				{
				new Thread(Attack).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_U)
			{
				if(Drop!=2)
				{
				new Thread(skill1).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_I)
			{
				if(Drop!=2)
				{
				new Thread(skill2).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_O)
			{
				if(Drop!=2)
				{
				new Thread(skill3).start();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_K)
			{
				if(Drop==0);//ȷ��ֻ���ڵ�������Ծ
				{
					ren.setzhuangtai(Direction==0?11:10);
					if(moving==0)
						new Thread(Jump).start();
					else 
						new Thread(MJump).start();
				}
			}
		}		
		public void keyReleased(KeyEvent e)//�ͷ�
		{
			if(e.getKeyCode()==KeyEvent.VK_D)
			{	if(Drop==0)
				{
					movetime=0;
					moving=0;
					ren.setzhuangtai(8);
					MainWindow.this.repaint();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_A)
			{
				if(Drop==0)
				{
					movetime=0;
					moving=0;
					ren.setzhuangtai(9);
					MainWindow.this.repaint();
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_S)
			{			
				if(Drop==0)
				if(Direction==0)
					ren.setzhuangtai(9);
				else
					ren.setzhuangtai(8);
				MainWindow.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_Z)
			{
				movetime=0;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		MWD=new MainWindow();
	}
	
}
