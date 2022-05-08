public class PartTime extends Staff {
    private int hour;
    public PartTime(String name, int id, int hour) {
        super(name, id);
        this.hour = hour;
    }

    public float getSalary() {
        return 150;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public float SUM() {
        return hour*getSalary();
    }

    @Override
    public String toString() {
        return "PartTime " +
                "Name: " + getName() +
                ", ID: "+ getId() + ", HOUR: " +getHour() +
                ", SUM: " + SUM();
    }
}
