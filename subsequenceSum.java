import java.util.Arrays;
import java.util.HashMap;

public class subsequenceSum {
    static int nums[]={1,2,3};
    static int k=2;
    public static void main(String[] args) {

        HashMap<Integer,Integer>set=new HashMap<>();
         set.put(0, 1);
        
        int sum=0;int c=0;
        for (int num : nums) {
            sum += num;

            // Check if (sum - k) has been seen before
            if (set.containsKey(sum - k)) {
                c += set.get(sum - k);
            }

            // Record the current prefix sum
            set.put(sum, set.getOrDefault(sum, 0) + 1);
        }
        System.out.println(c);

        // int nums[]={1,1,1};
        // int k=2;
        // int c=0;

        // int l=0,r=nums.length-1;
        // Arrays.sort(nums);
        // while(l<r){
        //     int sum=nums[l]+nums[r];
        //     if(sum==k){
        //         c++;
        //         l++;
        //         r--;

        //     }else if (sum<k) {
        //         l++;
        //     }else{
        //         r--;
        //     }
        // }
        // System.out.println(c);
    }
}
