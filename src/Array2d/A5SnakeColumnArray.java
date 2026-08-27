package Array2d;

public class  A5SnakeColumnArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 9, 3, 12},
                       {46, 12, 63, 21},
                       {32, 16, 28, 34},
                       {35, 95, 47, 17}};
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) System.out.print(arr[i][j] + " ");
            } else {
                for (int i = arr[0].length-1; i >= 0; i--) System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
