public class MovesZero{

    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3};

        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                //swap with k
                int temp=arr[i]; 
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}