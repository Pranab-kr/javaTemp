import java.applet.Applet;
import java.awt.*;
import java.awt.Event.*;

/*
   <applet code="Main11.class" width="120" height="120"></applet>
   */

public class Main11 extends Applet implements ActionListener{
  Button b1;
  TextField t1;

  public void init(){
    b1 = new Button("Click me!");
    t1  = new TextField(20);

    add(b1);
    add(t1);

    b1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e){
    t1.setText("Welcome to HIT!");
  }
}
