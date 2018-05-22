import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    Flight flight;

    @Before
    public void before(){
        passenger = new Passenger() ;
    }

    @Test
    public void canGetCheckInStatus(){
        assertEquals(false, passenger.getCheckInStatus());
    }

    @Test
    public void canCheckIn(){
        passenger.checkIn();
        assertEquals(true, passenger.getCheckInStatus());
    }




}
