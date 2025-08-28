package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write number 1: ");
            int number1 = scanner.nextInt();
            System.out.println("Write number 2: ");
            int number2 = scanner.nextInt();


                if (number2 == 0){
                    throw  new MyException("sandy 0 bolo albaisyn!");
                }
                System.out.println(number1/number2);
            }catch (MyException exception){
                System.out.println(exception.getMessage());
            }catch (InputMismatchException e ){
                System.out.println("san jaz!");
            }finally {
                System.out.println("kod toktodu");
            }
        }

    }

}
