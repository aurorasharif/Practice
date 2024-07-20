public class ReverseString {
    public static void main(String[] args) {
        String stringToReverse = "Geeks";
        String reveresedString = reverseString(stringToReverse);
        System.out.println(reveresedString);
    }

    private static String reverseString(String stringToReverse) {
        String reveresedString = "";
        for (int i= stringToReverse.length()-1; i >=0 ; i--) {
            reveresedString = reveresedString.concat(String.valueOf(stringToReverse.charAt(i)));
        }
        return reveresedString;
    }
}
