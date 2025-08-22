package interfaces;

import interfaces.service.StudentService;
import interfaces.service.serviceImpl.StudentServiceImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        studentService.createStudent(new Student("Saikal",18));
        studentService.createStudent(new Student("Nurperi",18));

        System.out.println(Arrays.toString(studentService.getAllStudents()));

        System.out.println(studentService.getbyStudent("Nurperi"));
    }
}
