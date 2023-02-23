import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(50, "Morag Room");
        guest1 = new Guest("Alan");
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(50, conferenceRoom1.getCapacity());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Morag Room", conferenceRoom1.getName());
    }

    @Test
    public void conferenceRoomGuestListStartsEmpty(){
        assertEquals(0, conferenceRoom1.getGuestList());
    }

    @Test
    public void canAddGuestToGuestList(){
        conferenceRoom1.addGuestToGuestList(guest1);
        assertEquals(1, conferenceRoom1.getGuestList());
    }

}
