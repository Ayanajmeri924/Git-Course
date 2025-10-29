import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public static void singleNumber3(int[] arr){
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        System.out.println("set hai");
        System.out.println(set);
        System.out.println("set end here");

        Iterator<Integer> it =set.iterator();
        int i=0;
        int num[]=new int[2];

        while(it.hasNext()){
            // num[i]=it.next();
            System.out.println(it.next());
        }
        for (int j : num) {
            System.out.print(j+" ");
        }

    }

    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        int arr[]={1,3,2,3,4,4};
        singleNumber3(arr);

        // for(int i=0;i<arr.length;i++){
        //     if(set.contains(arr[i])){
        //         set.remove(arr[i]);

        //     }else{
        //         set.add(arr[i]);
        //     }
        // }
        // Iterator<Integer> iterator = set.iterator();

        // System.out.println(iterator.hasNext());
        // System.out.println(iterator.next());

        // System.out.println("abwdk");

        // int num[]={1,2,3,1,5,2,3,1,2,3,4,4,4};

        // int ele=num[0];
        // for(int i=1;i<num.length;i++){
        //     ele=ele^num[i];

        // }
        // System.out.println(ele);
    }
}
