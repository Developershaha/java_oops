package Exception;

import java.util.Scanner;

public class LaunchEH1 {

    public static void main(String[] args) {
        System.out.println("connection established");
        Scanner input=new Scanner(System.in);
        System.out.println("Kindly enter numerator");
        int n=input.nextInt();
        System.out.println("Kindly enter denominator");
        int d=input.nextInt();
        int res=n/d;
        System.out.println("Result is "+res);
        System.out.println("Connection terminate");
    }
}
