import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void subSet(int arr[],List<Integer>list ,int i){
        if(i==arr.length){
            for(int ele:list){
                System.out.print(ele+ " ");
            }
            System.out.println();
            return;
        }

        //include
        list.add(arr[i]);
        subSet(arr, list, i+1);
        
        //exclude
        list.remove(list.size()-1);
        
        subSet(arr, list, i+1);
        
        // return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        // int n=arr.length;

        // int ans[] = null;
        
        // ArrayList<Integer>ans=new ArrayList<>();

        
        subSet(arr, new ArrayList<>(), 0);
        // double p=Math.pow(2, n);
        // for(int i=0;i<p;i++){

        // }

    }
}
