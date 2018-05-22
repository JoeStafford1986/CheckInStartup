import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;
    Passenger passenger;


    @Before
    public void before() {
        airport = new Airport();
        passenger = new Passenger();
    }


    @Test
    public void canCountCheckedInPassengers() {
        assertEquals(0, airport.countCheckedInPassengers());
    }

    @Test
    public void canAddCheckedInPassenger() {
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        assertEquals(1, airport.countCheckedInPassengers());
    }
}
