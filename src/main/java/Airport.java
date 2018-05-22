import java.util.ArrayList;

public class Airport {
    private ArrayList<Passenger> checkedInPassengers;


    public Airport() {
        this.checkedInPassengers = new ArrayList<>();
    }


    public int countCheckedInPassengers() {
        return this.checkedInPassengers.size();
    }

    public void addCheckedInPassenger(Passenger passenger) {
        if(passenger.getCheckInStatus()){
            this.checkedInPassengers.add(passenger);
        }
    }

    public boolean checkIfPassengerIsInList(Passenger passenger) {
        return this.checkedInPassengers.contains(passenger);
    }

    public void removeCheckedInPassenger(Passenger passenger) {
        checkedInPassengers.remove(passenger);
    }
}
