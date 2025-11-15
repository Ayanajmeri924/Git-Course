public class Contest169q3 {
    public static void main(String[] args) {
        int nums[]={2,2,2,2,2,3,4,0,5};
        int c=1,ele=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<=nums[i]){
                c++;
                
            }else{
                ele=nums[i-1]-nums[i];
                // c++;
                nums[i] +=ele;
                if(nums[i]<=nums[i+1]){
                    c++;
                }else{
                    break;
                }
                
                // break;
            }
        }
        System.out.println(c);
    }
}
