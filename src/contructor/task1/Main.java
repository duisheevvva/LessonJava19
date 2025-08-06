package contructor.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~Cats~~~~~~~~~~~~~~~~");
        // baz param
        Cat cat1 = new Cat();
        cat1.name ="Myi-Myi";
        cat1.age = 4;
        cat1.colour = "black";

        cat1.getInfo();
        // s param
        Cat cat2 = new Cat("Murka",5,"white");

        cat2.getInfo();


        System.out.println("~~~~~~~~~~~~Dogs~~~~~~~~~~~~~~~~");
        // bez param
        Dog dog1 = new Dog();
        dog1.name = "Ak tosh";
        dog1.colour ="brown";
        dog1.breed = "alabai";
        dog1.getInfo();

        // s param
        Dog dog2 = new Dog("Sharik","black","chi-hua hua");

        dog2.getInfo();


    }
}
