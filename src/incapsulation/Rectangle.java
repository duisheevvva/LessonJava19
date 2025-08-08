package incapsulation;

public class Rectangle {
    // pole
    private int tuurasy;
    private int biiktigi;


    // constructors
    //...

    // get
    public int getTuurasy() {
        return tuurasy;
    }

    public int getBiiktigi() {
        return biiktigi;
    }

    // set
    public void setTuurasy(int tuurasy) {
        this.tuurasy = tuurasy;
    }

    public void setBiiktigi(int biiktigi) {
        this.biiktigi = biiktigi;
    }

    // methods

    public int getArea(){
        return tuurasy*biiktigi;
    }
}
