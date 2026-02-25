//Circle
import java.applet.Applet;
import java.awt.*;

/*
 <applet code="Main6.class" width="120" height="120"></applet>
 */

public class Main6 extends Applet{
  public void init(){
    setBackground(Color.cyan);
  }

  public void paint(Graphics g){
    g.setColor(Color.magenta);
    g.fillOval(10,10,100,100);
  }
}
