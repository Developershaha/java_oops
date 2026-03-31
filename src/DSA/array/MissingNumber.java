package DSA.array;

import java.util.HashSet;

public class MissingNumber
{
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        System.out.println("Formula result: " + findByFormula(array));
        System.out.println("Formula result: " + findByHash(array));
    }


    // solved using fomula
//    public static int findByFormula(int [] arr){
//        int n=arr.length;
//        int totalSum=n*(n+1)/2;
//        int expectedSum=0;
//        for(int i=0;i<arr.length;i++){
//            expectedSum+=arr[i];
//        }
//
//
//        return totalSum-expectedSum;
//    }

    // now solve using hashmap oky

    public static int findByHash(int[] arr) {
        // Create the "Map" equivalent
        HashSet<Integer> numsSet = new HashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            numsSet.add(num);
        }

        // Look for the missing number from 0 to n
        for (int i = 0; i <= arr.length; i++) {
            if (!numsSet.contains(i)) {
                return i;
            }
        }

        return -1; // Default if nothing is missing
    }
}
