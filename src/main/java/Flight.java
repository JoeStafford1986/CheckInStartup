import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> boardedPassengers;
    private ArrayList<Bag> boardedBags;
    private int maxBagWeight;

    public Flight(int maxBagWeight) {
        this.boardedPassengers = new ArrayList<>();
        this.boardedBags = new ArrayList<>();
        this.maxBagWeight = maxBagWeight;
    }

    public void boardPassenger(Airport airport, Passenger passenger) {
        if ( airport.checkIfPassengerIsInList(passenger)) {
            this.boardedPassengers.add(passenger);
            airport.removeCheckedInPassenger(passenger);
        }
    }

    public int countBoardedPassengerList() {
       return this.boardedPassengers.size();
    }

    public void checkInBag(Bag bag) {
        this.boardedBags.add(bag);
    }

    public int countBags() {
        return this.boardedBags.size();
    }

    public void removeBoardedPassenger(Passenger passenger) {
        boardedPassengers.remove(passenger);
    }

    public boolean checkBagWeight(Bag bag) {
        return bag.getWeight() <= this.maxBagWeight;
    }
}
