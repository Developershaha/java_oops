package normalDsa;


 import java.util.Scanner;
// Print 1 to N using Recursion

/*
* To print numbers from 1 to n using forward recursion,
* the approach involves defining a recursive function that takes the current number as a parameter.
*  The function first checks if the current number exceeds n; if it does, the recursion terminates.
* Otherwise, it prints the current number and then recursively calls itself with the next number incremented by one.
*  This way, the numbers are printed in ascending order as the recursion unfolds forward from the base case to the maximum number.
* The key is to make the print statement before the recursive call, ensuring the numbers appear from 1 up to n in order.*/
class Recursive {

    public static void printName(int count, int current) {


        if(current>count){
            System.out.println("please inter valid count");
            return;

        };
        // Base condition
        if (current == count) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name=sc.nextLine();

        System.out.println(name);
        current=current + 1;
        // Recursive call
        printName(count, current);
    }
}

class First {
    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");

        int count =0;

        try {
            count = sc.nextInt();
            System.out.println("Valid number: " + count);
        } catch (Exception e) {
            System.out.println("Invalid input! Not a number.");
            return;
        }


        Recursive rs = new Recursive();
        Recursive.printName(count, 1);

        //  sc.close();
    }
}
