import java.util.*;

public class q4 {
    public static void main(String[] args) {
        String str = "abcdd";

        String ans = "";

        int max = Integer.MIN_VALUE;

        HashMap<Character,Integer> h1 = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            h1.put(c,h1.getOrDefault(c,0)+1);

            if(h1.get(c) > max){
                max = h1.get(c);
                ans = "" + c;
            }
        }

      

        System.out.println(ans);
    }
}
