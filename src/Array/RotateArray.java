package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element d to rotate: ");
        int d = sc.nextInt();
        int[] arr = {2,5,78,77,89,7,9,0,78,43};
        int n  = arr.length;
        d %= n;
        reverse(arr, 0, d-1);
        reverse(arr,d,n-1);
        reverse(arr, 0 , n-1);
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }

    static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
