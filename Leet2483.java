public class Leet2483 {
    public static void main(String[] args) {
        String a="ayan";
        System.out.println(a.charAt(1)+" "+a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(0)==(a.charAt(1)));
        System.out.println(isSubsequence("ahebscsd","abcd"));
    }

  
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0,c=0;
        // int len=s.length();
        while(i<s.length() && j<t.length()){
            if((s.charAt(i))==(t.charAt(j))){
                i++;
                j++;
                c++;
            }else{
                
                i++;
            }
        }
        System.out.println(c+" "+s.length());
        if(c==t.length()){
            return true;
        }else{
            return false;
        }
    }
}

