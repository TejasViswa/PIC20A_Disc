import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseYourAdventureGame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public ChooseYourAdventureGame() {
        // Set up the JFrame
        setTitle("Choose Your Adventure Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        button1 = new JButton("Go left");
        button2 = new JButton("Go right");
        button3 = new JButton("Go straight");

        // Add action listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Add buttons to the JFrame
        add(button1);
        add(button2);
        add(button3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            int result = JOptionPane.showConfirmDialog(this, "You encounter a dragon! Do you fight?", "Adventure",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "You bravely fight the dragon and emerge victorious!");
            } else if (result == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "You run away from the dragon and live to fight another day!");
            }
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "You find a treasure chest full of gold! You become rich!");
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(this, "You come across a magical forest. You feel a sense of tranquility.");
        }
    }

    public static void main(String[] args) {
        ChooseYourAdventureGame chooseYourAdventureGame = new ChooseYourAdventureGame();
    }
}
