import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mirror {
    public static void main(String[] args) {
        String s="4m7a";

        // Map<Character,Character>freq=new HashMap<>();

        // char ss='a';
        StringBuilder sb=new StringBuilder();
        System.out.println();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                char mirror = (char) ('0' + '9' - ch);
                sb.append(mirror);

               
            }
            else if(ch>='a' && ch<='z'){
                char mirror = (char) ('a' + 'z' - ch);
                sb.append(mirror);
              
            }

        }
         Map<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int result = 0;
        Set<Character> visited = new HashSet<>();

        // Step 2: Process each unique character
        for (char ch : freq.keySet()) {

            if (visited.contains(ch)) continue;

            char mirror;

            // digit case
            if (ch >= '0' && ch <= '9') {
                mirror = (char) ('0' + '9' - ch);
            }
            // letter case
            else {
                mirror = (char) ('a' + 'z' - ch);
            }

            int freqC = freq.getOrDefault(ch, 0);
            int freqM = freq.getOrDefault(mirror, 0);  

            result += Math.abs(freqC - freqM);

            // mark both as visited
            visited.add(ch);
            visited.add(mirror);
        }
        System.out.println(result);
        System.out.println(sb.toString());
    }
}
