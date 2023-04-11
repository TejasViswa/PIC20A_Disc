import java.awt.Rectangle;

public class Bird {

    private int x;
    private int y;
    private int size;
    private int velocity;
    private int acceleration;
    private int maxY;
    private Rectangle bounds;

    public Bird(int x, int y, int size, int maxY) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.velocity = 0;
        this.acceleration = 1;
        this.maxY = maxY - size;
        this.bounds = new Rectangle(x, y, size, size);
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

    public void jump() {
        velocity = -15;
    }

    public void update() {
        velocity += acceleration;
        y += velocity;
        if (y > maxY) {
            y = maxY;
        }
        bounds.setLocation(x, y);
    }

    public boolean intersects(Pipe pipe) {
        return bounds.intersects(pipe.getTopBounds()) || bounds.intersects(pipe.getBottomBounds());
    }

}
