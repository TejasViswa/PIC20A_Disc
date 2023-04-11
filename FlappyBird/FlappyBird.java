import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlappyBird extends JFrame {
private final int FRAME_WIDTH = 500;
private final int FRAME_HEIGHT = 600;
private final int GROUND_Y = 500;
private final int BIRD_SIZE = 50;
private final int BIRD_START_X = 100;
private final int BIRD_START_Y = 250;
private final int PIPE_WIDTH = 50;
private final int PIPE_GAP = 200;
private final int PIPE_SPEED = 5;
private final int PIPE_INTERVAL = 200;
private final int SCORE_INTERVAL = 50;
private Image offScreenImage;
private int score = 0;
private Bird bird;
private Pipe pipe1, pipe2;
private Timer timer;

public FlappyBird() {
    setTitle("Flappy Bird");
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);

    bird = new Bird(BIRD_START_X, BIRD_START_Y, BIRD_SIZE, GROUND_Y);
    pipe1 = new Pipe(FRAME_WIDTH, PIPE_WIDTH, PIPE_GAP, GROUND_Y);
    pipe2 = new Pipe(FRAME_WIDTH + PIPE_INTERVAL, PIPE_WIDTH, PIPE_GAP, GROUND_Y);

    addKeyListener(new BirdKeyListener());

    timer = new Timer(50, new GameTimerListener());
    timer.start();
}

@Override
public void paint(Graphics g) {
    // Clear screen
    g.clearRect(0, 0, getWidth(), getHeight());

    // Draw ground
    g.setColor(Color.GREEN);
    g.fillRect(0, GROUND_Y, FRAME_WIDTH, FRAME_HEIGHT - GROUND_Y);

    // Draw pipes
    g.setColor(Color.BLUE);
    g.fillRect(pipe1.getX(), 0, PIPE_WIDTH, pipe1.getTopHeight());
    g.fillRect(pipe1.getX(), pipe1.getBottomY(), PIPE_WIDTH, pipe1.getBottomHeight());
    g.fillRect(pipe2.getX(), 0, PIPE_WIDTH, pipe2.getTopHeight());
    g.fillRect(pipe2.getX(), pipe2.getBottomY(), PIPE_WIDTH, pipe2.getBottomHeight());

    // Draw bird
    g.setColor(Color.YELLOW);
    g.fillRect(bird.getX(), bird.getY(), bird.getSize(), bird.getSize());

    // Draw score
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 24));
    g.drawString("Score: " + score, 10, 30);
}


public void update(Graphics g) {
    // Create off-screen image
    if (offScreenImage == null) {
        offScreenImage = createImage(getWidth(), getHeight());
    }

    // Get graphics object for off-screen image
    Graphics offScreenGraphics = offScreenImage.getGraphics();

    // Draw everything to off-screen image
    paint(offScreenGraphics);

    // Draw off-screen image to screen
    g.drawImage(offScreenImage, 0, 0, this);
}


private class GameTimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        bird.update();
        pipe1.update(PIPE_SPEED);
        pipe2.update(PIPE_SPEED);

        if (bird.intersects(pipe1) || bird.intersects(pipe2) || bird.getY() >= GROUND_Y - bird.getSize()) {
            timer.stop();
            JOptionPane.showMessageDialog(FlappyBird.this, "Game over! Score: " + score);
            System.exit(0);
        }

        if (pipe1.isPassedBy(bird) || pipe2.isPassedBy(bird)) {
            score++;
        }

        if (pipe1.isOffscreen()) {
            pipe1.reset(FRAME_WIDTH + PIPE_INTERVAL);
        }

        if (pipe2.isOffscreen()) {
            pipe2.reset(FRAME_WIDTH + PIPE_INTERVAL);
        }

        repaint();
    }
}

private class BirdKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            bird.jump();
        }
    }
}

public static void main(String[] args) {
    new FlappyBird();
}
}
