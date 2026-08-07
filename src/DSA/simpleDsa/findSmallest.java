package DSA.simpleDsa;

public class findSmallest {

    public static int smallestElement(int arr[]){

       int smallestElement=arr[0];

       for(int i=0;i<arr.length;i++){

           if(smallestElement>arr[i]){
               smallestElement=arr[i];
           }
       }
       return smallestElement;

    }

    public static void main(String[] args) {

        int [] arr={2,1,5,6,2,6,71,10};

        int smallest=smallestElement(arr);
        System.out.println("smallet element "+smallest);

    }
}
