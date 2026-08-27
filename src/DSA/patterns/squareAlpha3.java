package DSA.patterns;

import java.util.Scanner;

public class squareAlpha3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            if (n <= 26) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i % 2 == 0){                              //for capital letters
                            System.out.print((char) (65 + i) + " ");
                        }else {                                     //for small  letters
                            System.out.print((char) (97 + i) + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("invalid number! Enter the number between 1 to 26");
            }
            sc.close();
        }
    }

