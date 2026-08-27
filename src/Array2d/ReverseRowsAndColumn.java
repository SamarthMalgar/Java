package Array2d;
//solution incomplete do it later copy the reversed arr to another new arr and reverse the cols

public class ReverseRowsAndColumn {
    public static void main(String[]a){
        int[][] arr = {
                {28, 91, 33, 12},
                {46, 12, 63, 21},
                {32, 16, 29, 34},
                {35, 95, 47, 17}
        };
        for (int[] ints : arr) {
            for (int j = arr[0].length - 1; j>=0; j--) {
                System.out.print(ints[j] + " ");

            }
            System.out.println();
            int[][] original = new int[4][4];
           // original[][] = arr[][];

        }
    }
}
