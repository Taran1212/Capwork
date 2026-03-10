public class q6 {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "this is level 71";

        String[] arr = str.split("\\s+");

        for(int i = 0; i < arr.length; i++){
            if(isPalindrome(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
