import java.util.*;

public class q15 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,5,6};

        List<Integer> l1 = new ArrayList<>();

        for(int x : arr){
            if(x >= 0){
                l1.add(x);
            }
        }

        System.out.println(l1.get(l1.size()/2-1));

    }
}
