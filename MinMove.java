import java.util.Arrays;

public class MinMove {
    public static void main(String[] args) {
        int nums[]={1,3,4,5};
        // Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Integer.max(max, nums[i]);
        }
       
        int c=0;
        for(int i=0;i<nums.length;i++){
            c +=max-nums[i];
        }
        System.out.println(c);

    }
}
