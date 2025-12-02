public class Check {
     public static int reverse(int n){
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10 + ld;
            n=n/10;
        }
        System.out.println(rev);
        return rev;
    }

    public static int checking(int nums[]){
        if(nums.length==2){
            int n=reverse(nums[0]);
            if(n==nums[1]){
                return 1;
            }else{
                return -1;
            }
        }
        if(nums.length==1){
            return -1;
        }
        
        // List<Integer>list=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            int n=reverse(nums[i-1]);
            if(n==nums[i]){
                return Math.abs((i-1)-i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={12,21,45,33,54};
        System.out.println(checking(nums));
        
    }
}
