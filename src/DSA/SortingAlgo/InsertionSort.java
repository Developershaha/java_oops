package DSA.SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,5,4,3,5,2,1};
        // write insertion algorithm oky
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 &&arr[prev]>curr ){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
