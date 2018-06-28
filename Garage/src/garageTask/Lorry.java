package garageTask;

public class Lorry extends Vehicle {

    private int numGears;

    public Lorry(int id, String color, int numWheels, int numGears){
        super(id, color, numWheels);
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }
}