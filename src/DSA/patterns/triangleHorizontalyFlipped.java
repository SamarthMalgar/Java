package DSA.patterns;

import java.util.Scanner;

public class triangleHorizontalyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int a = sc.nextInt();

        for(int i = a; i >= 1; i--) {
            for(int j = 1; j <= a- i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
