import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Bag bag;
    Airport airport;
    @Before
    public void before(){
        flight = new Flight(30);
        passenger = new Passenger();
        airport = new Airport();
        bag = new Bag(10);
    }

    @Test
    public void canCountBagList(){
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canCountBoardedPassengerList() {
        assertEquals(0, flight.countBoardedPassengerList());
    }

    @Test
    public void canBoardPassengerToFlight(){
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        assertEquals(1, flight.countBoardedPassengerList());
        assertEquals(0, airport.countCheckedInPassengerList());
    }

    @Test
    public void canCheckBagWeightAllowed(){
        assertEquals(true, flight.checkBagWeight(bag));
    }

    @Test
    public void canCheckBagWeightNotAllowed(){
        Bag overweightBag = new Bag (31);
        assertEquals(false,flight.checkBagWeight(overweightBag));
    }

    @Test
    public void canAddBagToFlight(){
        flight.checkInBag(bag);
        assertEquals(1, flight.countBagList());
    }

    @Test
    public void canRemoveBoardedPassenger(){
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        flight.removeBoardedPassenger(passenger);
        assertEquals(0, flight.countBoardedPassengerList());
    }

    @Test
    public void cantRemoveBoardedPassengerNonExistant(){
        passenger.checkIn();
        airport.addCheckedInPassenger(passenger);
        flight.boardPassenger(airport, passenger);
        flight.removeBoardedPassenger(new Passenger());
        assertEquals(1, flight.countBoardedPassengerList());
    }



}
