public class RunningSumof1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        runningsum(arr);
        
    }
    static  int[] runningsum(int[] arr){
        int ans = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            ans += arr[i];
            result[i] = ans;
            
        }
        return result;

    }
    
}
