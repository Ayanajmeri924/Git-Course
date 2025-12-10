import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ontest479 {
    public static int rev(int n){
        int sum=0;
        while(n>0){

            int ld=n%10;
            sum=sum*10 +ld;
            n=n/10;
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0, 1, and negatives are not prime
        if (num == 2) return true;  // 2 is prime
        if (num % 2 == 0) return false; // Even numbers > 2 are not prime

        // Check divisors up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={8,5,3,6};

        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=Integer.parseInt(Integer.toBinaryString(nums[i]));
            System.out.println(a);
            arr[i]=rev(a);

        }
        // int arr2[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            String a=String.valueOf(arr[i]);
            arr[i]=Integer.parseInt(a,2);
        }
        Arrays.sort(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
        String a="111";
        System.out.println(Integer.parseInt(a,2));

        int c=0,n=20;
         for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("prime");
        }else{
            System.out.println("nah");
        }
        int ad=0;

        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
                int p=ad;
                if(ad<n){
                    
                    ad=ad+i;

                }else{
                    ad=ad-p;
                    break;
                }
                // System.out.print(i + " ");
                // break;
            }
        }
        System.out.println(ad);
        
    }
}
