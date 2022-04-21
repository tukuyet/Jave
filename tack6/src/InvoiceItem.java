public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String ID, String Desc, int Qty, double UnitPrice) {
        id = ID;
        desc = Desc;
        qty = Qty;
        unitPrice = UnitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }
    public static void main(String[] args) {
        InvoiceItem I1 = new InvoiceItem("1","Chocola",4,30000);
        System.out.println(I1.toString() + "Total = "+I1.getTotal());
        I1.setUnitPrice(45000);
        System.out.println(I1.toString() + "Total 2= "+I1.getTotal());
    }
}