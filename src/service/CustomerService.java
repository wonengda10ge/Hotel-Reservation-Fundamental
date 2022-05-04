package service;
import java.util.ArrayList;
import model.Customer;

public class CustomerService {
    public void addCustomer(String email, String firstName, String lastName) {
        Customer newCustomer = new Customer(firstName, lastName, email);
        Customer.customers.put(newCustomer.getEmail(),newCustomer);
    }

    public Customer getCustomer(String customerEmail, ArrayList<Customer> customerList){
        return Customer.customers.get(customerEmail);
    }

    public ArrayList<Customer> getAllCustomers(){
        ArrayList<Customer> customerList = new ArrayList<Customer>(Customer.customers.values());
        return customerList;
    }

}
