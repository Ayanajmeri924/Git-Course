import java.lang.reflect.Array;

public class twosum11 {

    public static int[] twoSum(int[] arr, int tar) {
        int l=0,r=arr.length-1;
        // System.out.println(arr[r]);
        int indexi=0,indexj=0;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==tar){
                return new int[] {l+1,r+1};
            }
            if(sum<tar){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,11};
        int tar=9;
        
        int arr1[]=twoSum(arr,tar);
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        
        // int l=0,r=arr.length-1;
        // // System.out.println(arr[r]);
        // int indexi=0,indexj=0;
        // while(l<r)
        // {
        //     int sum=arr[l]+arr[r];
        //     if(sum==tar){
        //         indexi=l;
        //         indexj=r;
        //         break;
        //     }
        //     if(sum<tar){
        //         l++;
        //     }else{
        //         r--;
        //     }
        // }
        // System.out.println(l+" "+r);
        // System.out.println(indexi+" "+indexj );
    }
}
