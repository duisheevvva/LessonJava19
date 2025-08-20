package abstraction.task1;

public class Audi extends Car {

    public Audi() {
    }

    public Audi(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Машина Audi газует");
    }

    @Override
    public void brake() {
        System.out.println("Машина Audi тормозит");
    }


}
