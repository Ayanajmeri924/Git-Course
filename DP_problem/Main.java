import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Scanner in=new Scanner(System.in);
    //    int m=in.nextInt();
    //    int n=in.nextInt();

    //    int res=(m*n)/2;
    //    System.out.println(res);
    //    System.out.println((m*n)/2);

    // int n=in.nextInt();
    //     in.nextLine();
    // int x=0;
    // while(n-->0){
    //     String op=in.nextLine();
    //     if(op.contains("++")){
    //         x++;
    //         // System.out.println("Adding "+x);
    //     }else{
    //         x--;
    //         // System.out.println("Sub "+x);

    //     }

    // }
    // System.out.println(x);

    // String arr[]=new String[3];
    // for(int i=0;i<3;i++){
    //     String s=in.nextLine();
    //     arr[i]=s;
    // }

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            int c=in.nextInt();
            // int arr[]=new int[c];
            Map<Integer,String>map=new HashMap<>();

            for(int j=0;j<c;j++){
                // arr[i]=in.nextInt();
                int val=in.nextInt();
                if(j%2==0){

                    map.put(val, "Red");
                }else{
                    map.put(val, "blue");
                }


                // map.put(map.get(in.nextInt()), )

            }
            //  List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        // Sort list by values (ascending)
            // System.out.println(map);

            // entryList.sort(Map.Entry.comparingByKey());
            // System.out.println(map);
            
            // for(int k=0;k<map.size()-1;k++){
            //     // String s=(String)map.containsValue(k);
                
            // }
            
            
            // for(int j=0;j<map.size();j++){
            //     System.);
            // }

        }
        
        //    Stream<Map>s=s.sorted();//asvia_sohana_124


    }
    
}
