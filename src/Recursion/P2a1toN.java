package Recursion;

import java.util.Scanner;

public class P2a1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print2(1, n);
      //  print(n);
    }
//    public static void print(int n){
//        if(n == 0) return;
//        print(n-1);
//        System.out.println(n);
//    }
    //using two parameters
    public static void print2(int x, int n){
        if(x > n) return;
        System.out.println(x);
        print2(x+1,n);
    }
}
