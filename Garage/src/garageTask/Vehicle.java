package garageTask;

public abstract class Vehicle {

        public int id;
        public String color;
        public int numWheels;

        protected Vehicle(int id, String color, int numWheels){
            this.id = id;
            this.color = color;
            this.numWheels = numWheels;
        }

}
