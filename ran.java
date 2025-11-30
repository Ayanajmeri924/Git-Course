import java.util.Random;
import java.util.Scanner;

class User{
    private String name;
    private String Userchoice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserChoice() {
        return Userchoice;
    }

    public void setUserChoice(String Userchoice) {
        this.Userchoice = Userchoice;
    }

    public void decision(String c){
        Random random=new Random();
        String []choice={"head","tail","head","tail"};

        String res=choice[random.nextInt(choice.length)];
        // System.out.println(res);

        if(c.equals(res)){
            System.out.println("You can open instagram ");
        }else{
            System.out.println("You can't open it ");
        }
       
    }



}

public class ran {

    public static void main(String[] args) {
        User user=new User();
        user.setName("Ayan Ajmeri");
        user.setUserChoice("head");
        System.out.println(user.getName()+" "+user.getUserChoice());
        user.decision(user.getUserChoice());
        int nums[]={1,2};
        System.out.println(nums.length);

    }
}
