import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 34);
        guest1 = new Guest("Michael");
    }

    @Test
    public void bedroomHasCorrectCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void BedroomHasRoomNumber(){
        assertEquals(34, bedroom1.getRoomNumber());
    }

    @Test
    public void BedroomGuestListStartsEmpty(){
        assertEquals(0, bedroom1.getGuestList());
    }

    @Test
    public void canAddGuestToGuestList(){
        bedroom1.addGuestToGuestList(guest1);
        assertEquals(1, bedroom1.getGuestList());
    }
}
