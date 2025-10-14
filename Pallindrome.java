import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        String s=in.nextLine().trim().toLowerCase();
        int c=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                
            }else{
                c=c+1;
                break;
              
            }
        }
        if(c==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        in.close();
    }
}