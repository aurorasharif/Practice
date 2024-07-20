import java.util.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "HaPpyNewYear";
        char[] charArr = str.toCharArray();
        Map<Character, Set<Integer>> charIndexMap = new LinkedHashMap<>();
        String strToReturn = "";
        for (int i =0; i< charArr.length; i++){
            if (!charIndexMap.containsKey(charArr[i])) {
                Set<Integer> indexSet = new TreeSet<>();
                indexSet.add(i);
                charIndexMap.put(charArr[i], indexSet);
            }
            else {
                Set<Integer> currentIndexSet = charIndexMap.get(charArr[i]);
                currentIndexSet.add(i);
            }
        }
        System.out.println(charIndexMap);
        for (Map.Entry<Character,Set<Integer>> entry : charIndexMap.entrySet()){
            Set<Integer> currentIndexSet = entry.getValue();
            if (!currentIndexSet.isEmpty()) {
                int index = currentIndexSet.iterator().next();
                strToReturn = strToReturn.concat(String.valueOf(str.charAt(index)));
            }
        }
        System.out.println("final String: " + strToReturn);
    }
}
