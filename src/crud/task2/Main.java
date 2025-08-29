package crud.task2;

import crud.task2.models.Customer;
import crud.task2.service.CustomerService;
import crud.task2.service.serviceImpl.CustomerServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Customer customer1 = new Customer();
//        customer1.setId(1L);
//        customer1.setFullName("Ernis Jaichibekov");
//        customer1.setEmail("e@gmail.com");
//        customer1.setDateOfBirth(LocalDate.of(2006,4,6));
//        customer1.setPhoneNumber("+996704556677");
//
//        Customer customer2 = new Customer();
//        customer2.setId(2L);
//        customer2.setFullName("Nurperi Esenbaieva");
//        customer2.setEmail("n@gmail.com");
//        customer2.setDateOfBirth(LocalDate.of(2006,4,6));
//        customer2.setPhoneNumber("+996704556677");
//
//        Customer customer3 = new Customer();
//        customer3.setId(3L);
//        customer3.setFullName("Saikal");
//        customer3.setEmail("n@gmail.com");
//        customer3.setDateOfBirth(LocalDate.of(2006,4,6));
//        customer3.setPhoneNumber("+996704556677");

        // CREATE
//        System.out.println("~~~~~~~~~~~~~~CREATE~~~~~~~~~~~~");
//        customer.createCustomer(customer1);
//        customer.createCustomer(customer2);
//        customer.createCustomer(customer3);
//
//        // GET ALL
//        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));
//
//        // GET BY ID
//        System.out.println("~~~~~~~~~~~~~GET BY ID~~~~~~~~~~~~~~");
//        System.out.println(customer.getByIdCustomer(2L));
//
//        //UPDATE
//        System.out.println("~~~~~~~~~~~~~UPDATE~~~~~~~~~~~~~~~");
//        Customer updateCustomer = new Customer();
//        updateCustomer.setFullName("Sultan");
//        updateCustomer.setEmail("s@gmail.com");
//        customer.updateCustomerById(2L,updateCustomer);
//
//
//        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));
//
//        System.out.println("~~~~~~~~~~~~~~DELETE ~~~~~~~~~~~~~");
//        customer.deleteCustomerById(1L);
//
//        System.out.println("~~~~~~~~~~~~~~GET ALL ~~~~~~~~~~~~~");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));

        Scanner scannerForString = new Scanner(System.in);
        Scanner scannerForInt = new Scanner(System.in);
        CustomerService customerService = new CustomerServiceImpl();

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                     Choose command: 
                     1.create
                     2.getAll
                     3.getById
                     4.update
                     5.delete
                     6.exit              
                    """);

            int command = scannerForInt.nextInt();


            switch (command) {
                case 1: {
                    Customer customer1 = new Customer();
                    System.out.println("Write id: ");
                    customer1.setId(scannerForInt.nextLong());
                    System.out.println("Write name: ");
                    customer1.setFullName(scannerForString.nextLine());
                    System.out.println("Write email: ");
                    customer1.setEmail(scannerForString.nextLine());
                    System.out.println("Write dateOfBirth: ");
                    customer1.setDateOfBirth(LocalDate.of(scannerForInt.nextInt(), scannerForInt.nextInt(), scannerForInt.nextInt()));
                    System.out.println("Write phoneNumber: ");
                    customer1.setPhoneNumber(scannerForString.nextLine());
                    customerService.createCustomer(customer1);
                }
                break;
                case 2:
                    System.out.println(Arrays.toString(customerService.getAllCustomers()));
                    break;
                case 3:
                    System.out.println("Write id for search: ");
                    System.out.println(customerService.getByIdCustomer(scannerForInt.nextInt()));
                    break;
                case 4: {
                    System.out.println("Write old customer id: ");
                    long oldId = scannerForInt.nextInt();
                    Customer updateCustomer = new Customer();
                    System.out.println("new name: ");
                    updateCustomer.setFullName(scannerForString.nextLine());
                    System.out.println("new email: ");
                    updateCustomer.setEmail(scannerForString.nextLine());
                    customerService.updateCustomerById(oldId, updateCustomer);
                }
                break;
                case 5 :
                    System.out.println("Write delete customer id: ");
                    customerService.deleteCustomerById(scannerForInt.nextInt());
                    break;
                case 6: isTrue=false;
                break;
                default:
                    System.out.println("Command not found!!");
            }
        }


    }
}
