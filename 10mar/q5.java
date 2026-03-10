public class q5 {
    public static void main(String[] args) {
        char[] arr = new char[26];

        String s1 = "horse";
        String s2 = "esorh";

        if(s1.length() != s2.length()){
            System.out.println("not");
        }else{
            for(int i = 0; i < s1.length(); i++){
                arr[s1.charAt(i)-'a'] ++;
                arr[s2.charAt(i)-'a']--;

            }

            boolean flag = false;

            for(int i = 0; i < arr.length; i++){
                if(arr[i]!= 0){
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("no");
            }else{
                System.out.println("yayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
            }
            
        }
    }
}
