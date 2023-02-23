import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(String name, ArrayList<Bedroom> bedroomList, ArrayList<ConferenceRoom> conferenceRoomList){
        this.name = name;
        this.bedroomList = bedroomList;
        this.conferenceRoomList = conferenceRoomList;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBedrooms(){
        return bedroomList.size();
    }

    public int getNumberOfConferenceRooms(){
        return bedroomList.size();
    }

    public int getGuestCountInConferenceRoom(ConferenceRoom room){
        return room.getGuestList();
    }

    public int getGuestCountInBedroom(Bedroom room){
        return room.getGuestList();
    }

    public boolean conferenceRoomHasSpace(ConferenceRoom room) {
        return (room.getCapacity() > room.getGuestList());
    }

    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom room) {
        if (conferenceRoomHasSpace(room)){
            room.addGuestToGuestList(guest);
        }
    }

    public boolean bedroomIsAvailable(Bedroom room) {
        return (room.getGuestList() == 0);
    }

    public boolean bedroomHasEnoughRoom(Bedroom room) {
        return (room.getGuestList() <= room.getCapacity());
    }

    public void addGuestToBedroom(Guest guest, Bedroom room) {
        if (bedroomIsAvailable(room)){
            room.addGuestToGuestList(guest);
        }
    }
}
