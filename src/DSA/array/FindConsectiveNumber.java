package DSA.array;

public class FindConsectiveNumber {
    public static void main(String[] args) {
        int [] array={1,1,0,0,0,1,1,1,1,1,0};

        System.out.println(findConsectiveNumber(array));
    }
    public static int findConsectiveNumber(int [] nums){
        int currCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currCount++;
            }
            else{
                maxCount=currCount>maxCount?currCount : maxCount;
                currCount=0;
            }
        }
        return  maxCount=currCount>maxCount?currCount : maxCount;

    }
}
