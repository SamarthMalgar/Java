package BinarySearch;

public class FindFloor {
    public static void main(String[] args) {

        int[] arr = {1,2,8,10,10,12,12,12,19};
        int x = 12;
        int idx = -1;
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > x) hi = mid - 1;
            if(arr[mid]<=x) {
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }
}
