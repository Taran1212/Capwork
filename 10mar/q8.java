public class q8 {
    public static void main(String[] args) {
        String str = "nrfzh";

        String ans = "";

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            if(c - 3 < 0){
                switch(c){
                    case 'a':
                        ans += "x";
                        break;

                    case 'b':
                        ans += "y";
                        break;
                    
                    case 'c':
                        ans += "z";
                        break;
                }
            }else{
                ans += "" + (char)(c-3);
            }
        }

        System.out.println(ans);
    }
}
