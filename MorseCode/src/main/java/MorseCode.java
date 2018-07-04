import java.util.HashMap;

public class MorseCode {

    private String sentence;
    private HashMap<String, Character> morseCode = new HashMap<String, Character>();

    public MorseCode(){
        this.sentence = sentence;
        morseCode.put(".-", 'a');
        morseCode.put("-...", 'b');
        morseCode.put("-.-.", 'c');
        morseCode.put("-..", 'd');
        morseCode.put(".", 'e');
        morseCode.put("..-.", 'f');
        morseCode.put("--.", 'g');
        morseCode.put("....", 'h');
        morseCode.put("..", 'i');
        morseCode.put(".---", 'j');
        morseCode.put("-.-", 'k');
        morseCode.put(".-..", 'l');
        morseCode.put("--", 'm');
        morseCode.put("-.", 'n');
        morseCode.put("---", 'o');
        morseCode.put(".--.", 'p');
        morseCode.put("--.-", 'q');
        morseCode.put(".-.", 'r');
        morseCode.put("...", 's');
        morseCode.put("-", 't');
        morseCode.put("..-", 'u');
        morseCode.put("...-", 'v');
        morseCode.put(".--", 'w');
        morseCode.put("-..-", 'x');
        morseCode.put("-.--", 'y');
        morseCode.put("--..", 'z');
    }


    public String convertMorseToEnglish(String sentence){
        String englishSentence = " ";
        String[] splitWords = sentence.split(" / ");

        for (String word : splitWords){

            String[] splitLetters = word.split(" ");

            for (String letter : splitLetters){

                englishSentence += morseCode.get(letter);

        }
        englishSentence += " ";
        }

        return englishSentence;
    }

    public String convertEnglishToMorse(String sentence){
        String morseSentence = " ";
        String[] splitWords = sentence.split(" ");

        for (String word : splitWords){
            String[] splitLetters = word.split(" / ");

        }
    }
}
