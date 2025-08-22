package interfaces.service.serviceImpl;

import interfaces.Student;
import interfaces.service.StudentService;

public class StudentServiceImpl implements StudentService {

    Student[] students = new Student[10];

    int countIndex = 0;
    @Override
    public void createStudent(Student student) {
        students[countIndex++] = student;
    }

    @Override
    public Student[] getAllStudents() {
        return students;
    }



    @Override
    public Student getbyStudent(String name) {
        for (Student student: students) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(String name, Student newStudent) {

    }

    @Override
    public void deleteStudent(String name) {

    }
}
