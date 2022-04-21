public class product {
    private String name;
    private float price;
    private int qti;
    private int id;

    public product() {
        name = "Tuan";
        price = 30000;
        qti = 3;
        id = 4;
    }

    public product(String nameN, int idI) {
        name = nameN;
        id = idI;
    }

    public product(String nameN, int idI, float priceP, int qtiQ) {
        name = nameN;
        id = idI;
        price = priceP;
        qti = qtiQ;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQti() {
        return qti;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        product objPr1 = new product("Nam", 1);
        System.out.println(objPr1.getName());
        System.out.println(objPr1.getId());

        product objPr = new product("Viet", 6, 3000, 34);
        System.out.println(objPr.getName());
        System.out.println(objPr.getId());
        System.out.println(objPr.getPrice());
        System.out.println(objPr.getQti());

        product objPr2 = new product();
        System.out.println(objPr2.getName());
        System.out.println(objPr2.getId());
        System.out.println(objPr2.getPrice());
        System.out.println(objPr2.getQti());
    }
}
