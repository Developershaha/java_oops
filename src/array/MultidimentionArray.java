package array;

import java.util.Scanner;

public class MultidimentionArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]marks=new int[3][4];
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("kindly enter class of "+i+" student "+j);
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j] +" ");
            }
            System.out.println(" ");
        }

    }
}
