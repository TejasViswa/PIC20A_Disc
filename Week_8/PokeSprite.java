import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PokeSprite extends JPanel {
    private BufferedImage sprite;

    public PokeSprite(String spriteUrl) {
        try {
            sprite = ImageIO.read(new URL(spriteUrl));
        } catch (IOException e) {
            System.out.println("Error retrieving Pokemon sprite: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawImage(sprite, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }

    public static void main(String[] args) {
        String spriteUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png";
        PokeSprite spritePanel = new PokeSprite(spriteUrl);
        JFrame frame = new JFrame();
        frame.add(spritePanel);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
