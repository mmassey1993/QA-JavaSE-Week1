package garageTask;

public class Lorry extends Vehicle {

    private int numGears;

    public Lorry(int id, String color, int numWheels){
        super(id, color, numWheels);
        this.numGears = 12;
    }
}