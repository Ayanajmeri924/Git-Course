import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        String s="paper";
        String t="title";

        Map<Character,Character>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i)) && t.charAt(i)==(map.get(s.charAt(i)))) {
                System.out.println(" Key and value pair exists in the map.");
            }
            map.put(s.charAt(i),t.charAt(i));
            
        }

        System.out.println(map);
    }
}
