import java.util.HashMap;

public class CollectionPrograms {
    public static void main(String[] args) {
        //print the occ of word using hashmap
        countOccOfWord("This is Sentha Sentha learning learning hashmap");
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
