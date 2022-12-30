public class SearchInRotatedSortedArrWithDuplicate {
    public static void main(String[] args) {
        int arr[] = {2,2,4,3,3};
        System.out.println(findPivotwithDublicate(arr));
        
    }
    static int search(int[] nums, int target) {
        int pivot = findPivotwithDublicate(nums);
        //if you didn't find the pivot, that means the array is not rotated
        if (pivot==-1){
            //just do normal binary search bcz arr not rotated
            return binarySrch(nums, target, 0,nums.length-1);
        }
        //if pivot is found, you have found 2 assending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarySrch(nums, target,0,pivot-1);
        }
        return binarySrch(nums, target, pivot+1, nums.length-1);

    
        

    }
    static int binarySrch(int[] arr, int target,int start, int end){
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




    static int findPivotwithDublicate(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start +  (end-start)/2;
            //4 cases are overhere.
            
            if(mid<end && arr[mid]>arr[mid+1]){    // mid < end just bcz in worst scenerio mid ele at last index of array
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){    //mid > start just bcz in worst scenerio mid ele at last start of array
                return mid-1;
            }
            //if element at the middle, start,end are equal then just skip the dublicates
            if(arr[mid] == arr[start] && arr[mid] == arr[start]){
                //skip the dublicates
                //NOTE:what if these elements at start and end were at pivot??
                //  check if start is pivot
                if(arr[start]<arr[start+1]){
                    return start;
                }
                start++;
            //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right 
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            
        }
        return -1;


    }

}
