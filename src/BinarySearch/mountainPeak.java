package BinarySearch;

public class mountainPeak {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,6,8,9,10,13,16,18,19,20,25,26,16,14,12,10,9,7,6,5,4,3,2,1};
        int low = 0, high = arr.length-2;
        while(low<=high){
            int mid = (low+high)/2;
//            if(arr[mid] <= arr[mid+1] && arr[mid] >= arr[mid-1]) low = mid+1;
//            else if(arr[mid] >= arr[mid+1] && arr[mid] <= arr[mid-1]) high = mid - 1;
//            else{
//                System.out.print(arr[mid]);
//                break;

            if (arr[mid] < arr[mid+1]) low = mid+1;
            else high = mid -1;
            }
        System.out.println(arr[low]);


        }

    }

