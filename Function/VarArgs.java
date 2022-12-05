import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,9);
        
    }
    static void fun(int ...v){ // can be string or char as well
        System.out.println(Arrays.toString(v));
    }
    
}
