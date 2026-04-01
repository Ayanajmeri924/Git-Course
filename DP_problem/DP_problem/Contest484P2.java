package DP_problem;

import java.util.Arrays;

public class Contest484P2 {
    public static void main(String[] args) {
        int nums[]={3,1,2};
        int m=2,k=8;

        int track=0;
        // int max
        Arrays.sort(nums);
        for(int i=nums.length-2;i>=0;i--){

            // while()
            int diff=nums[i+1]-nums[i];

            if(diff<=k && track<m){
                track++;
                nums[i+1]+=1;
                
            }
            
        }
        
        // System.out.println(diff);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
