import java.net.SocketOption;

public class circle {
    private double radius;
    private String color;
    public circle() {
        radius = 1;
        color = "red";
    }
    public circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("The Circle has radius of"+c1.getRadius() + "and area of "+ c1.getArea());

        circle c2 = new circle(2.0);
        System.out.println("The Circle has radius of"+c2.getRadius() + "and area of "+ c2.getArea());
    }
}