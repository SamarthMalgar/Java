package Array;

public class secondMax {
    public static void main(String[] args) {
        int[] arr = {4,8,10,14,18,24,5,2};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // for max value
        for(int i =0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
