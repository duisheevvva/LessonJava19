package contructor.task1;

public class Dog {
    String name;
    String colour;
    String breed;

    public Dog() {
    }

    public Dog(String name, String colour, String breed) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                "Colour: " + colour + "\n" +
                "Breed: " + breed);
    }
}
