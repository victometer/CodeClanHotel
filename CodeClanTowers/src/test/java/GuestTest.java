import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Dave");
    }

    @Test
    public void hasName(){
        assertEquals("Dave", guest1.getName());
    }


}
