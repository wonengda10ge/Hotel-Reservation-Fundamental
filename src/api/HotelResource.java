package api;

import java.util.ArrayList;
import java.util.Date;

import model.Customer;
import model.IRoom;
import model.Reservation;
/**
 * @TODO need to provide a static reference
 */
public class HotelResource {
    public Customer getCustomer(String email){
        return new Customer("", "lastName", "email");
    }

    public void createACustomer(String firstName, String lastName, String email) {

    }

    public IRoom getRoom(String roomNumber) {
        return null;
    }

    public Reservation bookARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return new Reservation(customer, room, checkInDate, checkOutDate);
    }

    public ArrayList<Reservation> getCustomerReservations(String customerEmail) {
        return new ArrayList<Reservation>();
    }

    public ArrayList<IRoom> findARoom(Date checkInDate, Date checkOutDate) {
        return new ArrayList<IRoom>();
    }
}
