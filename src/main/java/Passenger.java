import java.util.ArrayList;

public class Passenger {

    private boolean checkInStatus;
    private ArrayList<Bag> bagList;

    public Passenger(){
        this.checkInStatus = false;
        this.bagList = new ArrayList<>();
    }


    public boolean getCheckInStatus() {
        return this.checkInStatus;
    }

    public void checkIn() {
        this.checkInStatus = true;
    }




}
