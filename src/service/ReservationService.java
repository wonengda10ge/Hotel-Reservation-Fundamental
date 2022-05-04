package service;

import model.IRoom;
import model.RoomType;
import model.Reservation;
import model.Room;
import model.Customer;

import java.util.ArrayList;
import java.util.Date;

public class ReservationService {
    public void addRoom(String roomNumber, Double price, RoomType enumeration, boolean isFree){
        Room newRoom = new Room(roomNumber, price, enumeration, isFree);
        Room.rooms.add(newRoom);
    }

    public Room getARoom(String roomId){
        for(Room room : Room.rooms) {
            if(room.getRoomNumber() == roomId) { return room; }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation newReservation = new Reservation(customer, room, checkInDate, checkOutDate);
        Reservation.reservations.add(newReservation);
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
