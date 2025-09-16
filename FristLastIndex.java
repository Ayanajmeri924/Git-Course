public class FristLastIndex {

    public static int lastoccurance(int arr[],int tar){
        int l=0,r=arr.length-1,last=-1;
        while(l<=r){
            int mid=(l+r)/2;
            
            if(arr[mid]==tar){
                last=mid;
                l=mid+1;
                
                
            }else if(arr[mid]>tar){
                r=mid-1;
            }else{
                l=mid+1;
                
            }  
        }
        return last;
    }
    public static int fristoccurance(int arr[],int tar){
        int l=0,r=arr.length-1,frist=-1;
        while(l<=r){
            int mid=(l+r)/2;
            
            if(arr[mid]==tar){
                frist=mid;
                r=mid-1;
                
                
            }else if(arr[mid]>tar){
                r=mid-1;
            }else{
                l=mid+1;
                
            }  
        }
        return frist;
    }
    public static void main(String[] args) {
        int arr[]={8,8,8,8, 8, 8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        // int arr[]={1,2,3,4,5,6,67};
        int tar=9;
        
        
        System.out.println(fristoccurance(arr,tar)+" "+lastoccurance(arr,tar));
    }
}
