package Methods;

import java.util.Scanner;

public class add {
    public static double cube(double a, double b){
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        
        System.out.print(cube(9+n1, n2));
    }
}
