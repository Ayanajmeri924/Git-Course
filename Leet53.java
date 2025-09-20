public class Leet53 {
    public static void main(String[] args) {

        int arr[]={-2,-1};
        /* 
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6. */

        int current = 0;
        int maxValue = arr[0];
        for(int i = 0; i <arr.length; i++){
            current = current + arr[i];
            maxValue = Math.max(current, maxValue);
            if(current < 0){
                current = 0;
            }
        }
        System.out.println(maxValue);


        
        

        int maxsum=arr[0],cursum=0;
        for(int i=0;i<arr.length;i++){

            cursum=cursum+arr[i];

            if(cursum>maxsum){
                maxsum=cursum;

            }
            if(cursum<=0){
                cursum=0;
            }
        }


        
        // int maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++){
        //         sum=sum+arr[j];
        //         maxsum=Math.max(maxsum, sum);
        //     }
        // }

        System.out.println(maxsum);
    }

}
