import java.util.ArrayList;

public class Airport {

    private ArrayList<Passenger> checkedInPassengerList;

    public Airport(){
        this.checkedInPassengerList = new ArrayList<>();
    }




    public int countCheckedInPassengerList() {
         return this.checkedInPassengerList.size();
    }


    public void addCheckedInPassenger(Passenger passenger) {
        if(passenger.getCheckInStatus() ==true){
            this.checkedInPassengerList.add(passenger);

        }
    }

    public boolean checkIfPassengerIsInList(Passenger passenger) {
      return this.checkedInPassengerList.contains(passenger);
    }

    public void removeCheckedInPassenger(Passenger passenger){
        checkedInPassengerList.remove(passenger);
    }


}
