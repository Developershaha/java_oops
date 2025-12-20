package multithreading;

import java.util.Scanner;

class Alpha1 extends Thread{
    public void run(){
        banking();

    }
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
class Beta1 extends Thread{
    public void run(){
        try {
            printingStart();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void printingStart() throws InterruptedException{
        System.out.println("printing activity started ");
        for(int i=0;i<4;i++){
            System.out.println("**");
            Thread.sleep(1000);
        }
        System.out.println("pritnitng activity terminated ");
    }
}
class Gamma1 extends Thread{
    public void run(){
        try {
            focus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void focus() throws InterruptedException{
        System.out.println("Printing important message started ");
        for(int i=0;i<4;i++){
            System.out.println("Focus is the key ");
            Thread.sleep(1000);
        }
        System.out.println("printing important message terminated ");
    }
}
public class LaunchMT3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("application started .....");
        Alpha1 a=new Alpha1();
        Beta1 b=new Beta1();
        Gamma1 g=new Gamma1();
        a.start();
        b.start();
        g.start();
//        a.banking();;
//        b.printingStart();
//        g.focus();
        System.out.println("application terminated .....");
    }
}
