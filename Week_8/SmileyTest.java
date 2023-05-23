import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class Canvas extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // JPanel's implementation        
        g.setColor(Color.ORANGE);
        g.fillRect(150, 100, 500, 200);
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
    }
}

public class SmileyTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Canvas()); // in turn will call JPanel()
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
