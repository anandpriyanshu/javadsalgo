import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExm {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index like this
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(list.get(i));  // pass index here, list[index] syntax won't work here.
            
        // }
        System.out.println(list);

    }
    
}
