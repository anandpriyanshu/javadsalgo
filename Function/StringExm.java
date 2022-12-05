import java.util.Scanner;
public class StringExm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        String personal = mygreet(name);
        //String personal = mygreet("Priyanshu");      //when we don't want user input.
        System.out.println(personal);  
    }
    static String mygreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
