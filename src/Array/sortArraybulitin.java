package Array;

import java.util.Arrays;
public class sortArraybulitin{
    public static void main(String[] args) {
        int[] arr = {1, -5, -3, 5, 7,8,23,5, -12};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] arr) {
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
        System.out.println();
    }

    public static class findDuplicateInArray {
        public static void main(String[]a){
            int[] arr = {2,  4, 3, 5, 3, 1};
            int n = arr.length-1;
            int sum = 0;
            for(int ele : arr){
                sum += ele;
            }
            int duplicate = n*(n+1)/2;
             sum -= duplicate;
            System.out.println("duplicate number in the array is: " +sum);
        }
    }
}
