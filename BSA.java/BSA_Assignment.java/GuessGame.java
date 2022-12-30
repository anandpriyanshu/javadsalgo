//https://leetcode.com/problems/guess-number-higher-or-lower/description/
//package BSA_Assignment.java;

public class GuessGame {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));

        
    }
    static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (guess(mid)==0 ){
                return mid;
            }
            else if(guess(mid)==-1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
        
    }
    
}
