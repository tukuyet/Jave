import java.util.Arrays;

public class Student extends Person {
    private int numCourse;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address) {
        super(name,address);
        numCourse = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Student{" +
                "numCourse=" + numCourse +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
    public void addCourseGrade(String course, int grade) {
        courses[numCourse] = course;
        grades[numCourse] = grade;
        ++numCourse;
    }
    public void printGrade() {
        for(int i=0;i<numCourse;i++) {
            System.out.println(" "+ courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade() {
        int sum = 0;
        for(int i = 0;i<numCourse;i++) {
            sum+=grades[i];
        }
        return (double) sum/numCourse;
    }
}