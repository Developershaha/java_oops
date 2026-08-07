package DSA.simpleDsa;

import java.util.Arrays;

public class Reverse {

        public  static int [] reverseArray(int arr[]){

            int [] result=new int[arr.length];

                for(int i =0;i<arr.length;i++){
                    result[i]=arr[arr.length-1-i];
                }
            return  result;
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
//        System.out.println(Arrays.toString(reverseArray(arr)));


        int left=0;
        int right=arr.length-1;
        while (left<right){
            // swap logic

            int temp=arr[right];

             arr[right]=arr[left];
             arr[left]=temp;
             left++;
             right--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
