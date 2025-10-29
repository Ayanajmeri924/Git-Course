import java.util.ArrayList;
import java.util.List;

public class numOfMatches {
    public static void main(String[] args) {
        int n=19;

        List<Integer>ls=new ArrayList<>();// and this apporach can takes 1ms to run
        int matches=0;
        int adv=0;
        
        while(n>1){
            if(n%2==0){
                matches=n/2;
                ls.add(matches);
                adv+=matches;
                n=n/2;
                
            }else{
                matches=(n-1)/2;
               ls.add(matches);
                adv+=matches;

               n=n/2 +1;
            }
            
        }
        System.out.println(adv);

        int count=0;
        for(int list:ls){
            count+=list;
        }
        System.out.println(count);
    }
}
