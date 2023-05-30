import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FunButtonDemo extends JFrame implements ActionListener {
    private JButton colorButton;
    private JButton sizeButton;
    private JButton resetButton;
    private JLabel messageLabel;

    public FunButtonDemo() {
        setTitle("Fun Button Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        colorButton = new JButton("Change Color");
        sizeButton = new JButton("Change Size");
        resetButton = new JButton("Reset");
        messageLabel = new JLabel("Click a button!");

        colorButton.addActionListener(this);
        sizeButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(colorButton);
        add(sizeButton);
        add(resetButton);
        add(messageLabel);
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
            messageLabel.setText("Color changed!");
        } else if (e.getSource() == sizeButton) {
            Random random = new Random();
            int size = random.nextInt(100) + 50;
            messageLabel.setFont(new Font("Arial", Font.BOLD, size));
            messageLabel.setText("Size changed!");
        } else if (e.getSource() == resetButton) {
            getContentPane().setBackground(null);
            messageLabel.setFont(null);
            messageLabel.setText("Click a button!");
        }
    }

    public static void main(String[] args) {
        FunButtonDemo funButtonDemo = new FunButtonDemo();
        funButtonDemo.setVisible(true);
    }
}
