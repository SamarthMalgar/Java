package Array;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int[] arr = {2,5,3,6,44,73,12,54,38};
        boolean isfound = false;     //assume the target is not present in an array;
        int index = 0;
        for (int j : arr) {
            index++;           //for printing the index.
            if (j == target) {   // if target is present in the array than isfound is true;
                isfound = true;
                break;
            }
        }
        if(isfound) System.out.println("the target is present in the array at index " +(index-1));
        else System.out.println("target not found in the Array");

    }
}
