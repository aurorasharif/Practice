import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveCharacter {
    public static void main(String[] args) {
        String firstString = "computer";
        String secondString = "cat";
        String result = removeChars(firstString, secondString);
        System.out.println(result);
    }

    static String removeChars(String string1, String string2){
        List<Integer> indexesToRemove = new LinkedList<>();
        for (int i = 0; i < string2.length(); i++) {
            String currentChar = String.valueOf(string2.charAt(i));
            System.out.println(currentChar);
            for (int j = 0; j < string1.length(); j++) {
                string1 = string1.replace(currentChar, "");
            }
        }
        Iterator iterator = indexesToRemove.iterator();
        while (iterator.hasNext()){

        }
        return string1;
    }
}
