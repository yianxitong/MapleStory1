package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class TaskWindow extends JPanel
{
	private int progress;//����
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}
	public void setProgress(int m)
	{
		progress=m;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�����/�����.png"),0,0,this);
		g.drawString("��Ϸ���� "+Integer.toString(progress)+"/100", 50, 70);
		switch(progress)
		{
		case 0:
			{
				g.drawString("���������������...", 20, 110);
				g.drawString("ȥ���������", 20, 125);
				break;
			}
		case 1:g.drawString("���������߶Ի���", 20,110);break;
		case 2:g.drawString("ȥ��ͼ�����ආ��Ի�", 20, 110);break;
		case 3:
			{
				g.drawString("Ҳ��...", 50,110);
				g.drawString("������...", 50,125);
				g.drawString("��ȥ�����߰�", 50,140);
				break;
			}
		case 4:g.drawString("���������߶Ի���", 20,110);break;
		case 5:g.drawString("���������߶Ի���", 20,110);break;
		case 6:g.drawString("ȥ�ұߵ�ͼ���������", 20, 110);break;
		case 7:
			{
				g.drawString("�Ѿ��ﵽ��10��", 20, 110);
				g.drawString("ȥ�����߰�", 20, 125);
				break;
			}
		case 8:g.drawString("���������߶Ի���", 20,110);break;
		case 9:g.drawString("���������߶Ի���", 20,110);break;
		}
	}
}
