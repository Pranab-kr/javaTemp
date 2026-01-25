// Standalone JFrame version of drawCircle applet
import javax.swing.*;
import java.awt.*;

public class DrawCircleFrame extends JFrame {
    
    public DrawCircleFrame() {
        setTitle("Draw Circle");
        setSize(120, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add a custom panel that does the drawing
        add(new CirclePanel());
    }
    
    // Inner class for drawing
    class CirclePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.cyan);
            g.setColor(Color.magenta);
            g.fillOval(10, 10, 100, 100);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawCircleFrame frame = new DrawCircleFrame();
            frame.setVisible(true);
        });
    }
}
