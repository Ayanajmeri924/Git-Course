import java.util.Scanner;

public class CodeForce7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int k=in.nextInt();
       

       int arr[]=new int[n];
       int round=0;
       for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            
       }

       for(int i=0;i<n;i++){
        if(arr[k-1]<=arr[i] && arr[i]>0){
                round++;
            }else{
                break;
            
            }
       }
       System.out.println(round);
       in.close();
    }
}
