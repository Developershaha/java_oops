package overviewOfOOps;

class Calculate {

    public int findMinimum(int x,int y){

        int max;
        if(x>y){
            max=x;
        }else{
            max=y;
        }
        return max;


    }
}
public class CalculateMinimun {

    public static void main(String[] args) {
        Calculate c=new Calculate();
      int max=  c.findMinimum(5,7);
        System.out.println("max"+max);

    }
}

