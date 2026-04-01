import java.util.Scanner;

public class CodeForce6 {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        int X=0;
        while (n-->0) {
            String s=in.nextLine();
            if(s.contains("++")){
                X++;
            }else{
                --X;
            }
            
        }
        System.out.println(X);
        in.close();
    }
}
