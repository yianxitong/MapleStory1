package dialog;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class NpcDialog  extends JPanel
{
	private int num;//NPC���
	private int progress;//����
	public NpcDialog(){}
	public void setDialog(int m_num,int m_progress)
	{
		num=m_num;
		progress=m_progress;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�Ի���/�Ի�����.png"),0,0,this);
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/girls/girlshow_00114.png"),15,40,this);//�����ԭ��
			g.drawString("���ˣ�...", 165, 30);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/girl_hold/girl_hold_0029.png"),50,40,this);//���x��y���������С��Ļ������
			switch(progress)
			{
			case 0:
			{
				g.drawString("��֪�����кܶ�����...", 165, 30);
				g.drawString("�������ȥ������ҵ�����Ҫ�Ĵ�...", 165, 45);
				break;
			}
			case 1:
			{
				g.drawString("�������������������ô��...", 165, 30);
				g.drawString("���ȵ���תת�ɣ�(����ƺ�������ˣ�ȥ����к���)", 165, 45);
				break;
			}
			case 2:
			{
				g.drawString("(������ȥ����ߵ�����˴���к��ɣ�)", 165, 30);
				break;
			}
			case 3:
			{
				g.drawString("�����ˡ�������Ӧ�ÿ����ˣ����ǵ�״̬...", 165, 30);
				g.drawString("�ǵģ����Ǹ�����֪���Լ�������ʲô��", 165, 45);
				g.drawString("���������ǣ��������磬�����㣬���Ƕ����������...", 165, 60);
				g.drawString("��ֻ֪����Ҫȥ����...", 165, 75);
				g.drawString("����������Ϊ��ʲô����һ��Ҫ�Ҵ������ǵ�αװ����Ȼ�����Σ�ա�", 165, 90);
				g.drawString("���ʺ�����Ϊʲô��������(���ٴκ��ҶԻ�)", 165, 105);
				break;
			}
			case 4:
			{
				g.drawString("������Ҫȡ���������", 165, 30);
				g.drawString("���������Ҫ����", 165, 45);
				g.drawString("����ƺ���ʲô������Ҫ�����������Կ���������", 165, 60);
				g.drawString("������֯Ǳ���ڸ����ط�...", 165, 75);
				g.drawString("���ڵȴ�����������ʱ���������Ʋ⣬���ʱ���Ѿ���Զ��", 165, 90);
				g.drawString("���޷���������֮�Կ���ʵ�в�����������...", 165, 105);
				g.drawString("�������Ļ����������...", 165, 120);
				g.drawString("(���ٺ��ҶԻ�)", 165, 135);
				break;
			}
			case 5:
			{
				g.drawString("ʵ���Ǻ���Ҫ�ġ��Ƚ��ȼ�������10���ɣ�", 165, 30);
				g.drawString("�����߻�ɱ�̿Ϳ��Ի�ȡ����ֵ��", 165, 45);
				break;
			}
			case 6:
			{
				g.drawString("�㻹û�е���10����", 165, 30);
				break;
			}
			case 7:
			{
				g.drawString("�ܺã����Ѿ��ﵽ��10����", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 8:
			{
				g.drawString("���ﵽ�����Ǻ����˵Ŀ�Ҫ��", 165, 30);
				g.drawString("��ȷ������Դ�����������", 165, 45);
				g.drawString("������Ѿ���������ע����...", 165, 60);
				g.drawString("(���ٺ��ҶԻ�)", 165, 75);
				break;
			}
			case 9:
			{
				g.drawString("����һֱ�ߣ�ǰ��  [ǰ��1]��[ǰ��2]", 165, 30);
				g.drawString("����l�̿͡��ִ̿͸�  30 ֻ�ɣ�", 165, 45);
				break;
			}
			case 10:
			{
				g.drawString("��ȷ���Ѿ������� �l�̿͡��ִ̿͸�  30 ֻ��", 165, 30);
				g.drawString("(�����񴰿ڿ��Բ鿴����������)", 165, 45);
				break;
			}
			case 11:
			{
				g.drawString("����ɵĺܺã�", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 12:
			{
				g.drawString("�Է���֯�������л���˾�����װ��", 165, 30);
				g.drawString("������Ҫ�������ǵ�ʵ��", 165, 45);
				g.drawString("(���ٺ��ҶԻ�)", 165, 60);
				break;
			}
			case 13:
			{
				g.drawString("ͨ��  [ǰ��1] ��ͼ����Ĵ�����ǰ�� [������]", 165, 30);
				g.drawString("����Ӣ�l�̿͡���Ӣ�ִ̿͸�  30 ֻ�ɣ�", 165, 45);
				break;
			}
			case 14:
			{
				g.drawString("��ȷ���Ѿ������� ��Ӣ�l�̿͡���Ӣ�ִ̿͸�  30 ֻ��", 165, 30);
				g.drawString("(�����񴰿ڿ��Բ鿴����������)", 165, 45);
				break;
			}
			case 15:
			{
				g.drawString("����ɵĺܺã�", 165, 30);
				g.drawString("(���ٺ��ҶԻ�)", 165, 45);
				break;
			}
			case 16:
			{
				g.drawString("����ƺ�����������", 165, 30);
				g.drawString("�������ڿ��Կ��������ͷĿ���𷴻���", 165, 45);
				g.drawString("(���ٺ��ҶԻ�)", 165, 60);
				break;
			}
			case 17:
			{
				g.drawString("��û���㹻ʵ��֮ǰ�����������", 165, 30);
				g.drawString("�����̽�����Ǹ��ܲ���İ취", 165, 45);
				g.drawString("�Ҳ����뿪��������������ͽ�������", 165, 60);
				g.drawString("(���ٺ��ҶԻ�)", 165, 75);
				break;
			}
			case 18:
			{
				g.drawString("ͨ��[ǰ��2]��ߵĴ�����ȥѰ�Ҵ𰸰�...", 165, 30);
				break;
			}
			case 19:
			{
				g.drawString("ͨ��[ǰ��2]��ߵĴ�����ȥѰ�Ҵ𰸰�...", 165, 30);
				break;
			}
			case 20:
			{
				g.drawString("(�������ľ�����߸�����)", 165, 30);
				break;
			}
			case 21:
			{
				g.drawString("ʲô����ɫʯ�ˣ������ߴ�", 165, 30);
				g.drawString("����������ι�������˿������", 165, 45);
				g.drawString("��...�ѵ��ǣ�", 165, 60);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 75);
				break;
			}
			case 22:
			{
				g.drawString("��˵�е�...", 165, 30);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 75);
				break;
			}
			case 23:
			{
				g.drawString("Ԭ���ۣ�����������", 165, 30);
				g.drawString("����...Ů��...", 165, 45);
				g.drawString("�������...��...", 165, 60);
				g.drawString("��ʧ��...Ϊʲô...Ϊʲô...", 165, 75);
				g.drawString("���һ�����ɹ�...Ҫ...��...������...", 165, 90);
				g.drawString("����....",165,105);
				g.drawString("(�������û����ô��)", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 24:
			{
				g.drawString("�������ˣ���һ�ж���Ԭ���۵���ı��", 165, 30);
				g.drawString("������������һ�������ʯ����", 165, 45);
				g.drawString("�����Ǻ�����ǰ��������������ػ��ͷ�����", 165, 60);
				g.drawString("�������ǣ�", 165, 75);
				g.drawString("�����뵽��ֻ��һ���ǳ��ֲ�����ı����", 165, 90);
				g.drawString("ֻ�����ǲ����ĳ���а����ı����",165,105);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 120);
				break;
			}
			case 25:
			{
				g.drawString("����������������", 165, 30);
				g.drawString("����...��...��֪������ʲô����..", 165, 45);
				g.drawString("�������������Χ��������", 165, 60);
				g.drawString("���ֱ������...������", 165, 75);
				g.drawString("�ɶ񣡶�����ܵ���˳��裬Ϊʲô��·��û����Ԯ�Ķ���?!", 165, 90);
				g.drawString("�ѵ�...���ȫ����֪����...",165,105);
				g.drawString("���Ǳ�������ĶԴ�������飡", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 26:
			{
				g.drawString("�������������������ϣ����", 165, 30);
				g.drawString("���ܷ���ʲô���飬һ��Ҫ�����Լ���ѡ��", 165, 45);
				g.drawString("��������᧿�Σ...", 165, 60);
				g.drawString("���ֱ������...��������", 165, 75);
				g.drawString("�ɶ�Ϊʲôû���˷�����", 165, 90);
				g.drawString("�ѵ�...��Ҷ�����������...",165,105);
				g.drawString("(һ��...Ҫ������뿪���)", 165, 120);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 135);
				break;
			}
			case 27:
			{
				g.drawString("���ҵ�ʵ�������޷�ͻ��ʯ�������", 165, 30);
				g.drawString("������ʿ����ȴ���ԣ�", 165, 45);
				g.drawString("����ʯ���˳��ֵĵط�������һ����Ϊ���ṩ���������壡", 165, 60);
				g.drawString("��Ȼ���ѣ������������ͻ��ʯ�����ػ���", 165, 75);
				g.drawString("����[��ɽ·1]���Ϸ��Ĵ����ż�������", 165, 90);
				g.drawString("��һ�����Եģ����ͣ�Ϊ��������磡",165,105);
				break;
			}
			case 28:
			{
				g.drawString("��ȥ����ɣ�Ϊ�˶����", 165, 30);
				break;
			}
			case 29:
			{
				g.drawString("(���������龰��������)", 165, 30);
				break;
			}
			case 30:
			{
				g.drawString("ԭ����ˣ����ÿ�ӡ��ʯ�˵�����Ϊʯ�����ṩ������", 165, 30);
				g.drawString("ֻҪ��ɱһ�������Ŀ�ӡʯ���ˣ�ʯ�����ػ���ͻ᲻������", 165, 45);
				g.drawString("�����ж��ɡ������Ҫ��ɱ10ֻ������", 165, 60);
				break;
			}
			case 31:
			{
				g.drawString("�����ж��ɡ���Ҫ��ɱ10ֻ��ӡʯ����", 165, 30);
				break;
			}
			case 32:
			{
				g.drawString("���ĺܺã��ػ����������ʧ�ˣ�", 165, 30);
				g.drawString("(�ٴκ��ҶԻ�)", 165, 45);
				break;
			}
			case 33:
			{
				g.drawString("����һ�ֲ�������Ϣ", 165, 30);
				g.drawString("����[��ɽ·2]�Ϸ��Ĵ����ţ���������ɣ�", 165, 45);
				break;
			}
			case 34:
			{
				g.drawString("����[��ɽ·2]�Ϸ��Ĵ����ţ���������ɣ�", 165, 30);
				break;
			}
			
			}
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/����.png"),15,40,this);
			g.drawString("��Щ���鲻֪�������кô�...", 165, 30);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/����.png"),15,40,this);
			g.drawString("���Ƕ��������������Ҫ�����壡", 165, 30);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/�׹���.png"),15,40,this);
			g.drawString("��ȷ�����������һ����...", 165, 30);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/��������.png"),15,40,this);
			g.drawString("��ȷ����...", 165, 30);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/�ڻ�������ʿ/������.png"),15,40,this);
			g.drawString("����û��������ѡ����...û�б�����õ�ѡ����...", 165, 30);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ.png"),15,40,this);
			switch(progress)
			{
			case 35:
			{
				g.drawString("���Ȼ�������ˡ�", 165, 30);
				break;
			}
			case 36:
			{
				g.drawString("��ȥ�ɣ�������ɱ�㡣", 165, 30);
				break;
			}
			case 39:
			{
				g.drawString("�ҽ����ȥ��", 165, 30);
				break;
			}
			}
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/����/dead_0038.png"),15,40,this);
			switch(progress)
			{
			case 37:
			{
				g.drawString("�㲻������ң�Ϊʲô����������������Ӧ������ҵģ���֪�����Ҳ���Ϊ���Լ��������ھ��������...", 165, 30);
				break;
			}
			case 38:
			{
				g.drawString("(�һ����ҵ���Ӧ�û�������...���������Ӯ��...)", 165, 30);
				break;
			}
			}
		}
		}
	}
}
