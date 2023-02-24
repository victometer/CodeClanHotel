import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    private Hotel hotel;

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    private ArrayList <Bedroom> bedroomList;
    private ArrayList <ConferenceRoom> conferenceRoomList;

    @Before
    public void before(){
        guest1 = new Guest("Dave");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Sophie");

        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
        bedroom2 = new Bedroom(RoomType.FAMILY, 2);

        conferenceRoom1 = new ConferenceRoom(30, "Pool Room");
        conferenceRoom2 = new ConferenceRoom(50, "Long Bench Room");

        bedroomList = new ArrayList<Bedroom>(
                Arrays.asList (bedroom1, bedroom2));

        conferenceRoomList = new ArrayList<ConferenceRoom>(
                Arrays.asList(conferenceRoom1, conferenceRoom2));

        hotel = new Hotel("The Chanter Hotel", bedroomList, conferenceRoomList);
    }

    @Test
    public void hotelHasAName(){
        assertEquals("The Chanter Hotel", hotel.getName());
    }

    @Test
    public void hotelHasCorrectBedroomCount(){
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelHasCorrectConferenceRoomCount(){
        assertEquals(2, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckIfConferenceRoomHasSpace(){
        assertEquals(true, hotel.conferenceRoomHasSpace(conferenceRoom1));
    }

    @Test
    public void canCheckInToConferenceRoom(){
        hotel.addGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, hotel.getGuestCountInConferenceRoom(conferenceRoom1));
    }

    @Test
    public void checkIfGuestFitInBedroom(){
        assertEquals(true, hotel.bedroomHasEnoughRoom(bedroom1));
    }

    @Test
    public void can_CheckIntoBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.addGuestToBedroom(guest2, bedroom1);
        assertEquals(2, hotel.getGuestCountInBedroom(bedroom1));
    }

    @Test
    public void cannot_CheckIntoBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.addGuestToBedroom(guest2, bedroom1);
        hotel.addGuestToBedroom(guest3, bedroom1);
        assertEquals(2, hotel.getGuestCountInBedroom(bedroom1));
    }
}

//    @Test
//    public void checkIfBedroomIsAvailable(){
//        assertEquals(true, hotel.bedroomIsAvailable(bedroom1));
//    }



//    @Test
//    public void checkIfGuestDontFitInBedroom(){
//        assertEquals(true, hotel.bedroomHasEnoughRoom(bedroom1));
//    }


