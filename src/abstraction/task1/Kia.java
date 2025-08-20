package abstraction.task1;

public class Kia extends Car{
    public Kia() {
    }

    public Kia(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Машина KIA "  + getModel()+ " газует");
    }

    @Override
    public void brake() {
        System.out.println("Машина KIA "  + getModel()+ " тормозит");
    }


}
