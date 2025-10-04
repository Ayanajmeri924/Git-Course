public class Leet121 {
    public static void main(String[] args) {
        int nums[]={7,6,4,3,1};

        System.out.println("nums ka last value "+nums.length+" " +nums[nums.length-1]);
        // nums[nums.length]=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-nums[i+1];

        }
        for(int i:nums){
            System.out.print(i+" ");
        }

    }

}
