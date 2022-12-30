//https://leetcode.com/problems/sort-colors/

public class SortColour {
    
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int[] ans = sortcolour(arr);
        System.out.println(ans);

        
    }
    static int[] sortcolour(int[] arr){
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){c0++;}
            if (arr[i] == 1){c1++;}
            if (arr[i] == 2){c2++;} 
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<c0){
                arr[i] =  0;
            }
            else if(i<c0+c1){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
            
        } 
        return arr;
    }
}
