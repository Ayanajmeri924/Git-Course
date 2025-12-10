public class SortColor {
    // int rev()
    public static void main(String[] args) {
        int nums[]={0,2,1,0,0,1,2,2};

        int start=0,mid=0,end=nums.length-1;

        while(mid<=end){
            if(nums[mid]==2){
                nums[start]=nums[end];
                nums[end]=2;
                // start++;
                end--;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                 nums[mid]=nums[start];
                nums[start]=0;
                mid++;
                start++;
            }

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
