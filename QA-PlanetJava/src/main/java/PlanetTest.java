
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class PlanetTest {

    int letter;
    String elementname;
    String key;
    PlanetJava pj = new PlanetJava();
    HashMap<String, String> periodicTable = pj.periodicTable;


    @Test
    public void planet2(){
        pj.PlanetJava2("Iron");
        assertEquals("Iron", periodicTable.get("Ir"));
        pj.PlanetJava2("Iridium");
        assertEquals("Iridium", periodicTable.get("Ii"));
}

}
