package constructor;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        // boxing autoboxing - unboxing auto unboxing


        // converting integer to corrosponding  wrapper classes

        int a =9;
        Integer is=a; // autoboxing
        Integer b=Integer.valueOf(a);



        // unboxing

        Integer i=Integer.valueOf(9);
        int n=i;
        int r=i.intValue();
    }
}
