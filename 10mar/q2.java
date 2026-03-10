public class q2 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,3,2,1};
        
        int peak = -1;
        
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                peak = arr[i];
                break;
            }
        }
        
        System.out.println(peak);
    }
}
