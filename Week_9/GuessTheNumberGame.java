import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberGame extends JFrame implements ActionListener {
    private JButton guessButton;
    private JButton resetButton;
    private JTextField guessField;
    private JLabel resultLabel;
    private int randomNumber;

    public GuessTheNumberGame() {
        setTitle("Guess the Number Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resetButton = new JButton("Reset");
        resultLabel = new JLabel("Guess a number between 1 and 100");

        guessButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(guessField);
        add(guessButton);
        add(resetButton);
        add(resultLabel);

        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guessButton) {
            int guess = Integer.parseInt(guessField.getText());

            if (guess == randomNumber) {
                resultLabel.setText("Congratulations! You guessed the number!");
            } else if (guess < randomNumber) {
                resultLabel.setText("Too low! Try again.");
            } else {
                resultLabel.setText("Too high! Try again.");
            }
        } else if (e.getSource() == resetButton) {
            generateRandomNumber();
            guessField.setText("");
            resultLabel.setText("Guess a number between 1 and 100");
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.setVisible(true);
    }
}
