package DSA.searchingAlgo;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {10, 45, 3, 45, 89, -1, 78, 9};
        int result = linearSearch(array, -11);
        if (result != -1) {
            System.out.println("found array element at index of " + result);
        } else {
            System.out.println("target not found in the given array");
        }
// Time Complexity: $O(n)$ — If the array has 1 million items, it might take 1 million checks.
    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
