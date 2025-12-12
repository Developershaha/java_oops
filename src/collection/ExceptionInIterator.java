package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionInIterator {

        public static void main(String[] args) {

            ArrayList names = new ArrayList<>();

            // Adding elements
            names.add(100);
            names.add(2000);
            names.add(300);
            names.add(400);

//        // for the below loop concurrancy and structuchral problem will occur and project will crash
//        for(int i =0;i<names.size();i++){
//            System.out.println(names.get(i));
//            names.add(44);
//        }

            // iterable is best for access the data of collect even it is index base or not for loop is onlu suitable for index base accessing element



            Iterator itr=names.iterator();
// this is best way to access the data oky - even we create the concurrancy and structural problem then it will through the error
            try{
                while(itr.hasNext())
                {
                    System.out.println(itr.next());
                    names.add(44);

                }
            }catch (Exception e){
                System.out.println("normal terminal ");
            }
            finally {
                System.out.println("called finally");
            }
            System.out.println("end program");
        }
    }


