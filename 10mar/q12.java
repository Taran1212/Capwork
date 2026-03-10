public class q12 {
    public static void main(String[] args) {
        
        int upper = 0;
        int lower = 0;

        String str = "AaBcdFJKKJI";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                upper ++;
            }else if(ch >= 'a' && ch <= 'z'){
                lower ++;
            }
        }

        if(lower > upper){
            str = str.toLowerCase();
        }else{
            str = str.toUpperCase();
        }

        System.out.println(str);
    }    
}
