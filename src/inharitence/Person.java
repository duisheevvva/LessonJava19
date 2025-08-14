package inharitence;

import contructor.task2.Student;

public class Person {
    private String name;
    private String email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void method() {
        System.out.println("This is method in parent class");
    }
}
