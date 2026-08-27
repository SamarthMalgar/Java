package Array2d;

public class TransposeOfMatrix {
    public static void main(String[]a){
        int[][] arr = {
                {2 , 9, 3, 12},
                {46, 12, 63, 21},
                {32, 16, 28, 34},
                {35, 95, 47, 17}
        };
        for(int i = 0 ; i< arr.length; i++){
            for(int j =0; j< i; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        print(arr);
    }
    public static void print(int[][] TranM){
        for(int[] a : TranM){
            for(int ele: a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }

    }
}
