public class q2 {
    public static void main(String[] args){
    String str = "0C1A1B1C1C1B0A0";

    int ans = str.charAt(0)-'0';

    for(int i = 1; i < str.length(); i+=2){
        char operation = str.charAt(i);
        int next = str.charAt(i+1)-'0';

        switch(operation){

            case 'A':
                ans &= next;
                break;

            case 'B':
                ans |= next;
                break;

            case 'C':
                ans ^= next;
                break;
        }
    }

    System.out.println(ans);
}
}
