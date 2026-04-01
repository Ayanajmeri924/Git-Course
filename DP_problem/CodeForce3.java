import java.util.Scanner;

public class CodeForce3 {
    public static void main(String[] args) {
        // String s="ayanajmerio";
        // int c=0;
        //Binary Game -CodeForces Problem 

        Scanner in=new Scanner(System.in);
        int total=in.nextInt();
    
        int Count=0;
        while(Count++<total){
            
            
            int n=in.nextInt();
            int nums[]=new int[n];
            
            
            for(int i=0;i<nums.length;i++){
                nums[i]=in.nextInt();
            }
            if(nums[0]==1 || nums[n-1]==1){
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
            
            
            // int ZeroC=0,OneC=0;
            // for(int i=0;i<nums.length;i++){
            //     if(nums[i]==0){
            //         ZeroC++;
            //     }else{
            //         OneC++;
            //     }
            // }
            // if(nums.length%2!=0){
            //     System.out.println("Alice");
            // }else{
            //     System.out.println("Bob");
            // }
            // Count++;
        }
        // if(s.length()>10){
        //     System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
        // }else{
        //     System.out.println(s);
        // }
                        

    }
}
