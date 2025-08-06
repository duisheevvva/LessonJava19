package contructor.task2;

public class Student {
    String name;
    int age;
    int typing;

    // constructor bez param
    public Student() {

    }

    // constructor s param
    public Student(String name, int age, int typing) {
        this.name = name;
        if (age < 16) {
            System.out.println(name + "okuuga mumkunchulugu jok");
            this.age = 0;
        } else {
            this.age = age;
        }
        this.typing = typing;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Typing: " + typing);
    }
}
