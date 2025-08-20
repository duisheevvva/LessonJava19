package abstraction.task1;

public class Main {
    public static void main(String[] args) {
        Car kia1 = new Kia("K5", "white", 100);
        Car kia2 = new Kia("K7", "black", 100);


        System.out.println("~~~~~~~~~~~~~~~~KIA1~~~~~~~~~~~~~~~~");
        System.out.println(kia1);
        kia1.gas();
        kia1.brake();

        System.out.println("~~~~~~~~~~~~~~~~KIA2~~~~~~~~~~~~~~~~");
        System.out.println(kia2);
        kia2.gas();
        kia2.brake();
    }
}
