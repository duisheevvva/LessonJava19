package modifiers;

public   class Student {

    public static class Test{

    }
    public static String name;
    public int age;

    public static void method(){
        System.out.println("this method in parent class");
        Main main = new Main();
        Main.staticMethod();
    }


}
