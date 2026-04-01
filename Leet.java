import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leet {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();

        
        Scanner in=new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            nums.add(in.nextInt());
        }
        
        int arr[]=new int[nums.size()];

        // for(int i=0;i<nums.size();i++){
        // //    arr[i]=nums.get(i) | (nums.get(i)+1);
        //    arr[i]=i | (i+1);

        // }

        System.out.println(nums);

        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // Arrays.fill(arr,-1);
        // System.out.println("Fill");
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==2){
                arr[i]=-1;
                continue;
            }
            for(int j=0;j<32;j++){
                if((nums.get(i) & (1<<j))>0){
                    continue;

                }else{
                    int prev=j-1;
                    int x=(nums.get(i) ^ (1<<(j-1)));
                    arr[i]=x;
                    break;
                }
                
            }
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
