package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int x[] = {2,3,4,-76,12,4};
        System.out.println(x[4]);
        change(x);
        System.out.println(x[4]);
    }
    //pass by reference using different Method name
    public static void change(int[] y) {
        y[4] = 7;

    }
}
