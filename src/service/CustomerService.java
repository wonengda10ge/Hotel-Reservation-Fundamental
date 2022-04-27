package service;

import java.util.ArrayList;

import model.Customer;

public class CustomerService {
    public void addCustomer(String email, String firstName, String lastName) {

    }

    public Customer getCustomer(String customerEmail){
        return new Customer("test", "test", "test@email.com");
    }

    public ArrayList<Customer> getAllCustomers(){
        return new ArrayList<Customer>();
    }

}
