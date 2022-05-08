public class Fulltime extends Staff {

    public Fulltime(String name, int id) {
        super(name, id);

    }

    public float getSalary() {
        return 20000;
    }

    @Override
    public String toString() {
        return "FullTime " +
                "Name: " + getName() +
                ", ID: " + getId() +
                ", Salary: " + getSalary();
    }
}