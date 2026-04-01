package Udemy;

public class MinOp {
    public static boolean isSorted(int nums[]){
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
    public static int minimumPairRemoval(int[] nums) {
        
        if(isSorted(nums)){
            return 0;
        }

        // ArrayLis<Integer>a=new ArrayList<>();
        int l=0,r=1;
        int op=0;
        while(r<nums.length){
            if(nums[l]<=nums[r]){
                l++;
                r++;
                continue;
                
            }else{
                int sum=nums[r]+nums[r+1];
                if(nums[l]<=sum){
                    op++;
                    l++;
                    r=r+2;
                }
            }
        }
        return op;
        
        

    }
    public static void main(String[] args) {
        int nums[]={1,7,6,3,5,2};
        System.out.println(minimumPairRemoval(nums));
    }
}
