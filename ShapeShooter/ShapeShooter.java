import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class ShapeShooter extends JFrame {

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    private Player player;
    private ArrayList<Enemy> enemies;
    private Timer timer;
    private boolean gameOver = false;
    private Image bufferImage;
    private Graphics bufferGraphics;

    public ShapeShooter() {
        setTitle("Shape Shooter");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        player = new Player(400, 500);
        enemies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            enemies.add(new Enemy((i + 1) * 50, 50));
        }

        addKeyListener(new PlayerKeyListener());

        timer = new Timer(20, new GameTimerListener());
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (bufferImage == null) {
            bufferImage = createImage(FRAME_WIDTH, FRAME_HEIGHT);
            bufferGraphics = bufferImage.getGraphics();
        }

        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        // Draw player
        player.draw(bufferGraphics);

        // Draw enemies
        for (Enemy enemy : enemies) {
            enemy.draw(bufferGraphics);
        }

        // Draw game over message
        if (gameOver) {
            bufferGraphics.setColor(Color.BLACK);
            bufferGraphics.setFont(new Font("Arial", Font.BOLD, 48));
            bufferGraphics.drawString("Game over!", FRAME_WIDTH/2-150, FRAME_HEIGHT/2);
        }

        g.drawImage(bufferImage, 0, 0, this);
    }

    private class GameTimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!gameOver) {
                player.update();

                for (int i = 0; i < enemies.size(); i++) {
                    Enemy enemy = enemies.get(i);
                    enemy.update();
                    if (player.intersects(enemy)) {
                        enemies.remove(i);
                        break;
                    }
                }

                if (enemies.size() == 0) {
                    gameOver = true;
                }

                repaint();
            }
        }
    }

    private class PlayerKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                player.moveLeft();
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                player.moveRight();
            } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                player.shoot();
            }
        }
    }

    public static void main(String[] args) {
        new ShapeShooter();
    }

    private abstract class GameObject {
        protected int x;
        protected int y;
        protected int size;
        protected int speed;
    
        public GameObject(int x, int y, int size, int speed) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.speed = speed;
        }
    
        public int getX() {
            return x;
        }
    
        public int getY() {
            return y;
        }
    
        public int getSize() {
            return size;
        }
    
        public void update() {
            y += speed;
        }
    
        public boolean intersects(GameObject other) {
            return (x < other.getX() + other.getSize() &&
                    x + size > other.getX() &&
                    y < other.getY() + other.getSize() &&
                    y + size > other.getY());
                    }
                    public abstract void draw(Graphics g);
                }
                
                private class Player extends GameObject {
                    private final int MOVE_SPEED = 5;
                    private final int SHOOT_SPEED = -10;
                    private ArrayList<Bullet> bullets;
                
                    public Player(int x, int y) {
                        super(x, y, 50, 0);
                        bullets = new ArrayList<>();
                    }
                
                    public void moveLeft() {
                        if (x - MOVE_SPEED >= 0) {
                            x -= MOVE_SPEED;
                        }
                    }
                
                    public void moveRight() {
                        if (x + MOVE_SPEED + size <= FRAME_WIDTH) {
                            x += MOVE_SPEED;
                        }
                    }
                
                    public void shoot() {
                        bullets.add(new Bullet(x + size / 2, y, SHOOT_SPEED));
                    }
                
                    @Override
                    public void update() {
                        for (int i = 0; i < bullets.size(); i++) {
                            Bullet bullet = bullets.get(i);
                            bullet.update();
                            for (int j = 0; j < enemies.size(); j++) {
                                Enemy enemy = enemies.get(j);
                                if (bullet.intersects(enemy)) {
                                    bullets.remove(i);
                                    enemies.remove(j);
                                    i--;
                                    break;
                                }
                            }
                        }
                        super.update();
                    }
                
                    @Override
                    public void draw(Graphics g) {
                        g.setColor(Color.BLUE);
                        g.fillRect(x, y, size, size);
                
                        g.setColor(Color.BLACK);
                        for (Bullet bullet : bullets) {
                            bullet.draw(g);
                        }
                    }
                }
                
                private class Enemy extends GameObject {
                    public Enemy(int x, int y) {
                        super(x, y, 50, 1);
                    }
                
                    @Override
                    public void draw(Graphics g) {
                        g.setColor(Color.RED);
                        g.fillRect(x, y, size, size);
                    }
                }
                
                private class Bullet extends GameObject {
                    public Bullet(int x, int y, int speed) {
                        super(x, y, 5, speed);
                    }
                
                    @Override
                    public void draw(Graphics g) {
                        g.setColor(Color.BLACK);
                        g.fillRect(x, y, size, size);
                    }
                }
            }                
