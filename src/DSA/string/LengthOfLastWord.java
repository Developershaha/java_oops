package DSA.string;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "  fly me   to   the moon  ";

        System.out.println(
                "Length of last word: " + lengthOfLastWord(str)
        );

    }
    public static int lengthOfLastWord(String s){

        int length=s.length()-1;
        // remove space from the end od the spring
        while(length>=0){
           if(s.charAt(length) != ' '){
               break;
           }
            length--;
        }
        int count =0;
        while(length>=0){
            if(s.charAt(length) !=' '){
                count++;
                length--;
            }else{
                break;
            }
        }
        return count;


    }
}
