package garageTask;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car Ford = new Car(1, "red", 4);
        garage.addGarage(Ford);

        Car Audi = new Car(2, "silver", 4);
        garage.addGarage(Audi);

        Motorcycle Yamaha = new Motorcycle(3, "blue", 2);
        garage.addGarage(Yamaha);

        Motorcycle Honda = new Motorcycle(4, "black", 2);
        garage.addGarage(Honda);

        Lorry Volvo = new Lorry(5, "white", 14);
        garage.addGarage(Volvo);

        Lorry Iveco = new Lorry(6, "red", 14);
        garage.addGarage(Iveco);


        garage.garageBill2();
        garage.removeGarageByID(5);
        garage.clearGarage();
        garage.printGarage();
    }
}
