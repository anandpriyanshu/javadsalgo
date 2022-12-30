//https://leetcode.com/problems/search-insert-position/description/
//



//celing: smallest element in the array which is greater than target or equal to target. 



public class CelingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingofnumber(arr,target);
        System.out.println(ans);

        
        
    }
    //return the index: smallest number >= target
    static int ceilingofnumber(int[] arr, int target){
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
        return start; // when while loop is violated. In this case (arr[mid] < target) start = end+1 means start = mid + 1 then start > end  
    }
}
