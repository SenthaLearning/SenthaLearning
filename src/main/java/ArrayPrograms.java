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

        // Print common elements in an array
        printCommonEle(new String[]{"a", "b", "c", "d"}, new String[]{"a", "b", "c", "e"});

        // Do sum and print the number
        sumOfInt(new String[]{"1","2","a","b","c","5","6","d"});

        // Count and print odd and even number in an array
        printCountOddEven(new int[]{1,2,3,4,5,6,7,8,9});
    }

    private static void printCountOddEven(int[] intArr) {
        int even =0;
        int odd = 0;
        for (int i : intArr) {
            if((i%2)==0) {
                even++;
            } else odd++;
        }
        System.out.println("Odd number count: " + odd);
        System.out.println("Even number count: "+ even);
    }

    private static void sumOfInt(String[] strArr) {
        int sum = 0;
        for (String s : strArr) {
            try {
                sum = sum + Integer.parseInt(s);
            } catch (NumberFormatException e) {

            }
        }
        System.out.println("Sum of all interers : "+ sum);
    }

    private static void printCommonEle(String[] strArr1, String[] strArr2) {
        HashSet<String> hs = new HashSet<>();
        hs.addAll(Arrays.asList(strArr1));
        for (String s : strArr2) {
            if(hs.contains(s)) {
                System.out.print(s+ " ");
            }
        }
        System.out.println();
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
