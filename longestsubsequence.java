public class longestsubsequence {
    public static void main(String[] args) {
        String str="abcdeabbcabcddefc";
        int c=0;
        int max=0;
        StringBuilder store=new StringBuilder();
        for(int i=1;i<str.length();i++){

            if(str.charAt(i-1)!=str.charAt(i)){
                if (store.indexOf(String.valueOf(str.charAt(i))) == -1){
                    store=store.append(str.charAt(i));
                    c++;
                    max=Math.max(max, c);
                }else{
                    store.setLength(0);
                }
            }else{
                c=0;
                

            } 
        }
        System.out.println(c+" "+max);
    }
}
