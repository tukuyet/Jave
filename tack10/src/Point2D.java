public class Point2D {
    private int x,y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    public Point2D(int x, int y) {
        x = x;
        y = x;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}