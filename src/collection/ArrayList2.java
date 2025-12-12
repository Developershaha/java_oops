package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        // we can access arraylist though the for loop
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        // inhanced for loop - for each loopp

        for(Object o:al){
            System.out.println(o);
        }
    }
}
