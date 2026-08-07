package DSA.simpleDsa;

public class FindLargest {

    public static int maximunElement(int arr[]){

        int maximumElement =arr[0];

        for(int n=0; n<arr.length;n++){
            if(maximumElement<arr[n]){
                maximumElement=arr[n];
            }
        }

        return maximumElement;
    }


    public static void main(String[] args) {
        // find laregest elmetn in the array
        int[] arr = new int[]{10, 20, 30, 40, 50};

        int array[]={1,3,4,5,343,4};
        int maximun=maximunElement(array);
        System.out.println("number "+maximun);

    }
}
