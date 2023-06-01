import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdventureGame extends JFrame{
    //JFrame jframe;
    // private AdventureButton button1;
    // private AdventureButton button2;
    // private AdventureButton button3;

    public AdventureGame() {
        super("Adventure Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        // button1 = new AdventureButton("Go left");
        // button2 = new AdventureButton("Go right");
        // button3 = new AdventureButton("Go straight");

        // add(button1);
        // add(button2);
        // add(button3);


        add(new AdventureButton("Go left"));
        add(new AdventureButton("Go right"));
        add(new AdventureButton("Go straight"));

        setVisible(true);
    }

    class AdventureButton extends JButton implements ActionListener {
        boolean isClicked;

        public AdventureButton(String text) {
            super(text);
            // super("");
            // setText("");
            isClicked = false;
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            if(isClicked) {
                JOptionPane.showMessageDialog(this, "You have already completed this move!");
                return;
            }

            if(getText().equals("Go left")) {

                int result = JOptionPane.showConfirmDialog(this, "You encounter a dragon! Do you fight?", "Adventure",
                    JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "You bravely fight the dragon and emerge victorious!");
                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(this, "You run away from the dragon and live to fight another day!");
                }

            } else if(getText().equals("Go right")) {

                JOptionPane.showMessageDialog(this, "You find a treasure chest full of gold! You become rich!");
            
            } else {

                JOptionPane.showMessageDialog(this, "You come across a magical forest. You feel a sense of tranquility.");
            
            }

            isClicked = true;
            setText("Completed");
        }
    }

    public static void main (String[] args) {
        AdventureGame adventureGame = new AdventureGame();
    }
}
