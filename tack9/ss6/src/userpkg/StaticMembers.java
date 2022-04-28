package userpkg;

public class StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;
    static {
        System.out.println("I am a static block");
    }
    public static void staticMethod() {
        System.out.println("I am a static method");
    }
    public void displayCount() {
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is: "+ staticCounter);
        System.out.println("Instance counter is: "+ instanceCounter);

    }

//    public static void main(String[] args) {
//        System.out.println("I am the main method");
//        userpkg.StaticMembers.staticMethod();
//        userpkg.StaticMembers.staticMethod();
//        userpkg.StaticMembers objStatic1 = new userpkg.StaticMembers();
//        objStatic1.displayCount();
//        userpkg.StaticMembers objStatic2 = new userpkg.StaticMembers();
//        objStatic2.displayCount();
//        userpkg.StaticMembers objStatic3 = new userpkg.StaticMembers();
//        objStatic3.displayCount();
//    }
}