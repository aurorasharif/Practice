import java.util.Map;
import java.util.TreeMap;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        findMaxOccurringChar("aaaabbcdeeeeeee");
    }
    private static char findMaxOccurringChar(String string) {
        char[] charArray = string.toCharArray();
        Map<Character, Integer> charCountMap = new TreeMap<>();
        char maxOccurringChar = 0;
        int numberOfOccurrance = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charCountMap.containsKey(charArray[i])) {
                charCountMap.put(charArray[i], (charCountMap.get(charArray[i]) + 1));
                if (charCountMap.get(charArray[i]) > numberOfOccurrance) {
                }
            } else charCountMap.put(charArray[i], 1);
        }

        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if (entry.getValue() > numberOfOccurrance){
                maxOccurringChar = entry.getKey();
                numberOfOccurrance = entry.getValue();
            }
        }
        return maxOccurringChar;
    }
}
