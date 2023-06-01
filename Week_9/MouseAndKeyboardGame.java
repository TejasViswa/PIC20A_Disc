import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyboardGame extends JFrame implements MouseMotionListener, KeyListener {
    private JLabel characterLabel;
    private int characterX;
    private int characterY;

    public MouseAndKeyboardGame() {
        // Set up the JFrame
        setTitle("Mouse and Keyboard Game");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Set up character label
        characterLabel = new JLabel("O");
        characterLabel.setFont(new Font("Arial", Font.BOLD, 24));
        characterLabel.setBounds(50, 50, 50, 50);
        characterX = characterLabel.getX();
        characterY = characterLabel.getY();

        // Add mouse motion listener
        addMouseMotionListener(this);

        // Add key listener
        addKeyListener(this);
        setFocusable(true);

        // Add character label to the JFrame
        add(characterLabel);

        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        characterLabel.setLocation(e.getX() - characterLabel.getWidth() / 2,
                e.getY() - characterLabel.getHeight() / 2);
    }

    public void mouseDragged(MouseEvent e) {
        // Not used in this example
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            characterY -= 50;
            characterLabel.setLocation(characterX, characterY);
        }
    }

    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        MouseAndKeyboardGame mouseAndKeyboardGame = new MouseAndKeyboardGame();
    }
}
