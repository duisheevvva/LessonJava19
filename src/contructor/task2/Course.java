package contructor.task2;

import java.util.Arrays;

public class Course {
    String name;
    String instructorName;
    // has a relation
    Student[] students;

    public Course() {

    }

    public Course(String name, String instructorName, Student[] students) {
        if (name.length() <= 2) {
            System.out.println("атын туура жазыныз!");
            this.name = null;
        } else {
            this.name = name;
        }
        this.instructorName = instructorName;
        this.students = students;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                "Instructor Name: " + instructorName + "\n" );
    }

}
