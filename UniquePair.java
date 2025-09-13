// import java.util.HashMap;
import java.util.HashSet;
// import java.util.Map;
import java.util.Set;

public class UniquePair {
    public static void main(String[] args) {
        int arr[]={1,5,1,6,7,1,2,3,4};
        int n=arr.length;
        int tar=9;
     

        Set<String>s=new HashSet<>();

       int c=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int add=arr[i]+arr[j];
                if(tar==add){
                    int a=Math.min(arr[i], arr[j]);
                    int b=Math.max(arr[i], arr[j]);
                    String pair= a+" "+b;
                    if(!s.contains(pair)){
                        c++;
                        s.add(pair);
                        System.out.println(pair);
                    }
                }                
            }
        }
        System.out.println(c);
    }
}
