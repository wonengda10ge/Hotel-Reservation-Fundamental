package model;

public class Room implements IRoom {
    
    private String roomNumber;
    private Double price;
    private RoomType enumeration;
    private boolean isFree;

    public Room(String roomNumber, Double price, RoomType enumeration, boolean isFree){
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
        this.isFree = isFree;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }
    
    public RoomType getRoomType(){
        return this.enumeration;
    }

    public Double getRoomPrice(){
        return this.price;
    }

    public boolean isFree(){
        return this.isFree;
    }

    @Override
    public String toString(){
        return "Room Number" + this.roomNumber + "\n"
                + "Room Price" + this.price + "\n"
                + "Room Type" + this.enumeration + "\n"
                + "Is room free ? " + this.isFree + "\n";
    }
}
