package javaPractice;

import java.io.IOException;
import java.security.spec.ECField;

public class DemoString {
    static void test()
            throws IOException {

        throw new IOException("File Error");
    }

    public static void main(String[] args)
            throws IOException {

       try{ test();}catch (Exception e){
           System.out.println(e);
       }
    }
}
