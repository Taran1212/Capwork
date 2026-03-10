public class q14 {
    public static void main(String[] args) {
        
        String str = "internationalization";

        String ans = "" + str.charAt(0) + (str.length()-2) + str.charAt(str.length()-1);

        System.out.println(ans);
    }
}
