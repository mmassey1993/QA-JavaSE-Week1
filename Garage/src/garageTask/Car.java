package garageTask;

public class Car extends Vehicle {

    private int numDoors;

    public Car(int id, String color, int numWheels, int numDoors){
        super(id, color, numWheels);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
