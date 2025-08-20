package abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Aktosh",4,"brown","ovcharka");
        Dog dog1 = new Dog();
        dog1.setName("Gerda");
        dog1.setAge(5);
        dog1.setColour("black");
        dog1.setBreed("haski");

        Animal cat = new Cat();


        System.out.println(dog);
    }
}
