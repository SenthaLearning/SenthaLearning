import java.util.*;

public class ArrayPrograms {

    public static void main(String[] args) {
        // print duplicated values in string array
        String[] arr = {"str","str","sentha","sen","sentha","thamarai"};
        int[] intArr = {10,11,2,3,5,6,9,13};
        findDuplicates(arr);

        // remove duplicates in array list and print
        removeDuplicateFromArrayList(Arrays.asList(arr));

        //Sort an Array Without Using Built-in Sort Methods
        sortArray(intArr);

        // Find Second Largest Number in an Array
        secondLargestNum(intArr);

    }

    public static void secondLargestNum(int[] intArr) {
        sortArray(intArr);
        System.out.println("Second Largest Number : " + intArr[intArr.length-2]);

    }

    public static void sortArray(int[] intArr) {

        for(int i=0; i<intArr.length-1;i++) {
            for(int j=i+1;j<intArr.length;j++) {
                if(intArr[i]>intArr[j]) {
                    int temp = intArr[i];
                    intArr[i]=intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array values are ");
       for(int val: intArr) {
           System.out.print(val + " ");
       }
        System.out.println();
    }

    public static void removeDuplicateFromArrayList(List<String> list) {
        Set<String> strSet = new HashSet<>();
        System.out.println("Duplicates values are: ");
        for(String str : list) {
            if(!strSet.add(str)) {
                System.out.print(str + " ");
            }
        }
        System.out.println("Non Duplicate values : ");
        System.out.println(strSet);
    }

    public static void findDuplicates(String[] strArr) {
        Set<String> strSet = new HashSet<>();
        System.out.println("Duplicates values are: ");
        for(String str : strArr) {
            if(!strSet.add(str)) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }
}
