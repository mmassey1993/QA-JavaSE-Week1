package garageTask;

public class Motorcycle extends Vehicle {

    private int numSeats;

    public Motorcycle(int id, String color, int numWheels){
        super(id, color, numWheels);
        this.numSeats = 1;
    }
}
