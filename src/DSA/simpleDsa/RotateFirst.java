package DSA.simpleDsa;

public class RotateFirst {

    public static int [] rotateArray(int[] arr){


        int first=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]=first;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int [] rotatedArr=rotateArray(arr);
        for(int number:arr){
            System.out.println(number);
        }
    }
}
