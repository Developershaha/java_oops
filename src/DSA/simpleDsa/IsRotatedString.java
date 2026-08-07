package DSA.simpleDsa;

public class IsRotatedString {

    public static void main(String[] args) {

        String str1="abcd";
        String str2="bcda";
        String temp=str1+str2;

        if(str1.length()!=str2.length()){
            System.out.println("not rotatable");
        }

        if(temp.contains(str2)){
            System.out.println("true");
        }
    }
}
