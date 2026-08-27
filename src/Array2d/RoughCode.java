package Array2d;

public class RoughCode {
    public static void main(String[] args){
        int[][] arr ={{1,2,3},
                     {4,5,6},
                      {7,8,9}
        };

        /*PRINT COLUMN WISE
        //NO OUTER, INNER ENHANCED FOR LOOP
        for(int j = 0; j < arr[0].length; j++){
            for (int[] ints : arr) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
         END*/

        /* INNER ENHANCED FOR LOOP
        for(int i = 0; i < arr.length; i++){
            for(int ele : arr[i]){
            System.out.print( ele+ " ");
            }
            System.out.println();
        } END */

        /*OUTER AND INNER ENHANCED FOR LOOP
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        */
//        int row= arr.length, col = arr[0].length;
//        int[][] b = new int[col][row];
//        for(int i = 0; i < b.length; i++){
//            for(int j = 0; j < b[0].length; j++){
//                b[i][j] = arr[j][i];
//            }
//        }
//        for(int[] ints : b){
//            for(int j = b[0].length-1; j>=0; j--){
//                System.out.print(ints[j]+ " ");
//            }
//            System.out.println();
//        }
//       for(int i = 0; i<arr.length; i++){
//           for(int j =0; j<i;j++){
//               int temp = arr[i][j];
//               arr[i][j]  = arr[j][i];
//               arr[j][i] = temp;
//           }
//       }
//       for(int[] a : arr){
//           for(int j = arr[0].length-1; j>= 0; j--){
//               System.out.print(a[j]+ " ");
//           }
//           System.out.println();
//       }

    }
}
