package Exception;

import java.util.Scanner;

public class LaunchEH2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       try{
           System.out.println("Kindly enter numerator");
           int n=input.nextInt();
           System.out.println("Kindly enter denominator");
           int d=input.nextInt();
           int res=n/d;
           System.out.println("Result is "+res);


           System.out.println("Kindlly enter size of array");
           int size=input.nextInt();
           int arr[]=new int[size];
           System.out.println("Kindly enter elemeent to be interted");
           int ele=input.nextInt();
           System.out.println("Kindly enter the array position where you want to inter");
           int index=input.nextInt();
           arr[index]=ele;
           System.out.println("enter element is "+arr[index]);
       }
       catch (ArithmeticException e){
           System.out.println("please enter non zero element");
       } catch (NegativeArraySizeException e) {
           System.out.println("Please don't enter negative number");
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("don't access out of bounder ");
       }
       catch (Exception e){
           System.out.println("something wrong");
       }
        System.out.println("Connection terminate");

    }
}
