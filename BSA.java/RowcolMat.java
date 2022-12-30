import java.util.Arrays;

public class RowcolMat {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 76)));

    }
   
    static int[] search(int[][] matrix, int target){
        int r = 0; //lower bound
        int c = matrix.length - 1;   //upper bound
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            //lower bound start from row '0' and upper bound start from last column means from 'n'.
            if(matrix[r][c] > target){
                c--;    //shift column by 1
            }
            else{
                r++;   //shift row by 1
            }
        }
        return new int[]{-1,-1};
    }
    
}
