package Array2d;

public class A2sum {
    public static void main(String[] args){
          int[][] arr = {{2,4,3,6},{9,2,3,1},{3,1,8,4},{3,9,4,1}};
          int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + ints[j];
            }
        }
        System.out.println("The sum of the 2d array is : " +sum);


    }
}
