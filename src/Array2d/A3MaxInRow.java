package Array2d;

public class A3MaxInRow {
    public static void main(String[] args) {
        int[][] arr = {{2,4,3,6},{9,2,3,1},{9,6,8,4},{3,9,4,1}};
        int  max = Integer.MIN_VALUE;  //initilize as minimum value.
        int row = -1;
        for(int i=0; i< arr.length; i++){
            int sum = 0;
            for(int j=0; j< arr[0].length; j++) {
                sum += arr[i][j];
            }
                if(sum > max){
                    max = sum;
                    row = i;
                }
        }
            System.out.println(row+ " " +max);

    }
}
