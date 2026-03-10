public class q3 {
    public static void main(String[] args) {

        String str = "1110111101";

        String ans = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            } else {
                ans = ans + (char)('A' + (count - 1));
                count = 0;
            }
        }

        if (count != 0) {
            ans = ans + (char)('A' + (count - 1));

        }

        System.out.println(ans);
    }
}
