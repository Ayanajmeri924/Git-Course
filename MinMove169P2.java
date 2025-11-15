import java.util.Arrays;

public class MinMove169P2 {
    public static void main(String[] args) {
        int nums[]={1,0,4};
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int store=0;
        // System.out.println(max);
        for(int i=0;i<nums.length;i++){
            int ele=max-nums[i];
            store +=ele;
        }
        System.out.println(store);
    }
}
