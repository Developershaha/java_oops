package multithreading;

import java.util.Scanner;

class Alpha{
    public void banking(){
        System.out.println("Banking activity started");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the user number");
        int un=sc.nextInt();
        System.out.println("enter the password");
        int pass=sc.nextInt();
        System.out.println("collect your cash ");
        System.out.println("banking activity terminated");
    }
}
class Beta{
    public void printingStart() throws InterruptedException{
        System.out.println("printing activity started ");
        for(int i=0;i<4;i++){
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("pritnitng activity terminated ");
    }
}
class Gamma{
    public void focus() throws InterruptedException{
        System.out.println("Printing important message started ");
        for(int i=0;i<4;i++){
            System.out.println("Focus is the key ");
            Thread.sleep(4000);
        }
        System.out.println("printing important message terminated ");
    }
}

public class LaunchMT2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("application started .....");
        Alpha a=new Alpha();
        Beta b=new Beta();
        Gamma g=new Gamma();
        a.banking();;
        b.printingStart();
        g.focus();
        System.out.println("application terminated .....");

    }
}
