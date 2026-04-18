package DSA.array;

public class PalidromeCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1,1};

        boolean result = isPalindrome(arr);

        System.out.println("Is Palindrome: " + result);
    }

    // time Complexity is O(n) and space complexity is O(1)

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            if(arr[left]!= arr[right]){
                return false;

            }
            left++;
            right--;
        }
        return true;

    }

}
