import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.util.Random;

public class SlotMachineGame extends JFrame implements ActionListener {
    private JButton spinButton;
    private JLabel[] reels;

    private Random random;

    public SlotMachineGame() {
        setTitle("Pokemon Slot Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(2, 1));

        JPanel reelsPanel = new JPanel(new GridLayout(1, 3));
        reels = new JLabel[3];
        for (int i = 0; i < reels.length; i++) {
            reels[i] = new JLabel();
            reelsPanel.add(reels[i]);
        }

        spinButton = new JButton("Spin");
        spinButton.addActionListener(this);

        add(reelsPanel);
        add(spinButton);

        random = new Random();
    }

    private BufferedImage loadImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            return ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void displayResult() {
        // String[] pokemonNames = {"pikachu", "charmander", "squirtle", "bulbasaur", "jigglypuff", "meowth"};
        String[] pokemonNames = {"1", "20", "25", "64", "4", "37"};
        for (int i = 0; i < reels.length; i++) {
            String pokemonName = pokemonNames[random.nextInt(pokemonNames.length)];
            // String imageUrl = "https://pokeapi.co/api/v2/pokemon/" + pokemonName;
            String imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+pokemonName+".png";
            BufferedImage image = loadImage(imageUrl);
            if (image != null) {
                Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(scaledImage);
                reels[i].setIcon(icon);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == spinButton) {
            displayResult();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SlotMachineGame game = new SlotMachineGame();
                game.setVisible(true);
            }
        });
    }
}
