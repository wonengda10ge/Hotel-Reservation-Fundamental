package model;
import java.util.ArrayList;

public class FreeRoom extends Room {
    public static ArrayList<FreeRoom> freeRooms;
    private String roomNumber;
    private RoomType enumeration;

    public FreeRoom(String roomNumber, RoomType enumeration){
        super(roomNumber, 0.0, enumeration, true);
    }

    @Override
    public String toString(){
        return "Free Room Number" + this.roomNumber + "\n"
                + "Free Room Type" + this.enumeration + "\n";
    }
}
