import java.util.Arrays;
import java.util.Scanner;
public class Multidimension {
    public static void main(String[] args) {
        

        // //column  is not mandatory. exm = int[3][]
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // }; 


        Scanner in = new Scanner(System.in);
        int[][] arr  = new int[3][3];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {      //length of every row
                arr[row][col] = in.nextInt();
                
            }  
        }
        //output

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {      //length of every row
                System.out.print(arr[row][col] + " ");
                
            }
            System.out.println(); // after printing the one row printing the new line
            
        }
        // for (int row =0; row<arr/length){
        //     System.out.println(Arrays.toString(a));
        // }

    }
    
}
