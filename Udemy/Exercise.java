package Udemy;

import java.util.LinkedList;
import java.util.Queue;

// TODO: Create an interface called Machine with one method: String start()


// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface


// TODO: Create a class Fan that:
// - Extends Appliance


// TODO: Create a class WashingMachine that:
// - Extends Appliance

interface Machine {
    String start();
}
abstract class Appliance implements Machine{
    // public String start();
    String name;
    Appliance(String name){
        this.name=name;
    }
}
class Fan extends Appliance{
    Fan(String name) {
        super(name);
    }

    // super();
    @Override
    public String start(){
        return "Fan is running";
    }
}
class WashingMachine extends Appliance{
    WashingMachine(String name) {
        super(name);
  
    }

    @Override
    public String start(){
        return "Washing Machine is operating";
    }
}
public class Exercise {
    public static void main(String[] args) {
       
        Machine fan=new Fan("fan");
        System.out.println(fan.start());

        Queue<Integer>q=new LinkedList<>();

        q.add(12);
        q.add(1);
        q.add(122);
        q.add(124);
        q.add(133);
        System.out.println(q.poll());
        // q.offer(1);
        System.out.println(q);
        System.out.println(q.peek());
    }
}