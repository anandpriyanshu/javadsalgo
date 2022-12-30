public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(CountRotation(arr));
        
    }
    //In rotation adding only 2 line of coding rest all codes copy from earchInRotatedSortedArr. adding only countRotation function
    static int CountRotation(int[] arr){
        int pivot = findPivot(arr);
        if(pivot == -1){
            //arr is not rotated
            return 0;
        }
        else{
            return pivot + 1;
        }

    }
    //use this for non duplicate
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
