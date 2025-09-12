import java.util.Arrays;
import java.util.List;

public class StringPrograms {


    public static void main(String[] arg) {

        // Reverse a string
        System.out.println("Reverse String :" + reverseString("Senthamarai"));

        // Check if String is palindrom
        System.out.println("isPalindrom :" + isPalindrom("MADAM"));

        // Check if two Strings are Anagram
        System.out.println("isAnagram :" + isAnagram("Listen", "Silent"));

        // Count the vowels
        System.out.println("No of Vowels :" + countVowels("Senthamarai"));

        // Count the Consonants
        System.out.println("No of Consonants :" + countConsonants("Senthamarai"));


    }

    public static int countVowels(String arg) {
       List<Character> vowels = Arrays.asList('a','e','i','o','u');
       int count = 0;
       for(char c: arg.toLowerCase().toCharArray()) {
           if(vowels.contains(c)) {
               count++;
           }
       }
       return count;
    }
    public static int countConsonants(String arg) {
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int count = 0;
        for(char c: arg.toLowerCase().toCharArray()) {
            if(!vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String arg) {
        String reverseStr = "";
        char[] charArr = arg.toCharArray();
        for(int i=charArr.length-1; i>=0;i--) {
            reverseStr = reverseStr+charArr[i];
        }
        return reverseStr;
    }

    public static boolean isPalindrom(String arg) {
        return arg.equalsIgnoreCase(reverseString(arg));
    }

    public static boolean isAnagram(String arg1, String arg2) {
        if(arg1.length()!=arg2.length()) {
            return false;
        }
        char[] charArr1 = arg1.toLowerCase().toCharArray();
        char[] charArr2 = arg2.toLowerCase().toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }
}
