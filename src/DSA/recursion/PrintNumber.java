package DSA.recursion;

public class PrintNumber {
    public static void main(String[] args) {
// print number 1 to 10 using recursion oky
//        printNumber(10);

        // print number from 1 to 10

//        printNumberStartFrom1(1,10);

        // sum of all the number from 1 to 5 that make 15 oky

//       int result= sumOfNumber(5);
//        System.out.println("result "+result);

        // print sum of array oky

        int[] array = {5, 3, 2, 0, 1}; // 11 result

        int result = sumOfArray(array,array.length-1);
        System.out.println("result "+result);
    }

    public static int sumOfArray(int[] nums,int length) {

        if(length ==0){
            return nums[0];
        }

        return nums[length]+sumOfArray(nums,length-1);
    }

    public static int sumOfNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfNumber(number - 1);
    }

    public static void printNumber(int number) {

        if (number == 0) {
            return;
        }
        System.out.println(number);

        printNumber(number - 1);
    }

    public static void printNumberStartFrom1(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(start);
        printNumberStartFrom1(start + 1, end);
    }
}


