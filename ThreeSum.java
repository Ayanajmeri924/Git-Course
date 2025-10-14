import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>>al1=new ArrayList<>();
        int n=arr.length;
        // int l=0,r=arr.length-1,m=arr.length-2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        List<Integer> al=Arrays.asList(arr[i],arr[j],arr[k]);
                       
                        Collections.sort(al);
                        if(!al1.contains(al)){
                            al1.add(al);
                        }
                        // return al1;
                    }
                }
            }
        }
        return al1;

    }
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
                List<List<Integer>>res=threeSum(arr);

        for (List<Integer> list : res) {
            System.out.print(list);
        }

        // System.out.println(x+" "+j+" "+k);
    }
}
