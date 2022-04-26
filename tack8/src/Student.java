public class Student {
    private int RollNo;
    private String name;
    private ClassRoom myClass;

    public Student() {
        RollNo = 0;
        name = "Empty";
    }
    public Student(int rollNo, String name, ClassRoom myClass) {
        this.RollNo = rollNo;
        this.name = name;
        this.myClass = myClass;
    }
    public String getName() {
        return name;
    }

    public ClassRoom getMyClass() {
        return myClass;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMyClass(ClassRoom myClass) {
        this.myClass = myClass;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student " + myClass + "RollNo: " + RollNo + "Name: " + name;
    }

    public static void main(String[] args) {
        ClassRoom C1 = new ClassRoom(1, "T2109A");
        System.out.println(C1);
        Student S1 = new Student(1, "Anh Tuan",C1);
        System.out.println(S1.toString());
    }
}