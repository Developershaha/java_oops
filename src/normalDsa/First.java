package normalDsa;


 import java.util.Scanner;

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
