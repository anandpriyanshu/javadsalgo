public class LinearSearchAlgo{
    public static void main(String[] args) {
        int[] nums = new int[]{23,45,2,1,19,-3,-11};
        int target = 19;
        boolean ans = Linearsearch(nums,target);
        System.out.println(ans);
        
    }
    static boolean Linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i<arr.length; i++){
            int element = arr[i];
            if (element == target){
                return true;
            }
        
        }
        return false;
    }
}
    
