import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

        // Reverse everyword in the sentence
        String sentence = "This is a practice page for java Automation";
        System.out.println("Reverse sebtence" + reverseSentence(sentence));

        //Print upper and lower case separately
        printCasesSeparately("AaBbCcDdEeFf");

        /* Differentiate String and digit */
        printStringAndDigit("Senthama12rai234");

        // print longest without repeating char
        printLongWithoutRepeatingChar("abcdabcdefgh");


    }

    private static void printLongWithoutRepeatingChar(String str) {
        char[] strArr = str.toCharArray();

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            ArrayList<String> al = new ArrayList<>();
            for (int i1 = i; i1 < strArr.length; i1++) {
                if(al.contains(String.valueOf(strArr[i1]))) {
                    hashMap.put(al.toString(),al.size());
                    break;
                } else {
                    al.add(String.valueOf(strArr[i1]));
                }
            }
            hashMap.put(al.toString(),al.size());
        }
        int max = 0;
        String maxChar = "";
        for (String s : hashMap.keySet()) {
            if(s.length()>max) {
                max = s.length();
                maxChar = s;
            }
        }
      System.out.println("Max char word: "+ maxChar);
    }

    private static void printStringAndDigit(String str) {
        char[] strArr = str.toCharArray();
        String digit = "";
        String charWord = "";
        for (char s : strArr) {
            if(Character.isDigit(s)) {
                digit = digit+ s;
            } else charWord = charWord +s;
        }
        System.out.println("Digit in the word: "+ digit );
        System.out.println("Char in the word: "+ charWord );
    }

    private static void printCasesSeparately(String str) {
        char[] charArr = str.toCharArray();
        String upperCase = "";
        String lowerCase = "";
        for (char c : charArr) {
            if(Character.isUpperCase(c)) {
                upperCase = upperCase  + c;
            } else {
                lowerCase = lowerCase+c;
            }
        }
        System.out.println("Upper cases in String: " +str + " "+ upperCase);
        System.out.println("Lower cases in String: " +str + " "+ lowerCase);
    }

    private static String reverseSentence(String sentence) {
        String[] strArr = sentence.split(" ");
        String reverse = "";
        for (int i= strArr.length-1;i>=0;i--) {
            reverse = reverse + " " + reverseString(strArr[i]);
        }
        return reverse;
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
