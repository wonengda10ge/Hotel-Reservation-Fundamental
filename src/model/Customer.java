package model;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer First Name : " + this.firstName + "\n"
                + "Customer Last Name : " + this.lastName + "\n"
                + "Customer email : " + this.email + "\n";
    }
}
