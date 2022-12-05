public class FunctionOverload {
    public static void main(String[] args) {
        fun(12);
        fun("Priyanshu");
        int ans = sum(3,4);
        System.out.println(ans);;
        
    }
    static int sum(int a, int b){
        return a + b;
    }
    // functio name is the same but either argument should be same or type should be different.. 
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    
}
