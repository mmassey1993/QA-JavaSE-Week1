import java.util.Arrays;
import java.util.HashMap;

public class PlanetJava {
    private int firstletter = -1;
    private int secondletter = -1;
    public boolean periodicTable(String elementname, String symbol){
        symbol = symbol.toLowerCase();

        if (symbol.length() != 2){
            return false;
        } else {
            firstletter = elementname.indexOf(symbol.charAt(0));
            secondletter = elementname.indexOf(symbol.charAt(1), firstletter+1);
            if (secondletter == -1){
                return false;
            } else {
                return true;
            }

        }
    }

    public String periodicTableBonus(String elementname){
        int letter =-1;
        String result = "";
        elementname = elementname.toLowerCase();
//        String[] alphabeticalOrder = elementname.split("");
//        Arrays.sort(alphabeticalOrder);
//        firstletter = elementname.indexOf(alphabeticalOrder[0]);
//        result += elementname.substring(firstletter, firstletter+1);
//        System.out.println(result);
//        String temp = elementname.substring(firstletter+1);
//        String[] alphabeticalOrder2 = temp.split("");
//        Arrays.sort(alphabeticalOrder2);
//        secondletter = temp.indexOf(alphabeticalOrder2[0]);
//        result += temp.substring(secondletter, secondletter+1);
        for (int i=0; i<2; i++){
            String temp = elementname.substring(letter+1);
            String[] alphabeticalOrder = temp.split("");
            Arrays.sort(alphabeticalOrder);
            letter = temp.indexOf(alphabeticalOrder[0]);
            result += temp.substring(letter, letter+1);
            if (letter == temp.length()-1){
                break;
            } else letter = letter + 1;
        }
        return result;
    }
    HashMap<String, String> periodicTable = new HashMap<String, String>();
    public void PlanetJava2(String elementname){

        String[] alphabeticalOrder = elementname.split("");
        Arrays.sort(alphabeticalOrder);
        int letter = elementname.indexOf(alphabeticalOrder[0]);
        String key = elementname.substring(letter, letter+2);
        if (!(periodicTable.containsKey(key))){
            periodicTable.put(key, elementname);
        } else {
            do {
                int i = 2;
                key = "" + elementname.charAt(letter) + elementname.charAt(letter + i);
                if (!(periodicTable.containsKey(key))){
                    periodicTable.put(key, elementname);
                }
                i++;
            } while (!(periodicTable.containsValue(elementname)));
        }
    }


}
