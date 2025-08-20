package abstraction;

public  abstract class Animal {
    private String name;
    private int age;
    private String colour;
    private String breed;

    public Animal() {
    }

    public Animal(String name, int age, String colour, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public  void standartMethod(){

    }

    public String standartReturnMethod(){
        return "";
    }

    public abstract void abstractMethod();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
