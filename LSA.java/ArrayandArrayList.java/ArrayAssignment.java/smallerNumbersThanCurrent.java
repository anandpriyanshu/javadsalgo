//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(SmallNumber(nums));

        
    }
    static int[] SmallNumber(int[] nums){
        int[] answer  = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i] > nums[j]){
                    count++;

                }
                answer[i] = count;
                
            }
            
        }
        return answer;

    }
    
}
