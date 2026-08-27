package DSA.patterns;

import java.util.Scanner;

public class numTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
              //  System.out.print(j+ " "); //for number triangle
                // System.out.print((char)(j+64)+ " ");   //for alphabet

                /*
                if(i % 2 != 0) {
                    System.out.print(j + " ");
                }
                else{
                    System.out.print((char)(j+64)+ " ");
                }*/
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }
    }
}
