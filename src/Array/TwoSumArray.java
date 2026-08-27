package Array;

import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int[] arr = {2,5,-4,3,-7,-8,-1, 5};
        boolean sum = false;
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i]+ arr[j] == target) {
                    sum = true;
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
