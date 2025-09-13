import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestAbNu {
    public static void main(String[] args) {

        int nums[]={3,5,-39,1};
        double avg=0.0;
        Set<Integer>set=new HashSet<>();
        for(int x:nums){
            avg+=x;
            // set.add(x);
        }
        avg=avg/nums.length;
        for(int x:nums){
            // avg+=x;
            set.add(x);
        }

        int cand=(int)Math.floor(avg)+1;
        System.out.println(cand);
        if(cand<1)cand=1;

        while(set.contains(cand)){
            cand++;
        }
        System.out.println(cand);








        
        // Arrays.sort(arr);
        // double sum=0.0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // double avg=(sum)/(arr.length);
        // // System.out.println(arr.length);
        // System.out.println(avg);
        // double max=0;
        // // double temp=0.0;
        // for(int i=0;i<arr.length;i++){
        //     // max=Math.max(avg, arr[i]);
        //     if(avg>arr[i] && arr[i+1]>(avg+1)){
        //         // System.out.println(Math.abs(avg));
        //         double sub=arr[i+1]-arr[i];
                
                
                // System.out.println(avg);
                
            // }
            
            // System.out.println(arr[i]);
        // }
        // System.out.println();

    }
}
