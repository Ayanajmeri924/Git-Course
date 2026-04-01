import java.util.Scanner;

public class Codeforces4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int question=0;
        while (n-->0) {
            int c=0;
            int f1=in.nextInt();
            int f2=in.nextInt();
            int f3=in.nextInt();

            if(f1==1){
                c++;
            }
            if(f2==1){
                c++;
            }
            if(f3==1){
                c++;
            }

            if(c>=2){
                question++;
            }

        }
        System.out.println(question);
        in.close();
    }
}
