public class GCD {

    public static int gcd(int a,int b){
        if(b>a){
            gcd(b,a);//swap value
        }
        if(b==0){
            return a;
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
    public static void main(String[] args) {
        int n=4;
        int sumOdd=0,sumEven=0;

        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sumEven +=i;
            }else{
                sumOdd +=i;
            }

        }
        System.out.println(gcd(sumEven,sumOdd));
    }
}
