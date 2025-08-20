package polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("");
        Animal cat = new Cat();
        cat.voice();
        Animal dog = new Dog();
        dog.voice();
    }

    public void method(String name,int age){

    }
    public void method(String colour,int number,double price){

    }
    public void method(String name){

    }

    public void method(int age,String breed){

    }



}
