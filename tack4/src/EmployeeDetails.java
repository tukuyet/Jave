public class EmployeeDetails {
    public static void main(String[] args) {
        Employee objEmp = new Employee(1300, "Clara Smith");
        objEmp.empDesig = "Receptionist";
        objEmp.setSSN("282-72-3873");
        objEmp.display();
    }
}