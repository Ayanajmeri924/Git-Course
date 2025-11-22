class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                System.out.println("ayan");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
public class MaxGap {
    public static void main(String[] args) throws InterruptedException {

        A a=new A();
        Thread t=new Thread(a);
        t.start();
        for(int i=1;i<=10;i++){
            System.out.println("ajmeri");
            Thread.sleep(1000);
        }


        // int nums[]={3,6,9,1};
        // int max=0;
        // System.out.println(nums[nums.length-1]);
        // System.out.println(Math.abs(2-5));

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i-1]<nums[i]){
        //         max=Integer.max(max,nums[i]-nums[i-1]);
        //     }
        // }
        // System.out.println(max);
    }
}
