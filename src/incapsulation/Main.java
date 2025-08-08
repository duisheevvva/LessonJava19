package incapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerForNumber = new Scanner(System.in);
        Scanner scannerForString = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Write firstname: ");
        student.setFirstName(scannerForString.nextLine());
        System.out.println("Write surname: ");
        student.setSurname(scannerForString.nextLine());
        System.out.println("Write age: ");
        student.setAge(scannerForNumber.nextInt());

        System.out.println("Add courses: ");
        System.out.println(" Course 1: ");
        String course1 = scannerForString.nextLine();
        System.out.println("Course 2: ");
        String course2 = scannerForString.nextLine();

        String [] courses = {course1,course2};
        student.setCourses(courses);

        System.out.println("FirstName: " +  student.getName() + "\n" +
                        "Surname: " + student.getSurname()+ "\n" +
                "Age: " + student.getAge()+ "\n" +
                "Courses: " + Arrays.toString(student.getCourses()));












//        Rectangle rectangle = new Rectangle();
//
//        rectangle.setTuurasy(5);
//        rectangle.setBiiktigi(3);
//
//        System.out.println("Tuurasy: " + rectangle.getTuurasy());
//        System.out.println("Biiktigi: " + rectangle.getBiiktigi());
//        System.out.println("Area: " + rectangle.getArea());



    }
}
