//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfinteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,139,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));


        
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first sytart with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range

        while (target>arr[end]){
            int temp = end + 1; //this is my new start
            //double the box value
            // end = previous end + sizeofbox*2  ,  sizeofbox  = end - (start -1)
            end = end  + (end - start + 1)*2;
            start = temp; 
        }
        return binarySrch(arr, target, start, end);

    }
    static int binarySrch(int[] arr, int target, int start, int end){

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
