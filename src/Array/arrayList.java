package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[]a){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);  //adding from behind the array;
        arr.add(12);
        arr.add(28);
        arr.add(34);
        arr.add(10);

        System.out.println(arr.get(2));  //arr[2]
        arr.set(3,50);   // arr[3] = 50;

        System.out.print(arr);

        System.out.println();

        int n = arr.size();   //it is the length of the array list or dynamic array.
        for(int i = 0; i<n; i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        arr.add(4, 122);
        arr.remove(arr.size()-1); //current array size.
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
