public class Prime {

    public static boolean Count(int n){
        if(n==0)return false;
        if(n==1)return false;
        
        int c=0;
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
                c=c+1;
            }
            
            
        }
        if(c<=2){
            // System.out.println("Prime");
            return true;
        }else{
            // System.out.println("Not Prime");
            return false;

        }

    }
    public static void main(String[] args) {
        int n=10;
        int c=0;
        for(int i=0;i<n;i++){
            if(Count(i)){
                c++;
            }
        }
        System.out.println(c);
        
        
    }
}
