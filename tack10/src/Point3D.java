public class Point3D extends Point2D {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z) {
        x = x;
        y = y;
        z = z;
    }
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}