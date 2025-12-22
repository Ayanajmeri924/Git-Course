public class LeetBiWeekly172 {
    public static void main(String[] args) {
        // int nums[]={12,23,4,5,6,7,8,8};
        // int x=3;
        // int j=nums.length-3;
        // System.out.println(j+" "+nums[j]);
        // while(true){
            
        //     for(int i=0;i<j;i++){
        //         nums[i]=nums[x++];
        //     }
        //     if(nums.length>3){
        //         // return 1;
        //         System.out.println("1");
        //         break;
        //     }else{
                
        //     }
        // }

        int nums[]={4,3,2,1};

        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum%3==0){

                        max=Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);

        int max2=0;

        int l=0,mid=1,r=nums.length-1;

        while(l<r){
            int sum=nums[l]+nums[mid]+nums[r];
            if(sum%3==0){
                max2=Math.max(max2, sum);
            }else{
                // r--;
                if((sum-nums[r])%3==0){
                    r--;
                }else if((sum-nums[mid])%3==0){
                    mid++;
                }else if((sum-nums[l])%3==0){
                    l++;mid++;
                }
            }
        }
        System.out.println(max2);
    }

    
}
