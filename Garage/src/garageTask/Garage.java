package garageTask;

import java.util.ArrayList;
public class Garage {
    private static ArrayList<Vehicle> garage = new ArrayList(); // arraylist of each vehicle created/instantiated

    /*public static void garageBill(){
        int totalBill = 0;

        for (Vehicle v : garage){
            if (v.numWheels <=2){ // v.numWheels - seeing the numWheels value through the lens of v
                totalBill = 100;
            } else if (v.numWheels <=4){
                totalBill = 200;
            } else if (v.numWheels <=18){
                totalBill = 500;
            } else {
                totalBill = 0;
            }
            if (totalBill == 0) {
                System.out.println("We cannot service your vehicle");
            } else
                System.out.println("Your total bill is " + totalBill);
        }
    }*/
    void printGarage(){
        for (Vehicle v : garage){
            System.out.println("ID: " + v.id + "\nColor: " + v.color + "\nNo. of Wheels: " + v.numWheels + "\n");
        }
    }
    void addGarage(Vehicle vehicle){ //Function which takes parameter of object type vehicle and adds it to garage array list
        garage.add(vehicle);
    }

    void garageBill2(){
        int totalBill = 0;

        for (Vehicle v : garage){
            if (v instanceof Car){ // v.numWheels - seeing the numWheels value through the lens of v
                totalBill = 100;
            } else if (v instanceof Motorcycle){
                totalBill = 150;
            } else {
                totalBill = 1000;
            }
            if (totalBill == 0) {
                System.out.println("We cannot service your vehicle");
            } else
                System.out.println("The total bill for the vehicle ID " + v.id + " is £"+ totalBill);
        }
    }

    void removeFromGarageByID(int id){
        for (Vehicle v : garage){
            if (v.id == id){
                garage.remove(v);
            }
        }
    }





}
