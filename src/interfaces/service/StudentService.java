package interfaces.service;


import interfaces.Student;

public interface StudentService {

    // TODO CRUD
    // create
    void createStudent(Student student);
    // read
    Student[] getAllStudents();

    Student getbyStudent(String name);

    // update
    void updateStudent(String name,Student newStudent);
    //delete
    void deleteStudent(String name);
}
