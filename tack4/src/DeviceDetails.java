public class DeviceDetails {
    int deviceNo;
    String deviceName, deviceType;
    double devicePrice;
    public DeviceDetails() {
        deviceNo = 0;
        deviceName="";
        deviceType="";
        devicePrice=0.0;
    }
    public DeviceDetails(int deviceNo, String deviceType) {
        deviceNo = deviceNo;
        deviceType = deviceType;
    }
    public void displayDetails() {
        System.out.println("Device number is"+deviceNo);
        System.out.println("Device name is"+deviceName);
        System.out.println("Device type is"+deviceType);
        System.out.println("Device price is"+devicePrice);
    }

    public static void main(String[] args) {
        DeviceDetails objDevice = new DeviceDetails();
        objDevice.displayDetails();
    }
}