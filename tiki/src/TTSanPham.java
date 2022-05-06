public class TTSanPham extends SanPham {
    private String name;
    private float price;

    public TTSanPham() {
        this.name = " ";
        this.price = 0;
    }

    public TTSanPham(int id, String typeName, String name, float price) {
        super(id, typeName);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", TypeName: " + getTypeName() +
                ", Name: " + name + ", Price: " + price;
    }
}