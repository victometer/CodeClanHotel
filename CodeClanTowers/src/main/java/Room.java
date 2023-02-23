import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestList = new ArrayList<> ();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestList() {
        return guestList.size();
    }

    public void addGuestToGuestList(Guest guest){
        this.guestList.add(guest);
    }

//    public void
}
