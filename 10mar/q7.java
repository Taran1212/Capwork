import java.util.*;

public class q7 {
    public static void main(String[] args) {
        HashSet<Character> h1 = new HashSet<>();

        String str = "abcdda";

        String ans = "";

        for(int i =0; i < str.length(); i++){
            if(!h1.contains(str.charAt(i))){
                h1.add(str.charAt(i));
                ans += str.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
