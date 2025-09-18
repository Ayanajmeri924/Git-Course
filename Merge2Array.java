import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Merge2Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int arr1[]={2,3,4,5,6,7,8,9}; 
        int arr2[]={2,4};
        int m=arr1.length;
       int n=arr2.length;

        List<Integer>merge=new ArrayList<>();
        for(int i=0;i<m;i++){
            merge.add(arr1[i]);
        }
        for(int i=0;i<n;i++){
             merge.add(arr2[i]);
        }
        
        float mid=0f;
        Collections.sort(merge);
        System.out.println(merge.size());
        
        // System.out.println();
        // for(int i:merge){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        
        mid=merge.size()/2;
        float mid2=(merge.size()/2-1);
        // System.out.println(mid+" "+mid2);

        if((merge.size())%2==0){
            float a=merge.get((int)mid);
            float b=merge.get((int)mid2);
            System.out.println((a+b)/2.0);
        }else{
            System.out.println(merge.get((int) mid));
        }
        
        in.close();
    }
}
