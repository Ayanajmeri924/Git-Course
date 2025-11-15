import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinDisContest475 {

    public static void main(String[] args) {
        int nums[]={1,1,2,3,2,1,2};
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDist = Integer.MAX_VALUE;
        boolean found = false;

        for (List<Integer> indices : map.values()) {
            if (indices.size() >= 3) {
                for (int i = 0; i + 2 < indices.size(); i++) {
                    int first = indices.get(i);
                    int third = indices.get(i + 2);
                    int distance = 2 * (third - first); // derived formula
                    minDist = Math.min(minDist, distance);
                    found = true;
                }
            }
        }

        if(found){

        System.out.println(minDist);
        }else {
            System.out.println("-1");
        }

        // int x=0,y=x+1,z=y+1;
        // while(x<z){
        //     if(nums[x]==nums[y] && nums[z]==nums[y]){
        //         System.out.println("Min Distance of indeces= "+x+" "+y+" "+z);
        //         break;
        //     }else if(nums[x]==nums[y] && nums[y]!=nums[z]){
        //         z--;
        //     }else if(nums[x]!=nums[y] && nums[y]==nums[z]){
        //         x++;
        //     }else if(nums[x]==nums[y-1] && nums[y-1]==nums[z-1]){
        //         System.out.println("Min Distance of indeces= "+x+" "+(y-1)+" "+(z-1));

        //         break;
        //     }else{
        //         x++;
        //         y++;
        //         z++;
        //     }
        // }
    }
}