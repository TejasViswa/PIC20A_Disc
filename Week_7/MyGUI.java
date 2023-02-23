// Illustrates concatenation operation in output statements

import javax.swing.JOptionPane;

public class MyGUI
{
  public static void main(String[] args)
  {
    int a, b, c;
    String message;

    a = JOptionPane.showConfirmDialog(null, "Would you like some ice cream?",
                    "Question 1", JOptionPane.YES_NO_OPTION);

    if (a == JOptionPane.NO_OPTION)
        message = "Good.  More ice cream for me!";
    else
    {
        b = JOptionPane.showConfirmDialog(null, "How about chocolate?",
                    "Question 2", JOptionPane.YES_NO_CANCEL_OPTION);

        if (b == JOptionPane.YES_OPTION)
           message = "Okay, you will get chocolate ice cream";
        else if (b == JOptionPane.NO_OPTION)
           message = "Okay, you will get vanilla ice cream";
        else
           message = "Well, if you're not going to answer the question,"
                     + "\nI guess you don't get any ice cream!";
    }

    JOptionPane.showMessageDialog(null, message);
  }
}
