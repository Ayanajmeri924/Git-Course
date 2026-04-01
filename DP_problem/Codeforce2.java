import java.util.Scanner;

public class Codeforce2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String []words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=in.nextLine();
            
        }

        for(int i=0;i<words.length;i++){
            // System.out.println(words[i]);
            String temp=words[i];
            if(temp.length()>10){
                // System.out.println(s.charAt(0)+""+(temp.length()-2)+""+s.charAt(temp.length()-1));
                words[i]=temp.charAt(0)+""+(temp.length()-2)+""+temp.charAt(temp.length()-1);
            }
        }
        for (String string : words) {
            System.out.println(string);
        }
        
    }
}
