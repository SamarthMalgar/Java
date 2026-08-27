package Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
       // int sum = 0;
        int product = 1;

//        int[] arr = new int[n];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//        System.out.print(sum);

        //product of array
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.print(product);

    }
}
