import java.util.Arrays;

public class RerverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

        RerverseAnArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void RerverseAnArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            //swap
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    
}
