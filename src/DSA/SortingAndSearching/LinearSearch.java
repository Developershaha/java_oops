package DSA.SortingAndSearching;

public class LinearSearch {

    public static int findNumberInArray(int [] numbersArray ,int target){
        for(int number : numbersArray){
            if(number==target){
                return 1;
            }
        }
        return -1;
    };
    public static void main(String[] args) {
        // find element in the array using linear search

        int[] numberArray ={10,4,5,6,8,9,0,25,56};
        int target =0;

        int foundElement=findNumberInArray(numberArray,target);
        if(foundElement==1){
            System.out.println("element found in the given array ");
        }else{
            System.out.println("element is not found in the given array ");
        }
        System.out.println(foundElement);

    }
}
