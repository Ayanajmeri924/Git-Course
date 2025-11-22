public class Dsa {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,6};
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum=sum+i;
        }
        int ArrSum=0;
        for(int i=0;i<nums.length;i++){
            ArrSum +=nums[i];
        }
        System.out.println(ArrSum);
        System.out.println(sum+" "+nums.length);
        System.out.println(sum-ArrSum);
    }
}
