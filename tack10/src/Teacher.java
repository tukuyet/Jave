import java.util.Arrays;

public class Teacher extends Student {
    private int numCourse;
    private String[] courses;
    private static final int MAX_COURES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        numCourse = 0;
        courses = new String[MAX_COURES];
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "numCourse=" + numCourse +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean addCourse(String course) {
        for(int i=0;i<numCourse;i++) {
            if(courses[i].equals(course)) return false;
        }
        courses[numCourse] = course;
        numCourse++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean found = false;
        int courseIndex = -1;
        for(int i =0;i<numCourse;i++) {
            if(courses[i].equals(course)) {
                courseIndex = i;
                found = true;
                break;
            }
        }
        if(found) {
            for(int i =courseIndex;i<numCourse-1;i++) {
                courses[i] = courses[i+1];
            }
            numCourse--;
            return true;
        }else {
            return false;
        }
    }





}