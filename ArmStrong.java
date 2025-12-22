public class ArmStrong {
    public static void main(String[] args) {
        for(int i=0;i<=999;i++){
            int n=i;
            int sum=0;
            while(n>0){
                int r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
            if(sum==i){
                System.out.println("ArmStrong "+i);
            }
        }
    }
}
