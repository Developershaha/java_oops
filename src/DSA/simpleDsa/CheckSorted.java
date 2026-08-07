package DSA.simpleDsa;

public class CheckSorted {

    public static boolean sorted(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("check if its return true then its sorted "+sorted(arr));

    }
}
