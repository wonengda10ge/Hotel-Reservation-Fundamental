package model;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    
    public static ArrayList<Reservation> reservations;
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Customer Name : " + this.customer + "\n"
                + "Room : " + this.room + "\n"
                + "Check In Date : " + this.checkInDate + "\n"
                + "Check Out Date : " + this.checkOutDate + "\n";
    }
}
