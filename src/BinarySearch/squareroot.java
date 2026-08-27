package BinarySearch;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sqrt = 0;
        System.out.print("Enter the number to find square root or near square number possible: ");
        int num = sc.nextInt();
        for(int i = 1; i*i <= num; i++){
            sqrt = i;
        }
        System.out.print("the square root or nearest square root number is: "+sqrt);
    }
}
