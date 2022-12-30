package ConditionandLoop;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println(isArmstrong(n));
        //this for loop only checking 4 armstrong number b/w 100 to 1000
        //for (int i = 100; i < 1000; i++) {
        //   if (isArmstrong(i)){
        //        System.out.println(i + "");
        //    }
            
        //}
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }

    
}
