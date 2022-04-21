public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changeCustomerAddress(String address) {
        customerAddress = address;
    }
    void dispalyCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerAddress);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: "+ customerAge);
    }
}
