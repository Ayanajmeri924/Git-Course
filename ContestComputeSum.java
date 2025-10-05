public class ContestComputeSum {
    public static void main(String[] args) {
        int nums[]={1};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                sum=sum-nums[i];
            }else{
                 sum=sum+nums[i];
            }
        }
        
            System.out.println(sum);
    }
}

