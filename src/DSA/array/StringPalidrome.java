package DSA.array;

public class StringPalidrome {
    public static void main(String[] args) {
        boolean isPalidrome=(boolean) checkPalidrom("madams");
        System.out.println("check "+isPalidrome);
    }
    public static boolean checkPalidrom(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
