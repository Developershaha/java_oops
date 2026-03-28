package normalDsa;
// we have two string oky  and check is this rotate or not rotate

// i have solved this question for string
public class Rotate {
    public static void main(String[] args) {


        String s1="123456";
        String s2="456123";

        if(isRotate(s1,s2)){
            System.out.println("String is rotate ");
        }else{
            System.out.println("String is not rotate ");
        }
    }

    public static boolean isRotate(String s1,String s2){

        if(s1.length() != s2.length()){
            return false ;
        }

        String combined=s1+s2;

        return combined.contains(s2);
    }
}
