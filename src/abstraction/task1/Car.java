package abstraction.task1;

public abstract class Car {
    private String model;
    private String colour;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, String colour, int maxSpeed) {
        this.model = model;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // TODO abstractMethods
    public abstract void gas();

    public abstract void brake();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
