package garageTask;

public class Motorcycle extends Vehicle {

    private int numSeats;

    public Motorcycle(int id, String color, int numWheels, int numSeats){
        super(id, color, numWheels);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
}
