package DP_problem;

import java.util.HashMap;
import java.util.Map;
class Solution{//practice it again contest 484 day : 11 jab 2026 @ get a jon in ***Google***
    public long countPairs(String[] words) {

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            String key = normalize(w);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        long ans = 0;
        for (int cnt : map.values()) {
            ans += (long) cnt * (cnt - 1) / 2;
        }
        return ans;
    }
    
    private String normalize(String s) {
        int shift = s.charAt(0) - 'a';
        StringBuilder sb = new StringBuilder();
    
        for (char c : s.toCharArray()) {
            int val = (c - 'a' - shift + 26) % 26;
            sb.append((char) (val + 'a'));
        }
        return sb.toString();
    }
}
public class Contest484 {
    public static void main(String[] args) {
        Solution s=new Solution();
        String []arr={"fusion","layout","aa","az","ba"};

        long c=s.countPairs(arr);
        System.out.println(c);
    }
    
}
