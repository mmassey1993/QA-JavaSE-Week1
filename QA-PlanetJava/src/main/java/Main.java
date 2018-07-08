import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        PlanetJava test = new PlanetJava();
        //System.out.println(test.periodicTable("Tuffjeffium", "Tm"));
        System.out.println(test.periodicTableBonus("Slimyrine"));
        test.PlanetJava2("Carbon");
        test.PlanetJava2("Iridium");
        test.PlanetJava2("Chlorine");
        test.PlanetJava2("Chromium");


        Iterator<Map.Entry<String, String>> it = test.periodicTable.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(
                    "Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
