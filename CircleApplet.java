// 6. Write an application that displays the background color to cyan and draw a circle of
// radius 50 pixels centered in the middle of applets. The dimensions of the applet should
// be 120×120 pixels. Fill the circle with magenta.

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<applet code="CircleApplet.class" width="120" height="120">
</applet>
*/
public class CircleApplet extends Applet {
 public void init() {
 // Set background color
 setBackground(Color.cyan);
 }
 public void paint(Graphics g) {
 // Set circle color
 g.setColor(Color.magenta);
 // Draw filled circle (diameter = 100)
 g.fillOval(10, 10, 100, 100);
 }
}
