https://leetcode.com/problems/concatenation-of-array/description/

public class Concatenate {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        getConcatenation(arr);
    
        
    }

    static int getConcatenation(int[] nums){
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    
}
