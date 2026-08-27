package Array;

import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20,30,40,50};
//        int[] x =arr; //x is the shallow copy of arr
//        x[0] = 123;


        int[] deep = Arrays.copyOf(arr, arr.length); //deep copy.
        deep[0] = 23;
        System.out.println(arr[0]);
    }

}
