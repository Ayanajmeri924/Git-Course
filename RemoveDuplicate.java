import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={21,22,22,45,56,56,80};

        Set<Integer>set=new HashSet<>();
        int j=0;
        for(int i=1;i<arr.length;i++){
            set.add(arr[i]);
            if(arr[i]!=arr[j]){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i=0;i<j;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // for (int i : set) {
        //     System.out.print(i+" ");
        // }
    }
}
