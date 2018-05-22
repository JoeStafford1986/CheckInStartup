import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Bag bag;
    Airport airport;


    @Before
    public void before() {
        flight = new Flight(30);
        passenger = new Passenger();
        airport = new Airport();
        bag = new Bag(10);
    }


    @Test
    public void canCountBags() {
        assertEquals(0, flight.countBags());
    }

    @Test
    public void canCountBoardedPassengers() {
        assertEquals(0, flight.countBoardedPassengers());
    }

    @Test
    public void canBoardPassenger() {
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        assertEquals(1, flight.countBoardedPassengers());
        assertEquals(0, airport.countCheckedInPassengers());
    }

    @Test
    public void canCheckBagWeightAllowed() {
        assertEquals(true, flight.checkBagWeight(bag));
    }

    @Test
    public void canCheckBagWeightNotAllowed() {
        Bag overweightBag = new Bag (31);
        assertEquals(false,flight.checkBagWeight(overweightBag));
    }

    @Test
    public void canAddBagToFlight() {
        flight.checkInBag(bag);
        assertEquals(1, flight.countBags());
    }

    @Test
    public void canRemoveBoardedPassenger() {
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        flight.removeBoardedPassenger(passenger);
        assertEquals(0, flight.countBoardedPassengers());
    }

    @Test
    public void cantRemoveBoardedPassengerCannotFindPassenger() {
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        flight.removeBoardedPassenger(new Passenger());
        assertEquals(1, flight.countBoardedPassengers());
    }
}
