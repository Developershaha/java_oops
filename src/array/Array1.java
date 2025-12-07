package array;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int size=sc.nextInt();
        int[] marks=new int[size];


        for(int i=0;i<size;i++){
            System.out.println("Kindly enter the mark of student "+(i+1));
            marks[i]=sc.nextInt();

        }

        System.out.println("print element of array");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");

        }
        System.out.println( );
    }
}
