import java.util.Arrays;

//package BSA_Assignment.java;

//import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twosum(arr,9)));
        
    }
    static int[] twosum(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(arr[l]+arr[r]!=target){
            if(arr[l]+arr[r]>target){
                r-=1;
            }
            else{
                l+=1;
            }
        }
        return new int[]{l+1,r+1};
        
        
    }
    

    
}
