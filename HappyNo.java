import java.util.HashSet;
import java.util.Set;

public class HappyNo {
    static boolean checker(int n){
        Set<Integer>seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=modul(n);
        }
        return n==1;
    }

    private static int modul(int n){

        int sum=0;
        while(n>0){
            int div=n%10;
            sum=sum+(div*div);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=82;
        System.out.println(checker(n));
       

    }
}
