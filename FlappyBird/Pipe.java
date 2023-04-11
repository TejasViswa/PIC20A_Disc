import java.awt.Rectangle;

public class Pipe {
    private int x;
    private int width;
    private int topHeight;
    private int bottomY;
    private int bottomHeight;
    private boolean passed;

    public Pipe(int startX, int pipeWidth, int pipeGap, int groundY) {
        width = pipeWidth;
        topHeight = (int) (Math.random() * (groundY - pipeGap));
        bottomY = topHeight + pipeGap;
        bottomHeight = groundY - bottomY;
        x = startX;
        passed = false;
    }

    public void update(int pipeSpeed) {
        x -= pipeSpeed;
    }

    public boolean isOffscreen() {
        return x < -width;
    }

    public boolean isPassedBy(Bird bird) {
        if (bird.getX() > x + width / 2 && !passed) {
            passed = true;
            return true;
        }
        return false;
    }

    public void reset(int startX) {
        topHeight = (int) (Math.random() * (bottomY - 100));
        bottomHeight = bottomY - topHeight;
        x = startX;
        passed = false;
    }

    public int getX() {
        return x;
    }

    public int getTopHeight() {
        return topHeight;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getBottomHeight() {
        return bottomHeight;
    }

    public Rectangle getTopBounds() {
        return new Rectangle(x, 0, width, topHeight);
    }

    public Rectangle getBottomBounds() {
        return new Rectangle(x, bottomY, width, bottomHeight);
    }
}
