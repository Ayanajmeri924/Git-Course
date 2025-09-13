public class FindIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int tar=9;
        int index=-1,c=0;
        int l=0,r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(tar==arr[mid]){
                c+=1;
                index=mid;
                break;
            }else if(arr[mid]>tar){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(c==1){
            System.out.println(index);
        }else{
             System.out.println(index);
        }
    }
}
