import java.util.HashMap;
import java.util.Map;

public class LeetG {

    public static void main(String[] args) {
        
        Map<Integer,Integer>map=new HashMap<>();

        int lo=11,hi=15;

        for(int i=lo;i<=hi;i++){
            int val=0;
            int num=i;
            while(num!=1){
                if(num%2==0){
                    num=num/2;
                }else{
                    num=3*num+1;
                }
                val++;
            }
            map.put(i, val);
        }
        System.out.println(map);

        map.entrySet().stream().sorted((a,b)->a.getValue()-b.getValue()).forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
        // System.out.println(map);
        // System.out.println(map.entrySet().stream().sorted((a,b)->a.getValue()-b.getValue()).toList().get(2).getKey());

        // System.out.println(map.get(2).getKey());


        // System.out.println(map.getOrDefault(map, null));
    }
}