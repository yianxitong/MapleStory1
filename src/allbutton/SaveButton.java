package allbutton;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import windows.MainWindow;
import windows.StatusBar;


public class SaveButton extends ButtonBase
{
	public void paint(Graphics g)
	{
		switch(state)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-Î´¼¤»î.png"),0,0,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-¼¤»î.png"),0,0,this);break;
		case 2:{
				g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/²Ëµ¥/±£´æ´æµµ-°´ÏÂ.png"),0,0,this);
				try {
					StatusBar stb=MainWindow.MWD.getStatusBar();
					FileWriter writer = new FileWriter("./ÓÎÏ·´æµµ/Player.txt");
				    writer.write(stb.getLV()+"\r\n");
				    writer.write(stb.getHP()+"\r\n");
				    writer.write(stb.getMP()+"\r\n");
				    writer.write(stb.getEXP()+"\r\n");
				    writer.close();
				} catch (IOException e) {
				    e.printStackTrace();
				}
				break;
				}
				
		}
	}
}
