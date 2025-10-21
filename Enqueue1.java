import java.util.LinkedList;
import java.util.Queue;

public class Enqueue1  {
    public static void main(String[] args) {
        // Enqueue<Integer>q1=new Enqueue<>();

        Queue<Integer>q=new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
    }
}
