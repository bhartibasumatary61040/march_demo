package interview_programming;

import java.util.HashMap;

public class AlphabetOccurrence {

    public static void getCharCount(String string){
        HashMap< Character, Integer> charMap=new HashMap<>();
        char[] charArray=string.toCharArray();
        for (char alphabet :charArray){
            //if (!String.valueOf(alphabet).isBlank()) {
            if (charMap.containsKey(alphabet)) {
                charMap.put(alphabet, charMap.get(alphabet) + 1);
            } else {
                charMap.put(alphabet, 1);
            }
            //}
        }
        System.out.println("AlphabetOccurrence : "+ charMap);
    }

    public static void main(String[] args) {
        getCharCount("Communication");
    }
        }


