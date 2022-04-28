package session7;

class FourWheeler extends Vehicle {
    private boolean powerSteer;
    public FourWheeler (String vId, String vName, int numWheels, boolean pSteer) {
        super(vId,vName,numWheels);
        powerSteer = pSteer;
    }
    public void showDetails() {
        System.out.println("Vehicle no: "+vehicleNo);
        System.out.println("Vehicle Name: "+getVehicleName);
        System.out.println("Number of Wheels: "+ wheels);
        if(powerSteer == true) {
            System.out.println("Power Steering: Yes");
        }else  {
            System.out.println("Power Steering: Mo");
        }
    }

    public void accelerate(int speed) {
        super.accelerate(speed);
        System.out.println("Maxium acceleration: "+speed+"kmh");
    }

    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("LA-09 CS-1460","Volkswagen", 5, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}