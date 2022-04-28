public class PartTimeEmployee extends Employee {
    String shift;
    public PartTimeEmployee(String id, String name, int sal, String shift) {
        super(id,name,sal);
        this.shift=shift;
    }
    public void displayDetails() {
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift: "+shift);
        System.out.println("Working shift: "+shift);
    }

    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemmeth", 40000);
        objEmp.calcCommission(2000F);
        objEmp.displayDetails();
        System.out.println("-----------------------");
        Employee objEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        objEmp1.displayDetails();

    }
}