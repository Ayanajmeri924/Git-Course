import java.util.ArrayList;
import java.util.List;

public class LeetHard1April {
    public static void main(String[] args) {
        int positions[];
        int healths[];
        positions = new int[]{3,5,2,6};
        healths = new int[]{10,10,15,12};
        String directions = "RLRL";

        //position tranfer to list
        List<Integer>p=new ArrayList<>();
        for(int i=0;i<positions.length;i++){
            p.add(positions[i]);
        }

        //healths tranfer to list
        List<Integer>h=new ArrayList<>();
        for(int i=0;i<healths.length;i++){
            h.add(healths[i]);
        }

        //directions tranfer to list
        List<String>d=new ArrayList<>();
        for(int i=0;i<directions.length();i++){
            d.add(String.valueOf(directions.charAt(i)));
        }

        for(int i=0;i<d.size()-1;i++){
            if(d.get(i).equals(d.get(i+1))){
                //no collision
                continue;
            }else {
                //collision
                if(h.get(i)>h.get(i+1)){
                    h.remove(i+1);
                    d.remove(i+1);
                    h.set(i,h.get(i)-1); 
                }else if(h.get(i)<h.get(i+1)){
                    h.remove(i);
                    d.remove(i);
                    h.set(i+1,h.get(i+1)-1);
                }else{
                    h.remove(i+1);
                    d.remove(i+1);
                    h.remove(i);
                    d.remove(i);
                } 
                
                // int damage=Math.min(h.get(i), h.get(i+1));

                // h.set(i,h.get(i)-damage);
                // h.set(i+1,h.get(i+1)-damage);
            }
        }
        System.out.println(h.size());
        System.out.println(h);
            // for(int i=0;i<d.size();i++){
            //     if(d.get(i).equals("R")){
            //         for(int j=i+1;j<d.size();j++){
            //             if(d.get(j).equals("L")){
            //                 //collision
            //                 int damage=Math.min(h.get(i), h.get(j));
            //                 h.set(i,h.get(i)-damage);
            //                 h.set(j,h.get(j)-damage);
            //             }
            //         }
            //     }
            // }
    }

}
