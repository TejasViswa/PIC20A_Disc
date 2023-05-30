import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChanger extends JFrame implements ActionListener {
    private JButton colorButton;

    public ColorChanger() {
        setTitle("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        colorButton = new JButton("Change Color");
        colorButton.addActionListener(this);

        add(colorButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colorButton) {
            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color randomColor = new Color(red, green, blue);
            getContentPane().setBackground(randomColor);
        }
    }

    public static void main(String[] args) {
        ColorChanger colorChanger = new ColorChanger();
        colorChanger.setVisible(true);
    }
}
