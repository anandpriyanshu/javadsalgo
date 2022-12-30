// total number of comparison(level) in worst case is logN in Binry searrch algorithm. (N= size of array) 
public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-18,-12,-4,3,4,5,16,18,22,45};
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = binarySrch(arr,target);
        System.out.println(ans);
        
    }

    static int binarySrch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            //int mid = (start+end)/2 might be possible that (start+end) exceeds the range of integer in java for large  number
            int mid = start +  (end-start)/2;  //same thing like line 11 but it's better way to write 

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
