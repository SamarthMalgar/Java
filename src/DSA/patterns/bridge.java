package DSA.patterns;

import java.util.Scanner;

public class bridge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int l = 1; l <= 2*n-1; l++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("  ");
            }
            for(int k =1; k <= n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
