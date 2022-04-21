public class Student {
    private String name;
    private int age;

    public Student(String nameN, int ageA) {
        name = nameN;
        age = ageA;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Student objStd1 = new Student("Tuan", 18);
        System.out.println(objStd1.getName());
        System.out.println(objStd1.getAge());
    }

}
