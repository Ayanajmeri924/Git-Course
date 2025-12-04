import java.util.HashMap;
import java.util.Map;

public class Leet3005 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4};//4 is output

        HashMap<Integer,Integer>map=new HashMap<>();
        int c=0,m=0;
        for (int i : arr) {
           map.put(i,map.getOrDefault(i,0)+1);
           
        }
        // System.out.println(map);

        int maxFreq = 0;
        for (int count : map.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Step 3: Count total elements with max frequency
        int total = 0;
        for (int count : map.values()) {
            if (count == maxFreq) {
                total += count;
            }
        }
        // int q=1;
        // int s=2;
        // double k=(double)q/(double)s;
        // String a=Double.toString(k);
        // System.out.println(a);
        System.out.println(total);

        
        


    }

}
