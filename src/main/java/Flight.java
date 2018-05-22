import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> boardedPassengerList;
    private ArrayList<Bag> bagList;
    private int maxBagWeight;

    public Flight(int maxBagWeight){
        this.boardedPassengerList = new ArrayList<>();
        this.bagList = new ArrayList<>();
        this.maxBagWeight = maxBagWeight;
    }

    public void boardPassenger(Airport airport, Passenger passenger) {
        if ( airport.checkIfPassengerIsInList(passenger)){
            this.boardedPassengerList.add(passenger);
            airport.removeCheckedInPassenger(passenger);
        }
    }

    public int countBoardedPassengerList() {
       return this.boardedPassengerList.size();
    }

    public void checkInBag(Bag bag) {
        this.bagList.add(bag);
    }


    public int countBagList() {
        return this.bagList.size();
    }

    public void removeBoardedPassenger(Passenger passenger){
        boardedPassengerList.remove(passenger);
    }


    public boolean checkBagWeight(Bag bag) {
        return bag.getWeight() <= this.maxBagWeight;
    }
}
