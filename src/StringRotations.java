public class StringRotations {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
        boolean flag = isStringRotationOfEachOther(str1, str2);
        System.out.println(flag);
    }

    private static boolean isStringRotationOfEachOther(String str1, String str2) {
        if (str1.equals(str2)) return true;
        if (str1.length() != str2.length()) return false;
        if (null == str1) return false;
        if (null == str2) return false;
        for (int i=0; i< str1.length(); i++){
            char firstLetter = str2.charAt(0);
            str2 = str2.substring(1).concat(String.valueOf(firstLetter));
            System.out.println("String 1: " + str1 + " String 2: " + str2);
            System.out.println();
            if (str1.equals(str2)) return true;
        }
        return false;
    }
}
