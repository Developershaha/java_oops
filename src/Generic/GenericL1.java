package Generic;

import java.util.ArrayList;

public class GenericL1 {

    public static void main(String[] args) {
        // learn generics in this class
        ArrayList<Integer> al=new ArrayList<>(); // here defining type is optional

        al.add(49);
        al.add(90);
        al.add(78);
        al.add(76);
        System.out.println("printing ....");
        for(int a:al){
            System.out.println(a);
        }
    }
}
