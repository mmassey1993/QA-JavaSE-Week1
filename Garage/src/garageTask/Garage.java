package garageTask;

import java.util.ArrayList;
public class Garage {
    private static ArrayList<Vehicle> garage = new ArrayList(); // arraylist of each vehicle created/instantiated
    private static ArrayList<Vehicle> tempList = new ArrayList(); //temp list for solving the remove function problem
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
    public void printGarage(){
        for (Vehicle v : garage){
            System.out.println("ID: " + v.id + "\nColor: " + v.color + "\nNo. of Wheels: " + v.numWheels + "\n");
        }
    }
    public void addGarage(Vehicle vehicle){ //Function which takes parameter of object type vehicle and adds it to garage array list
        garage.add(vehicle);
    }

    public void garageBill2(){
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

    public void removeGarageByID(int id){
        for (Vehicle v : garage){
            if (v.id == id){
                tempList.add(v); //need to add to new list before removing. If remove step is here,
            }                    // Concurrent Modification error occurs as you're trying to edit and delete in same step. Add to temp list and delete from that to solve
        }
        garage.removeAll(tempList);
    }

    public void removeGarageByType(String type){
        for (int i =0; i<garage.size()-1; i++){
            Vehicle v = garage.get(i);
            switch (type){
                case ("Car"):
                    if (v instanceof Car){
                        garage.remove(v);
                        i--;
                    }
                break;
                case ("Motorcycle"):
                    if (v instanceof Motorcycle){
                        garage.remove(v);
                        i--;
                    }
                    break;
                case ("Lorry"):
                    if (v instanceof Lorry){
                        garage.remove(v);
                        i--;
                    }
                    break;
            }
        }
    }

    public void clearGarage(){
        garage.clear();
        System.out.println("Your garage is empty.");
    }
}
