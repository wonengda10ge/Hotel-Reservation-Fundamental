package service;

import model.IRoom;
import model.Reservation;
import model.Customer;

import java.util.ArrayList;
import java.util.Date;

public class ReservationService {
    public void addRoom(IRoom room){

    }

    public IRoom getARoom(String roomId){
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation newReservation = new Reservation(customer, room, checkInDate, checkOutDate);
        return newReservation;
    }

    public ArrayList<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return new ArrayList<IRoom>();
    }

    public ArrayList<Reservation> getCustomerReservation(Customer customer) {
        return new ArrayList<Reservation>();
    }

    public void printAllReservations(){
        System.out.println("");
    }

 
}
