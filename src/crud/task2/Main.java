package crud.task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFullName("Ernis Jaichibekov");
        customer1.setEmail("e@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(2006,4,6));
        customer1.setPhoneNumber("+996704556677");

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFullName("Nurperi Esenbaieva");
        customer2.setEmail("n@gmail.com");
        customer2.setDateOfBirth(LocalDate.of(2006,4,6));
        customer2.setPhoneNumber("+996704556677");

        Customer customer3 = new Customer();
        customer3.setId(3L);
        customer3.setFullName("Saikal");
        customer3.setEmail("n@gmail.com");
        customer3.setDateOfBirth(LocalDate.of(2006,4,6));
        customer3.setPhoneNumber("+996704556677");

        // CREATE
        System.out.println("~~~~~~~~~~~~~~CREATE~~~~~~~~~~~~");
        customer.createCustomer(customer1);
        customer.createCustomer(customer2);
        customer.createCustomer(customer3);

        // GET ALL
        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(customer.getAllCustomers()));

        // GET BY ID
        System.out.println("~~~~~~~~~~~~~GET BY ID~~~~~~~~~~~~~~");
        System.out.println(customer.getByIdCustomer(2L));

        //UPDATE
        System.out.println("~~~~~~~~~~~~~UPDATE~~~~~~~~~~~~~~~");
        Customer updateCustomer = new Customer();
        updateCustomer.setFullName("Sultan");
        updateCustomer.setEmail("s@gmail.com");
        customer.updateCustomerById(2L,updateCustomer);


        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(customer.getAllCustomers()));

        System.out.println("~~~~~~~~~~~~~~DELETE ~~~~~~~~~~~~~");
        customer.deleteCustomerById(1L);

        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(customer.getAllCustomers()));


    }
}
