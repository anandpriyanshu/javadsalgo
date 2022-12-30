//floor of number: gretest number smaller or equal to target number.
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floorofnumber(arr,target);
        System.out.println(ans);
        

        
    }
    //return the index: gretest  number <= target
    static int floorofnumber(int[] arr, int target){
        //but what if  the target is gretaer than the greatest number in the arryay

        if (target > arr[arr.length-1]){
            return -1;
        }
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
        return end; // // when while loop is violated 
    }
}
