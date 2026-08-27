package basic_Sorting;

public class sortZeroToEnd {
    public static void print(int[] nums) {
        for(int ele : nums)
            System.out.print(ele+ " ");
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,-3,4,21,7,-8,-4,};
        int n= arr.length;
        int j = 0;
            for(int i = 0; i<n; i++){
                if(arr[i] != 0) {
                    if(i!=j){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
        print(arr);

    }
}
