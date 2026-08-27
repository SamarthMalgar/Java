package Array;

import java.util.Arrays;
public class multiplyArraywithCondition {
    public static void main(String[] args) {
        int[] arr = {-3, 3, 7, 25, 5, -13, -17, 25};
        multiply(arr);
        System.out.println();
        Arrays.sort(arr);
        multiply(arr);
    }

    public static void multiply(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            if (i%2 == 0){
                arr[i] += 10;
                System.out.print(arr[i]+ " ");
            }
            else{
                arr[i] *= 2;
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
