package ConditionandLoop;
import java.util.Scanner;
public class Maxof{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        if(max > b){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);
    }
}