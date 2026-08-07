package DSA.simpleDsa;



public class SecondSmallest {

    public static int smallestElement(int arr[]){

        int small=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<small){
                secondSmallest=small;
                secondSmallest=arr[i];
            }else if(arr[i]<secondSmallest && small !=arr[i]){
                secondSmallest=arr[i];
            }
        }

        // write a logic for
        return secondSmallest;
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,7,3,74,1};
        int smalleset=smallestElement(arr);
        System.out.println(smalleset);
    }
}
