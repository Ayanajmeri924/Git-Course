public class Contest477 {
    public static void main(String[] args) {
        int n=65463628;
        long sum = 0;
        String s = String.valueOf(n);
        StringBuilder store = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0') {
                store.append(c);
                sum += c - '0';
            }
        }
        // if(store.length()==0)return 0;
        long finalNum = Long.parseLong(store.toString());
        long mul = finalNum * sum;

        // int sum=0;
        // String store="";
        // String s=String.valueOf(n);

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!='0'){
        //         store +=s.charAt(i);
        //     }
        // }

        // int x=Integer.parseInt(store);
        // while(x>0){
        //     int ld=x%10;
        //     sum +=ld;
        //     x /=10;
        // }

        // long mul=Integer.parseInt(store) * sum;
        // System.out.println(mul);
       

       
    }
}
