//https://leetcode.com/problems/plus-one/

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        plusone(arr);
        
        
    }
    static  int[] plusone(int[] digits){
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            
        }
        // this is the case for 9 series like 99999 answer will be 100000
        int[] new_answer = new int[digits.length+1];
        new_answer[0] = 1;
        return new_answer;
    }
    
}
