public class NewRectangle {
    private int width;
    private int height;
    public NewRectangle() {
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    public NewRectangle(int wid, int heig) {
        System.out.println("Parameterized Constructor Invoked..");
        width=wid;
        height=heig;
    }
    public void displayDimensions() {
        System.out.println("Width: "+width);
        System.out.println("Width: "+height);
    }

}