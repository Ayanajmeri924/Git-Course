import java.util.HashMap;
import java.util.Map;

public class PlusOne {
    public static void main(String[] args) {
        int []digit={1,2,3,9};
        int arr[];
        StringBuilder aa=new StringBuilder();
        String a="";
        for(int i=0;i<digit.length;i++){
            aa=aa.append(digit[i]);

        }
        System.out.println(aa);
        a=""+ aa;

        int num=Integer.parseInt(a);
        num=num+1;
        if(num%10==0){
            arr=new int[digit.length+1];
        }else{
            arr=new int[digit.length];
        }
        if(arr.length==digit.length){
            digit[digit.length-1]=digit[digit.length-1]+1;
        }
        
        for(int i=0;i<digit.length;i++){
            System.out.print(digit[i]+" ");
        }
        System.out.println(a);


        HashMap<Integer,Integer>map=new HashMap<>();
        int nums[]={1,2,3,4,4,4,5,6,2};

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        if(map.containsKey(4)){
            System.out.println("hehe");
        }
    }
}
