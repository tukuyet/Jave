public class Test {
    public static void main(String[] args) {
        Staff p1 = new Fulltime("Anh Quan", 1);
        System.out.println(p1.toString());

        Staff p2 = new PartTime("Kim Thi", 2, 4);
        System.out.println(p2.toString());
    }
}