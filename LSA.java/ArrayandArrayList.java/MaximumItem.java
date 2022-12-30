public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(MaximumItem(arr));
        //System.out.println(MaxRange(arr, int start, int));

    }
    //imagine that arry is not empty
    static int MaximumItem(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >maxVal){
                maxVal = arr[i];

            }
            
        }
        return maxVal;

    }
    // static int MaxRange(int[] arr, int start, int end){
    //     int maxVal = arr[start];
    //     for (int i = start; i < arr.end; i++) {
    //         if (arr[i] >maxVal){
    //             maxVal = arr[i];

    //         }
            
    //     }
    //     return maxVal;

    // }
    
}
