import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisapperaArray {
    public static void main(String[] args) {
        int nums[]={4,1,8,7,2,2,3,3};
         List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        // Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set.size());
        
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                list.add(i+1);
            }
        }
        System.out.println(list.size());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
