import java.util.Arrays;

public class Leet31 {
    public static void main(String[] args) {
        int nums[]={3,2,1};
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            // Arrays.sort(nums);
            reverse(nums,0,nums.length-1);
            for(int i:nums){
                System.out.print(i+" ");
            }
            return;

        }


        for(int i=nums.length-1;i>index;i--){
                if(nums[i]>nums[index]){
                    swap(nums,i,index);
                    break;
                }
        }
        reverse(nums,index+1,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
        

    }
    public static void swap(int[]nums,int i,int j){
        
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;

    }
    public static void reverse(int []nums,int start,int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
