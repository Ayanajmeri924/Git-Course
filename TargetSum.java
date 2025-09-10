public class TargetSum {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int sum=1;
        int l=0,r=arr.length-1;
        int c=0, sus=0;

        while(l<r){
            sus=arr[l]+arr[r];
            
            c++;
            if(sus==sum){
                sus=1;
                break;
            }else if(sus>sum){
                r--;
            }else{
                l++;
            }
        }
        if(sus==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println(c);
    }
}