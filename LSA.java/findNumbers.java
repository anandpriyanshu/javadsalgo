
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {12,134,2,6,7896};
        System.out.println(findEvenNum(nums));
        System.out.println(digits(5468));
        // System.out.println(digits2(-5468));
        System.out.println(even(5468));
        
    }
    static int findEvenNum(int[] nums){
        int count = 0;
        for (int num = 0; num < nums.length; num++) {
            if (even(num)){
                count++;
            }
            
        }
        return count;
         
    }
    //check it's even or not
    static boolean even(int num){
        int NumOfDigits = digits(num);
        return NumOfDigits %2 == 0; 
    }
     //count number of digits in a number
    static int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    //finds another way of digits
    // static int digit2(int nums){
    //     if (num<0){
    //         num = num*-1;

    //     }
    //     return (int)(Math.log10(num))+1;
    // }
}
