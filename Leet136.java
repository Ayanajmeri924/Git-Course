import java.util.HashMap;
import java.util.Map;

public class Leet136 {
    public static void main(String[] args) {
        int arr[]={1,0,1};
        // boolean[] visit=new boolean[arr.length];
        int c=0,ele = 0;
        for(int i=0;i<arr.length;i++){
            
            if(c==0){
                c+=1;
                ele=arr[i];
            }else if(ele ==arr[i]){
                c=c-1;

            }else{
                c++;
            }
            
        }
        System.out.println(ele);
        int f=0;
        for(int i=0;i<arr.length;i++){
            f ^=arr[i];
        }
        System.out.println(f);


    }
}
