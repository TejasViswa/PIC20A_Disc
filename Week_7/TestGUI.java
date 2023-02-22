import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TestGUI extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // draw Eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // draw Mouth
        g.fillOval(50, 110, 120, 60);

        // adding smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }

    public static void main(String[] args) {
        TestGUI smiley = new TestGUI();
        JFrame app = new JFrame();
        app.add(smiley);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
