

public class checkIfPangram {
    public static void main(String[] args) {
        
    }
    static boolean isPanagram(String sentence){
    Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); ++i){
            s.add(sentence.charAt(i));
        return s.size() == 26;
        }
    }
    
}
