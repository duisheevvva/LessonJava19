package crud.task1;

public class House {
    private  long id;
    private String address;
    private int numberOfRooms;
    private double area;

    //bez param
    public House (){

    }

    // s param

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    // getter
    public String getAddress(){
        return address;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public double getArea(){
        return area;
    }

    // setter
    public void setAddress(String address){
        this.address = address;
    }

    public void setNumberOfRooms (int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public void setArea(double area){
        this.area = area;
    }

    // dop methods
    public double calculatePrice(int price){
        return area * price;
    }

    // to String
    @Override
    public String toString() {
        return "address: " + address + '\'' +
                " numberOfRooms: " + numberOfRooms +
                " area: " + area;
    }
}
