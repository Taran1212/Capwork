public class q9 {
    public static void main(String[] args) {
        
        int arr[] = {5,0,7,6};

        int j = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i = j; i < arr.length; i++){
            arr[i] = 0;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
