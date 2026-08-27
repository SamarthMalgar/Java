package Array2d;

public class A1print {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,6},{3,5,1,6},{4,7,4,5}};
        System.out.println(arr.length +" " +arr[0].length);
        for(int i = 0; i <arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
