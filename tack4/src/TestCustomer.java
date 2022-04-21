public class TestCustomer {
    public static void main(String[] args) {
        Customer objCustomer = new Customer();
        objCustomer.customerID=100;
        objCustomer.customerName="Jack";
        objCustomer.customerAddress="123 Street";
        objCustomer.customerAge=30;
        objCustomer.dispalyCustomerInformation();
        objCustomer.changeCustomerAddress("123 Fort, Main Street");
        objCustomer.dispalyCustomerInformation();
    }
}
