import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ShipTest {

    private int size;
    private int xPos;
    private int yPos;
    private List<Ship> shipList;

    @Before
    public void setup(){
        size = 2;
        xPos = 1;
        yPos = 1;
        shipList = new ArrayList<Ship>();
    }

    @Test
    public void createShip(){
        assertEquals(true, size != 0);
        assertEquals(true, xPos!= 0 && yPos != 0);
    }

    @Test
    public void addShip(){

    }
}
