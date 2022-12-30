public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
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




    static int findPivot(int[] arr){
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
            if (arr[mid]<=arr[start]){     // then mid elements ahead of mid will ignore and more bigger number definetly exist before of the mid.
                end = mid -1;
            }
            else{
                start = mid+1;   //    arr[mid]>arr[start]  // in this case mid elements before mid element will ignore. and if mid was the pivot this would caught in anyone above cases. Definetly moe bigger number exist after the mid.
            }
        }
        return -1;


    }
    
}
