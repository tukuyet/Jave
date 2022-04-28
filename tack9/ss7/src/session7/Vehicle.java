package session7;

public class Vehicle {
    protected String vehicleNo;
    protected String getVehicleName;
    protected int wheels;

    public Vehicle (String vId, String vName, int numWheels) {
        vehicleNo = vId;
        getVehicleName = vName;
        wheels = numWheels;
    }
    public void accelerate(int speed) {
        System.out.println("Accelerating at: "+speed+"kmh");
    }
}