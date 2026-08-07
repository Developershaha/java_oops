package DSA.simpleDsa;

import CoreJava.Interface.Interface1;

import java.util.Arrays;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
  // if not found then return -1

        if(arr.length<2){
            return -1;
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;




        for(int i=0;i<arr.length;i++){

                if(arr[i]>largest){
                   secondLargest=largest;
                   largest=arr[i];
                }
                else if(arr[i]>secondLargest && arr[i] !=largest){
                    secondLargest=arr[i];
                }

        }
        System.out.println("sdsad"+secondLargest);
        return secondLargest;

    }
        public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int second=findSecondLargest(arr);
            System.out.println(second);

    }
}
