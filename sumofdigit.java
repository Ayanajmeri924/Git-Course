public class sumofdigit {
    static int sum=0;
    public static void add(int n){
        if(n==0){
            return;
        }
        int mod=n%10;
        sum=mod+sum;
        add(n/10);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        add(n);
        System.out.println(sum);
    }
}


// class sumofdigit{
//     static int sum=0;
//     public static void sum1(int n){
//         if(n==0){
//             return;
//         }
        
//         // sum=0;
//         int mod=n%10;
//         sum=sum+mod;
//         sum1(n/10);
        
//     }
//     public static void main(String[] args) {
//         int n=0;
//         sum1(n);
//         System.out.println(sum);

//     }
// }