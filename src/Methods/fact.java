package Methods;

import java.util.*;
public class fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0){
            n *= (n-1);
            n--;
        }
        System.out.println(n);
    }
}
