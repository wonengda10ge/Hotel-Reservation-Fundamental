package service;

import java.util.ArrayList;
import model.Customer;

public class CustomerService {
    public void addCustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        
    }

    public Customer getCustomer(String customerEmail, ArrayList<Customer> customerList){

        for(Customer customer : customerList){
            if(customer.getEmail() == customerEmail){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomers(){
        // return customerList
        return null;
    }

}
