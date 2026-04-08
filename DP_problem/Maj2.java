import java.util.PriorityQueue;

public class Maj2 {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,1,1,1,1,1,2,3,3,3,3,3,3,3,3,2}; 
        int ele=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                ele=nums[i];
                // c++;
            }
            if(ele==nums[i]){
                c++;
            }else{
                c--;
            }
        }
        System.out.println(nums.length);
        if(ele>nums.length/3){

            System.out.println(ele);
        }else{
            System.out.println("No majority element");
        }

        System.out.println(0%2==0);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10); 
        
    }
}
