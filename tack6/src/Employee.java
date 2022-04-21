import java.lang.ref.SoftReference;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int ID, String FN, String LN, int S) {
        id = ID;
        firstName = FN;
        lastName = LN;
        salary = S;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int AnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        return salary += salary * percent;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                lastName + '\'' +
                ", salary=" + salary +
                ']';
    }
    public static void main(String[] args) {
        Employee objEmp1 = new Employee(1,"Tuan", "Anh", 12);
        System.out.println("Name: "+objEmp1.toString() +objEmp1.AnnualSalary()+"raiseSalary"+objEmp1.raiseSalary(1));

    }
}