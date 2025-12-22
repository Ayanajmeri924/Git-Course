public class LeetCode3775 {
    public static void main(String[] args) {
        String s="ayan ajmeri";
        char space=' ';
        System.out.println(s.length());
        int c=0;
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    c=c+1;
                }

                index++;
            }else{
                break;
            }
        }
        System.out.println(c);
        int x=0;
        for(int i=index+1;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    x++;
                }
            }else{
                if(c==x){
                    
                }
            }
        }
        // for(int )
    }
}
