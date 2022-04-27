package api;

import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Room;
import model.IRoom;

/**
 * @TODO need to provide a static refernce
 */
public class AdminResource {
    public Customer getCustomer(String email) {
        return new Customer("firstName", "lastName", "email");
    }

    public void addRoom(List<Room> rooms){

    }

    public ArrayList<IRoom> getAllRooms(){
        return new ArrayList<IRoom>();
    }

    public ArrayList<Customer> getAllCustomers() {
        return new ArrayList<Customer>();
    }

    public void displayAllReservations(){
        System.out.println("");
    }
}
