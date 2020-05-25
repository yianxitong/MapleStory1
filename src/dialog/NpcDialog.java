package dialog;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class NpcDialog  extends JPanel
{
	private int num;//NPC编号
	private int progress;//进度
	public NpcDialog(){}
	public void setDialog(int m_num,int m_progress)
	{
		num=m_num;
		progress=m_progress;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/对话框体.png"),0,0,this);
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/girls/girlshow_00114.png"),15,40,this);//这里放原画
			g.drawString("醒了？...", 165, 30);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/girl_hold/girl_hold_0029.png"),50,40,this);//这个x，y坐标是相对小屏幕来讲的
			switch(progress)
			{
			case 0:
			{
				g.drawString("我知道你有很多困惑...", 165, 30);
				g.drawString("从这里出去，你会找到你想要的答案...", 165, 45);
				break;
			}
			case 1:
			{
				g.drawString("这个世界或许不是你想的那么简单...", 165, 30);
				g.drawString("请先到处转转吧！(左边似乎有五个人，去打个招呼吧)", 165, 45);
				break;
			}
			case 2:
			{
				g.drawString("(还是先去和左边的五个人打个招呼吧！)", 165, 30);
				break;
			}
			case 3:
			{
				g.drawString("你来了。我想你应该看到了，他们的状态...", 165, 30);
				g.drawString("是的，他们根本不知道自己在助长什么！", 165, 45);
				g.drawString("不仅是他们，整个世界，除了你，他们都不清楚真相...", 165, 60);
				g.drawString("我只知道我要去救人...", 165, 75);
				g.drawString("到底他们是为了什么，我一定要揭穿了他们的伪装，不然朵儿有危险。", 165, 90);
				g.drawString("你问黑衣人为什么这样做？(请再次和我对话)", 165, 105);
				break;
			}
			case 4:
			{
				g.drawString("他们想要取朵儿性命。", 165, 30);
				g.drawString("这个世界需要救赎", 165, 45);
				g.drawString("朵儿似乎有什么他们需要的力量，所以控制了这里", 165, 60);
				g.drawString("他们组织潜伏在各个地方...", 165, 75);
				g.drawString("他在等待控制力量的时机，而我推测，这个时机已经不远了", 165, 90);
				g.drawString("我无法在明处与之对抗，实感惭愧，但是你...", 165, 105);
				g.drawString("如果是你的话，或许可以...", 165, 120);
				g.drawString("(请再和我对话)", 165, 135);
				break;
			}
			case 5:
			{
				g.drawString("实力是很重要的。先将等级提升到10级吧！", 165, 30);
				g.drawString("往左走击杀刺客可以获取经验值。", 165, 45);
				break;
			}
			case 6:
			{
				g.drawString("你还没有到达10级。", 165, 30);
				break;
			}
			case 7:
			{
				g.drawString("很好，你已经达到了10级，", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 8:
			{
				g.drawString("这里到处都是黑衣人的傀要塞", 165, 30);
				g.drawString("你确定你可以触碰到真相吗", 165, 45);
				g.drawString("你好像已经引起他们注意了...", 165, 60);
				g.drawString("(请再和我对话)", 165, 75);
				break;
			}
			case 9:
			{
				g.drawString("往左一直走，前往  [前线1]、[前线2]", 165, 30);
				g.drawString("消灭痩刺客、胖刺客各  30 只吧！", 165, 45);
				break;
			}
			case 10:
			{
				g.drawString("你确认已经消灭了 痩刺客、胖刺客各  30 只吗？", 165, 30);
				g.drawString("(打开任务窗口可以查看任务完成情况)", 165, 45);
				break;
			}
			case 11:
			{
				g.drawString("你完成的很好！", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 12:
			{
				g.drawString("对方组织武器库中获得了精良的装备", 165, 30);
				g.drawString("我们需要消弱他们的实力", 165, 45);
				g.drawString("(请再和我对话)", 165, 60);
				break;
			}
			case 13:
			{
				g.drawString("通过  [前线1] 地图中央的传送门前往 [武器库]", 165, 30);
				g.drawString("消灭精英痩刺客、精英胖刺客各  30 只吧！", 165, 45);
				break;
			}
			case 14:
			{
				g.drawString("你确认已经消灭了 精英痩刺客、精英胖刺客各  30 只吗？", 165, 30);
				g.drawString("(打开任务窗口可以查看任务完成情况)", 165, 45);
				break;
			}
			case 15:
			{
				g.drawString("你完成的很好！", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 16:
			{
				g.drawString("情况似乎渐渐明了了", 165, 30);
				g.drawString("我们现在可以考虑如何向头目发起反击了", 165, 45);
				g.drawString("(请再和我对话)", 165, 60);
				break;
			}
			case 17:
			{
				g.drawString("在没有足够实力之前不能轻举妄动", 165, 30);
				g.drawString("向外界探索答案是个很不错的办法", 165, 45);
				g.drawString("我不能离开这里，所以这个任务就交给你了", 165, 60);
				g.drawString("(请再和我对话)", 165, 75);
				break;
			}
			case 18:
			{
				g.drawString("通过[前线2]左边的传送门去寻找答案吧...", 165, 30);
				break;
			}
			case 19:
			{
				g.drawString("通过[前线2]左边的传送门去寻找答案吧...", 165, 30);
				break;
			}
			case 20:
			{
				g.drawString("(将看到的景象告诉给老者)", 165, 30);
				break;
			}
			case 21:
			{
				g.drawString("什么！灰色石人，并不高大。", 165, 30);
				g.drawString("但是无论如何攻击都纹丝不动！", 165, 45);
				g.drawString("这...难道是！", 165, 60);
				g.drawString("(再次和我对话)", 165, 75);
				break;
			}
			case 22:
			{
				g.drawString("传说中的...", 165, 30);
				g.drawString("(再次和我对话)", 165, 75);
				break;
			}
			case 23:
			{
				g.drawString("袁方舟！！！！！！", 165, 30);
				g.drawString("妻子...女儿...", 165, 45);
				g.drawString("这个世界...救...", 165, 60);
				g.drawString("又失败...为什么...为什么...", 165, 75);
				g.drawString("这次一定！成功...要...救...所有人...", 165, 90);
				g.drawString("或许....",165,105);
				g.drawString("(事情好像并没有那么简单)", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 24:
			{
				g.drawString("我明白了！这一切都是袁方舟的阴谋！", 165, 30);
				g.drawString("你所看到的是一种特殊的石巨人", 165, 45);
				g.drawString("他们是很早以前被创造出来用作守护和防御的", 165, 60);
				g.drawString("现在它们！", 165, 75);
				g.drawString("我所想到的只有一个非常恐怖的阴谋！！", 165, 90);
				g.drawString("只有它们才做的出的邪恶阴谋！！",165,105);
				g.drawString("(再次和我对话)", 165, 120);
				break;
			}
			case 25:
			{
				g.drawString("它们觊觎朵儿的力量", 165, 30);
				g.drawString("所以...他...不知道用了什么方法..", 165, 45);
				g.drawString("把整个世界给包围了起来！", 165, 60);
				g.drawString("这简直就是在...送死！", 165, 75);
				g.drawString("可恶！朵儿遭受到如此耻辱，为什么大路上没有增援的动静?!", 165, 90);
				g.drawString("难道...大家全都不知情吗...",165,105);
				g.drawString("我们必须严肃的对待这件事情！", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 26:
			{
				g.drawString("你或许就是这个世界最后的希望了", 165, 30);
				g.drawString("不管发生什么事情，一定要相信自己的选择！", 165, 45);
				g.drawString("这个世界岌岌可危...", 165, 60);
				g.drawString("这简直就是在...送死！！", 165, 75);
				g.drawString("可恶！为什么没有人反击？", 165, 90);
				g.drawString("难道...大家都不明真相吗...",165,105);
				g.drawString("(一定...要带朵儿离开这里！)", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 27:
			{
				g.drawString("以我的实力，是无法突破石巨人阵的", 165, 30);
				g.drawString("但是勇士，你却可以！", 165, 45);
				g.drawString("但凡石巨人出现的地方，附件一定有为其提供能量的物体！", 165, 60);
				g.drawString("虽然艰难，但是请你务必突破石巨人守护阵", 165, 75);
				g.drawString("进入[上山路1]最上方的传送门继续调查", 165, 90);
				g.drawString("你一定可以的！加油！为了这个世界！",165,105);
				break;
			}
			case 28:
			{
				g.drawString("快去调查吧！为了朵儿！", 165, 30);
				break;
			}
			case 29:
			{
				g.drawString("(将看到的情景告诉老者)", 165, 30);
				break;
			}
			case 30:
			{
				g.drawString("原来如此！是用刻印巨石人的力量为石巨人提供能量！", 165, 30);
				g.drawString("只要击杀一定数量的刻印石巨人，石巨人守护阵就会不攻自破", 165, 45);
				g.drawString("尽快行动吧。大概需要击杀10只的样子", 165, 60);
				break;
			}
			case 31:
			{
				g.drawString("尽快行动吧。需要击杀10只刻印石巨人", 165, 30);
				break;
			}
			case 32:
			{
				g.drawString("做的很好！守护阵的力量消失了！", 165, 30);
				g.drawString("(再次和我对话)", 165, 45);
				break;
			}
			case 33:
			{
				g.drawString("总有一种不安的气息", 165, 30);
				g.drawString("进入[上山路2]上方的传送门，继续调查吧！", 165, 45);
				break;
			}
			case 34:
			{
				g.drawString("进入[上山路2]上方的传送门，继续调查吧！", 165, 30);
				break;
			}
			
			}
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/奥兹.png"),15,40,this);
			g.drawString("有些事情不知道对你有好处...", 165, 30);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/胡克.png"),15,40,this);
			g.drawString("他们对这个世界有着重要的意义！", 165, 30);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/米哈尔.png"),15,40,this);
			g.drawString("你确定你是正义的一方吗...", 165, 30);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/伊卡尔特.png"),15,40,this);
			g.drawString("你确定吗...", 165, 30);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/黑化的五骑士/伊莉娜.png"),15,40,this);
			g.drawString("我们没有其他的选择了...没有比这更好的选择了...", 165, 30);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/高手/站.png"),15,40,this);
			switch(progress)
			{
			case 35:
			{
				g.drawString("你果然还是来了。", 165, 30);
				break;
			}
			case 36:
			{
				g.drawString("回去吧！我无意杀你。", 165, 30);
				break;
			}
			case 39:
			{
				g.drawString("我叫你回去！", 165, 30);
				break;
			}
			}
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/主角/死亡/dead_0038.png"),15,40,this);
			switch(progress)
			{
			case 37:
			{
				g.drawString("你不能理解我，为什么，不，不，不，你应该理解我的，你知道的我不是为了自己，我是在救这个世界...", 165, 30);
				break;
			}
			case 38:
			{
				g.drawString("(我或许，我到底应该击败他吗...可是真的能赢吗...)", 165, 30);
				break;
			}
			}
		}
		}
	}
}
