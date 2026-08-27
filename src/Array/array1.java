package Array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,9,6,5,665,65,-4,};
//        //System.out.print(arr[3]);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
        //declare array
        int[] sam = new int[7];
        for(int i = 0; i < sam.length; i++){
            System.out.print(sam[i]+ " ");
        }
        //input
        for(int i = 0; i < sam.length; i++){
            sam[i] = sc.nextInt();
        }
        //print
        for(int i = 0; i < sam.length; i++){
            System.out.print(3*sam[i]+ " ");
        }



    }

}
 