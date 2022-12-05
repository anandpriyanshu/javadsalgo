import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
    
}//Note: Anything that intialised outside the block can be used inside the block but anything that is intialised inside the block can't used outside the block. 
//Note: Anything that intialised outside the block can't be again intialised inside the block but anything that is intialised inside the block can definitly intialised again outside the block. 