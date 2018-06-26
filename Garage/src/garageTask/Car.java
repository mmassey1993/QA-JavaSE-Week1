package garageTask;

public class Car extends Vehicle {

    private int numDoors;

    public Car(int id, String color, int numWheels){
        super(id, color, numWheels);
        this.numDoors = 4;
    }
}
