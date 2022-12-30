
public class ShuffleOfArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = Shuffle(nums,n);
        System.out.println(result);
        
    }
    static int[] Shuffle(int[] nums,int n){
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + 1];

            
        }
        return ans;
    }
    
}
