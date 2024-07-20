import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToInteger {
    public static void main(String[] args) {
        String romanValue = "II";

        int intVal = romanNumeralToIngeter(romanValue);
        System.out.println(intVal);
    }
    private static int romanNumeralToIngeter(String str) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int valueToReturn = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i is: "+ i);
            if (i + 1 <= str.length()) {
                Character currentRomanValue = str.charAt(i);
                int currentRomanIntValue = romanMap.get(currentRomanValue);
                if (i+1 == str.length()){
                    valueToReturn += currentRomanIntValue;
                    return valueToReturn;
                }
                Character nextRomanValue = str.charAt(i + 1);
                int nextRomanIntValue = romanMap.get(nextRomanValue);
                if (currentRomanIntValue >= nextRomanIntValue) {
                    valueToReturn += currentRomanIntValue;

                } else {
                    valueToReturn += (nextRomanIntValue - currentRomanIntValue);
                    i++;
                }
            }

        }
        return valueToReturn;
    }
}
