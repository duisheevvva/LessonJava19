package crud.task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;


    public Customer() {
    }

    public Customer(long id, String fullName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // dannyidy saktash uchun massiv tuzobuz
    // TODO Database
    Customer[] customers = new Customer[10];
    int count = 0;

    //TODO  CRUD
    // TODO  C - Create
    public void createCustomer(Customer customer) {
        customers[count++] = customer;
        System.out.println("Success");
    }

    // TODO R - Read
    public Customer[] getAllCustomers() {
        return customers;
    }

    public Customer getByIdCustomer(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    // TODO U - UPDATE
    public void updateCustomerById(long id, Customer newCustomer) {
        // TODO Variant 1
//        Customer oldCustomer = getByIdCustomer(id);
//        oldCustomer.setFullName(newCustomer.getFullName());
//        oldCustomer.setEmail(newCustomer.getEmail());
//        System.out.println("Success!");

        // TODO Variant 2
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customer.setFullName(newCustomer.getFullName());
                customer.setEmail(newCustomer.getEmail());
                System.out.println("Success");
                break;
            } else {
                System.out.println("Customer with id:  " + id + "not found!");
            }
        }
    }

    // TODO D - DELETE
    public void deleteCustomerById(long id) {
        // index ochurobuz oshonduktan default index tuzobuz
        int index = -1;

        // ochurulo turgan indexti izdep taptyk
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = i;
                break;
            }
        }
        System.out.println(index);


        // jany biz ochurgon customerdi koshpoi
        // saktap alysh uchun masiiv tuzup atat
        Customer[] newCustomers = new Customer[customers.length - 1];
        // tabylgan index ke cheiinki dannyilardy
        // jany massivdin ichine saktaibyz

        for (int i = 0; i < index; i++) {
            newCustomers[i] = customers[i];
        }

        // tabylgan index ke kiinki  dannyilardy
        // jany massivdin ichine saktaibyz


        for (int i = 0; i < newCustomers.length; i++) {
            newCustomers[i] = customers[i + 1];
        }
        System.out.println(Arrays.toString(newCustomers));

        customers = newCustomers;
    }



    @Override
    public String toString() {
        return "\n Id: " + id + '\n' +
                "FullName: " + fullName + '\n' +
                "Email: " + email + '\n' +
                "DateOfBirth: " + dateOfBirth + '\n' +
                "PhoneNumber: " + phoneNumber;
    }
}
