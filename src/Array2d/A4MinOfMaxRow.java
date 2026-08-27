package Array2d;

public class A4MinOfMaxRow {
    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int min = Integer.MAX_VALUE;
        int row = -1;
        for (int i= 0; i< arr.length; i++) {
            int max = arr[0][0];
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]> max)
                    max = arr[i][j];
            }
            System.out.print(" " +max);
            if(max < min){
                min = max;
                row = i;
            }
        }
        System.out.println();
        System.out.println(row+ " " +min);
    }
}
