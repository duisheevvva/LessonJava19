package crud.task2.service.serviceImpl;

import crud.task2.models.Customer;
import crud.task2.service.CustomerService;

import java.util.Arrays;

public class CustomerServiceImpl implements CustomerService {
    // dannyidy saktash uchun massiv tuzobuz
    // TODO Database
    Customer[] customers = new Customer[10];
    int count = 0;

    //TODO  CRUD
    // TODO  C - Create
    @Override
    public void createCustomer(Customer customer) {
        customers[count++] = customer;
        System.out.println("Success");
    }

    // TODO R - Read
    @Override
    public Customer[] getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getByIdCustomer(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    // TODO U - UPDATE
    @Override
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
                System.out.println("Customer with id:  " + id + " not found!");
            }
        }
    }

    // TODO D - DELETE
    @Override
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


        for (int i = index; i < newCustomers.length; i++) {
            newCustomers[i] = customers[i + 1];
        }
        System.out.println(Arrays.toString(newCustomers));

        customers = newCustomers;
    }
}
