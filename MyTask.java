// import java.util.TreeMap;

class MyThread extends Thread{
    public void run(){
        System.out.println("My thread is runnig ...");
    }
}
class  F1{
    void f1(){
        System.out.println("F1 ka f1 hu");
    }
}
class  F2 extends F1{
    void f1(){
        super();
        System.out.println("F2 ka f1 hu");
    }
}
public class MyTask {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.run();
        F2 f =new F2();
        f.f1();

    }
}
