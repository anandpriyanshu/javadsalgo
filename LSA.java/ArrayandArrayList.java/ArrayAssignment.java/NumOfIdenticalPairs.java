//https://leetcode.com/problems/number-of-good-pairs/

public class NumOfIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        numIdenticalPairs(nums);
        
    }
    static int numIdenticalPairs(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
                
            }
            
        }
        return count;
    }
    
}
