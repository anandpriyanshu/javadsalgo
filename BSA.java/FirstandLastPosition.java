public class FirstandLastPosition {
    public static void main(String[] args) {
        
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        //check for 1st occurenece of target first
        int ans[0] = search(nums,target, findStartIndex=true);
        int ans[1] = search(nums,target, findStartIndex=false);
    }



        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            //int mid = (start+end)/2 might be possible that (start+end) exceeds the range of integer in java for large  number
            int mid = start +  (end-start)/2;  //same thing like line 11 but it's better way to write 

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target>nums[mid]){
                start = mid + 1;
            }
            else{
                //potential answer found
                return mid;
            }
        }


    }
    //running this function two times so that make another function
    //this function just returns the index value of what we are trying to seaarch of target(This function just returns the index value of target)
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            //int mid = (start+end)/2 might be possible that (start+end) exceeds the range of integer in java for large  number
            int mid = start +  (end-start)/2;  //same thing like line 11 but it's better way to write 

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target>nums[mid]){
                start = mid + 1;
            }
            else{
                //potential answer found
                ans = mid;
                if(findStartIndex==true){
                    end = mid - 1;

                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;


    }

}
