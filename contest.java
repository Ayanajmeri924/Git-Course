import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class contest {
    public static void main(String[] args) {
        int n=102;
        String len=String.valueOf(n);
        int leng=len.length();      
        int []arr=new int[leng];        
        int power = 0;
        int i=0;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                // components.add(digit * (int)Math.pow(10, power));
                arr[i++]=digit*(int)Math.pow(10, power);
            }else{
                arr[i++]=0;
            }
            n /= 10;
            power++;
        }
        for(int a=0;a<i/2;a++){
            int temp=arr[i-a-1];
            arr[i-a-1]=arr[a];
            arr[a]=temp;
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        // Reverse to get descending order
        // Collections.reverse(components);
        // return components;
    }
        
}
