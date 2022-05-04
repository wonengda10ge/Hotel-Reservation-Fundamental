package model;
import java.util.regex.Pattern;
import java.util.HashMap;
/**
 * @TODO need to add regex within the constructor to validate the format of the customer email
 */
public class Customer {
    public static HashMap<String, Customer> customers;
    private String firstName;
    private String lastName;
    private String email;

    private final static String EMAIL_REGEX = "^(.+)@(.+).(.+)";
    private final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);


    public Customer(String firstName, String lastName, String email){
        if(! emailPattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid Email!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return "Customer First Name : " + this.firstName + "\n"
                + "Customer Last Name : " + this.lastName + "\n"
                + "Customer email : " + this.email + "\n";
    }
}
