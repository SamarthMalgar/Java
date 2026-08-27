package PracticeProb;

import java.util.Scanner;

public class q1GCDOf2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        for(int i = Math.min(a,b)/2; i>=1; i--){
            if(a % i == 0 && b % i == 0) {
                if (i > hcf)
                    hcf = i;
            }
        }
        System.out.print("GCD : "+hcf);
    }
}
