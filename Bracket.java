import java.util.HashSet;

public class Bracket {
    public static void main(String[] args) {
        String brac="{}";

        HashSet<String>set=new HashSet<>();

        for(int i=0;i<brac.length();i++){
            if(brac.charAt(i)=='{'){
                boolean j=true;
                int k=0;
                while(j){

                    if(brac.charAt(k)=='}'){
                        j=false;
                        System.out.println("yes");
                    }
                }
            }
        }
    }
}
