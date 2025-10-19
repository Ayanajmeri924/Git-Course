import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int k=in.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        Map<Integer,Integer>map=new HashMap<>();

        for(int i : arr){
            // int c=0;
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
         // Step 2: Convert map to list and sort by frequency descending
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Pick top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        // Step 4: Print result
        for (int num : result) System.out.print(num + " ");
    


    }
}