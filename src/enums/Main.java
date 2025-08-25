package enums;

import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
//       Student student = new Student();
//       student.setName("Sultan");
//       student.setEmail("s@gmail.com");
//       student.setAge(18);
//       student.setGender(Gender.MALE);
//       student.setStudyFormat(StudyFormat.OFFLINE);
//
//        System.out.println(student);


        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Write name: ");
        student.setName(scanner.nextLine());
        System.out.println("Write email: ");
        student.setEmail(scanner.nextLine());
        System.out.println("Write age: ");
        student.setAge(new Scanner(System.in).nextInt());
        System.out.println("Write gender(MALE/FEMALE): ");
        String gender = scanner.nextLine();
        if (gender.equals("MALE")){
            student.setGender(Gender.MALE);
        } else if (gender.equals("FEMALE")) {
            student.setGender(Gender.FEMALE);
        }else System.out.println("Error: choose between MALE/FEMALE");
        student.setStudyFormat(StudyFormat.OFFLINE);

        System.out.println(student);
    }
}
