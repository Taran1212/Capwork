public class q1{
    public static void main(String[] args){
        int r = 7;
        int unit = 2;

        int arr[] = {2,8,3,5,7,4,1,2};

        int idx = 0;

        int total = r*unit;
        for(int i = 0; i < arr.length; i++){
            total -= arr[i];

            if(total <= 0){
                idx = i+1;
                break;
            }
        }

        System.out.println(idx);
    }
}