import java.util.HashMap;

public class CollectionPrograms {
    public static void main(String[] args) {
        //print the occ of word using hashmap
        countOccOfWord("This is Sentha Sentha learning learning hashmap");
        countOccOfChar("This is Sentha Sentha learning learning hashmap");
        printMaxAndMinOccChar("ThisisSenthaSenthalearninglearninghashmap");
    }

    private static void printMaxAndMinOccChar(String str) {
        String[] strArr = str.split("");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String val: strArr) {
            if(hm.containsKey(val)) {
                hm.put(val,hm.get(val)+1);
            } else {
                hm.put(val,1);
            }
        }
        System.out.println(hm);
        int max = 0, min = 1;
        String maxOccChar = "";
        String minOccChar = "";
        for (String s : hm.keySet()) {
            if(hm.get(s)>max) {
                max = hm.get(s);
                maxOccChar = s;
            } else if ( hm.get(s)<=min) {
                minOccChar = s;
            }
        }
        System.out.println("Max Occ Char " + maxOccChar + " Min Occ Char " + minOccChar );
    }

    private static void countOccOfChar(String str) {
        String[] strArr = str.split("");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String val: strArr) {
            if(hm.containsKey(val)) {
                hm.put(val,hm.get(val)+1);
            } else {
                hm.put(val,1);
            }
        }
        System.out.println(hm);
    }

    public static void countOccOfWord(String str) {

        String[] strArr = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String val: strArr) {
            if(hm.containsKey(val)) {
                hm.put(val,hm.get(val)+1);
            } else {
                hm.put(val,1);
            }
        }
        System.out.println(hm);

    }
}
