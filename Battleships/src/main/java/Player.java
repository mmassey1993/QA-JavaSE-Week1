import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Ship> shipList = new ArrayList<Ship>();

    public Player(){

    }

    public List<Ship> addShip(Ship ship){
        shipList.add(ship);
        return shipList;
    }

    public List<Ship> getShipList() {
        return shipList;
    }

    public void setShipList(List<Ship> shipList) {
        this.shipList = shipList;
    }
}
