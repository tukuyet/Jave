public class Rectangle {
    int width;
    int height;
    Rectangle() {
        width=10;
        height=10;
    }
    Rectangle(int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width=wid;
        height=heig;
    }
    void displayDimensions() {
        System.out.println("Width:"+width);
        System.out.println("Width:"+height);
    }
}
