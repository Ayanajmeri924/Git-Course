public class LeetCode3775chat {
    //count vowels in a word using index range
    static int countVowels(String s, int start, int end) {
        int c = 0;
        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        return c;
    }

    // reverse characters in result array
    static void reverse(char[] res, int start, int end) {
        while (start < end) {
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
    }

    public static String reverseWords(String s) {

        int n = s.length();
        char[] result = s.toCharArray();

        // ---- find first word ----
        int i = 0;
        while (i < n && s.charAt(i) != ' ') i++;
        int firstVowels = countVowels(s, 0, i - 1);

        // ---- process remaining words ----
        int start = i + 1;

        while (start < n) {
            int end = start;

            while (end < n && s.charAt(end) != ' ') end++;

            int v = countVowels(s, start, end - 1);

            if (v == firstVowels) {
                reverse(result, start, end - 1);
            }

            start = end + 1;
        }

        return new String(result);
    }
    public static void main(String[] args) {
        String s="ayan ajmeri is good boy and what you want";
        System.out.println("Original String : \n"+s);
        System.out.println("\nNew String : ");
        System.out.println(reverseWords(s));
    }
}
