import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        SwapInArray(arr,1,3);
        System.out.println(Arrays.toString(arr));

    }
    //here not returing anything so void
    static void SwapInArray(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    
}
