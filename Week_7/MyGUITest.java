// Illustrates concatenation operation in output statements

import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class MyGUITest
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);           // play with the size
    frame.setVisible(true);

    int a, b, c;
    String message;

    a = JOptionPane.showConfirmDialog(frame, "Would you like some ice cream?",
                    "Question 1", JOptionPane.YES_NO_OPTION);

    if (a == JOptionPane.NO_OPTION){
        message = "Good.  More ice cream for me!";
        frame.add(new Smiley());
    }
    else
    {
        b = JOptionPane.showConfirmDialog(frame, "How about chocolate?",
                    "Question 2", JOptionPane.YES_NO_CANCEL_OPTION);

        if (b == JOptionPane.YES_OPTION){
           message = "Okay, you will get chocolate ice cream";
           frame.add(new Smiley());
        }
        else if (b == JOptionPane.NO_OPTION){
           message = "Okay, you will get vanilla ice cream";
           frame.add(new Smiley());
        }
        else{
           message = "Well, if you're not going to answer the question,"
                     + "\nI guess you don't get any ice cream!";
                     frame.add(new Sad());
        }
    }

    JOptionPane.showMessageDialog(frame, message);

    
    frame.setVisible(true);
   // "Reply", -1,new ImageIcon("/Users/TEJAS/20A/ProfNotes6GUIParts/src/smiley.jpeg"));
  }
}
class Smiley extends JPanel {

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
}

class Sad extends JPanel {

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
        g.fillOval(50, 140, 120, 60);

        // adding smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 170, 120, 10);
        g.fillOval(50, 150, 120, 40);
        g.fillOval(50, 160, 120, 40);
    }
}
