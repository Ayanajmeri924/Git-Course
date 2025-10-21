public class AddDigit {
    public static void main(String[] args) {
        int n=38;

        // String s=Integer.toString(n);
        // System.out.println(s.length());

        int sum=0;

        while(Integer.toString(n).length()!=1){
            sum=0;

            while(n!=0){
                
                int digit=n%10;
                sum +=digit;
                n=n/10;
            }
            // System.out.println(sum);
            n=sum;
        }
        System.out.println(n);
        // System.out.println(sum);
        // while(s.length()!=1){
        //     // break;
        //     // sum=0;
        //     for(int i=0;i<s.length();i++){

        //         sum +=s.charAt(i);
        //         // System.out.println(sum);
        //     }
        //     s=Integer.toString(sum);

        // }
        // System.out.println(s);
    }
}
