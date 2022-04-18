public class student {
    String name;
    int age;

    public student(String Tuan) {
        name = Tuan;
    }

    public student(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public class Teststudent {
        public static void main(String[] args) {
            student s1 = new student("Tuan");
            System.out.println("Name is :" + s1.getName());

            student s2 = new student(18);
            System.out.println("Age :" + s2.getAge());
        }
    }
}
