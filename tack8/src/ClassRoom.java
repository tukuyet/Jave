public class ClassRoom {
    private int classID;
    private String className;

    public ClassRoom() {
        classID = 0;
        className = "Empty";
    }

    public ClassRoom(int ClassID, String ClassName) {
        classID = ClassID;
        className = ClassName;
    }

    public int getClassID() {
        return classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom " +
                "classID=" + classID +
                ", className='" + className + " "
                ;
    }

    public static void main(String[] args) {
        ClassRoom Cl1 = new ClassRoom();
        System.out.println(Cl1.toString());
        ClassRoom Cl2 = new ClassRoom(1, "Anh Quan");
        System.out.println(Cl2.toString());
    }
}