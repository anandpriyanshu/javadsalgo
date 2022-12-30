//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/description/

public class PeakIndexInMountainArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,4,3,2};
        int ans = peakindexmountainArray(arr);
        System.out.println(ans);

        
    }
    static int peakindexmountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]> arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the possible answer but look at left
                //this is  why end != mid - 1
                end = mid;
            } else{
                //you are in the increasing part of the array
                start = mid +1; // bcz we know that mid+1 element > mid element hence we are ignoring mid element 
            }

        }// in the end,  start == end  and pointing to the largest number bcz of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks 
        //hence when they are pointing to just one element,  that is the max one because that is what the checks say.
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time.
        // and if we are saying that only one item is remaining, hence bcz of above line that is the best possible answer.
        return start; // or return end as both are equal.
    }

    
}
