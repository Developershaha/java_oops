package DSA.simpleDsa;

public class MaximumConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};

        int count=0;
        int maxCount=0;
        // find maximum 1 in the array

        for(int num:arr){
            if(num==1){
                count++;
                maxCount=maxCount>count?maxCount:count;
            }else{
                count=0;
            }
        }
        System.out.println("maximun"+maxCount);

    }
}
