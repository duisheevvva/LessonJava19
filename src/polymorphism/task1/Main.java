package polymorphism.task1;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Programmer(),
                new Dancer(),
                new Singer()};

        for (Person person: people) {
           person.walk();
        }

    }
}
