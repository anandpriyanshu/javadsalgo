import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,100,34,56},
            {18,12}
        };
        int ans = Max(arr);
        System.out.println(ans);
        
    }   
    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE; // also we can assume first row and first col as a minimum like arr[0][0]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
                
            }
            
        }
        return max;

    }
    
}
