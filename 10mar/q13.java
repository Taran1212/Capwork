public class q13 {
    public static void main(String[] args) {
        int n = 320;

        int ans = 0;

        while(n > 0){
            ans = ans*10 + n%10; 

            n/=10;
        }

        System.out.println(ans);
    }
}
