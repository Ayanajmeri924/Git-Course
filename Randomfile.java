import java.util.Random;

public class Randomfile {
    public static void main(String[] args) {
        Random random=new Random();
        boolean choice=random.nextBoolean();
        System.out.println(choice);
    }

}
