public class q11 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,8};

        int n = 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != n){
                System.out.println(n);
                break;
            }
            n++;
        }

      


    }
}
