package crud.task2.service;

import crud.task2.models.Customer;

public interface CustomerService {
    void createCustomer(Customer customer);
    Customer[] getAllCustomers();
    Customer getByIdCustomer(long id);
    void updateCustomerById(long id, Customer newCustomer);
    void deleteCustomerById(long id);

}
