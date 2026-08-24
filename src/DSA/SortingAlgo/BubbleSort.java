package DSA.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static  int[] bubbleSort(int arr[]){

        // write a logic here

        for(int i=0;i<arr.length-1;i++){

            boolean isSwapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] array={5,4,9,1,0};


        System.out.println(Arrays.toString(bubbleSort(array)));

    }
}
