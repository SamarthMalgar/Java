package Recursion;

public class globalVariables {
    static int x = 15; //static means sharable.
    public static void main(String[] args) {
       // int x = 10;
        fun();

    }
    public static void fun(){
        System.out.println(x);
    }
}
