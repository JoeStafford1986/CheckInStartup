import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;
    Passenger passenger;

    @Before
    public void before(){
        airport = new Airport();
        passenger = new Passenger();
    }

    @Test
    public void canCountCheckedInPassengerList(){
        assertEquals(0, airport.countCheckedInPassengerList());
    }

    @Test
    public void canAddPassengerToCheckedInPassengerList(){
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        assertEquals(1,airport.countCheckedInPassengerList());
    }


}
