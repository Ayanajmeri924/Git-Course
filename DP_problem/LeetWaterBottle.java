public class LeetWaterBottle {
    public static void main(String[] args) {
        int n=15,b=4;

        int total=n;
        while(n>=b){
            int left=n%b;
            int drink=n/b;
            total+=drink;
            n=n/b + left;
        }
        System.out.println(total);
    }
}
