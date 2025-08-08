package contructor.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write name: ");
        String name = scanner.nextLine();
        System.out.println("Write age: ");
        int age = scanner.nextInt();

        Student student1 = new Student(name, age, 20);
        Student student2 = new Student("Ayana", 14, 30);
        Student[] students = {student1, student2};
        Course course = new Course("Ja" ,"Aizat",students);

        course.getInfo();
        for (Student student: course.students) {
            student.getInfo();
        }



    }
}





