import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Optimal3sum {
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);
        // int l=1,r=arr.length-1,fix=0;
        Set<List<Integer>>set=new HashSet<>();

        for (int fix = 0; fix < arr.length - 2; fix++) {
            if (fix > 0 && arr[fix] == arr[fix - 1]) continue; // skip duplicates

            int l = fix + 1;
            int r = arr.length - 1;
        
            while(l<r){
               
                int sum=arr[l]+arr[r]+arr[fix];
                if(sum==0){
                    
                    set.add(Arrays.asList(arr[l],arr[r],arr[fix]));
                    
                
                    l++;r--;
                }else if(sum>0){
                    r--;
                }else{
                    l++;
                }
            }
        
        }
         
        for (List<Integer> list : set) {
            System.out.println(list);
        }
    }
}
