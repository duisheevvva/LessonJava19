package modifiers;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.age=20;
        Student.method();
        Student.name ="Saikal";
        Student.method();
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("this static method");
    }

}
