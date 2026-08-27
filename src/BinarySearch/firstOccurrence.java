package BinarySearch;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class firstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,3,3,3,3,5,6,7,7,8,8,9};
        System.out.print("Enter the Target: ");
        int target = sc.nextInt();
        int low = 0, high = arr.length-1;
        int mindx =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid -1;
            else if(arr[mid] < target) low = mid + 1;
            else{
                mindx = mid;
                high = mid - 1;
            }
        }
        System.out.println(high+1);

    }


}
