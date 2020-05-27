package allbutton;

import java.awt.*;
import javax.swing.*;
public class SoundButton extends JPanel
{
	private int state=0;/**×´Ì¬
	* 0=Î´¼¤»î
	* 1=¼¤»î
	* */
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}
	
	public void changeState()
	{
		if (state==0)
			state=1;
		else
			state=0;
	}
	
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/°´¼üÉèÖÃ/¾²Òô.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/°´¼üÉèÖÃ/ÉùÒô.png"),0,0,this);break;
		}
	}
}
