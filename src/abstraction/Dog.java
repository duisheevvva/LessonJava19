package abstraction;

public class Dog extends Animal{

    @Override
    public void abstractMethod() {
        System.out.println("gaf-gaf");
    }

    public Dog() {
    }

    public Dog(String name, int age, String colour, String breed) {
        super(name, age, colour, breed);
    }
}
