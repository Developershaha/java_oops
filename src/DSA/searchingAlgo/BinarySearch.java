package DSA.searchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array ={10,20,30,40,50,88,99,111};
        int result = binarySearch(array,99);
        if(result!=-1){
            System.out.println("target element present at index " +result);
        }else {
            System.out.println("target value is nto presnt in the given array ");
        }
        // array must be sorted then and then we can able to find the record
    }
    public static int binarySearch(int [] nums ,int target){

        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target) {
                left=mid+1;
            }else{
                right =mid-1;
            }

        }
        return -1;
    }
}
