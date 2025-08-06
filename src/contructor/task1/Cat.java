package contructor.task1;

public class Cat {
    String name;
    int age;
    String colour;

    // bez param
    public Cat() {

    }

    // s param
    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Colour: " + colour);
    }
}
