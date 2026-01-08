package QuizProject;

public class RevString {
    public static void main(String[] args) {
        // int k=3;
        // String rev="";
        // for(int i=k-1;i>=0;i--){
            //     rev+=s.charAt(i);
            // }
            // System.out.println(rev);
            // for(int i=k;i<s.length();i++){
                //     rev+=s.charAt(i);
                // }
                // System.out.println(rev);
                
                
        String s="1";
        int index=0;
        for(int i=s.length()-1;i>=0;i--){
            int a=Character.getNumericValue(s.charAt(i));
            if(a%2==0){
                index=i;
                break;
            }
        }
        String ad="";
        for(int i=0;i<=index;i++){
            ad+=s.charAt(i);
        }
        System.out.println(ad);

        int num=Integer.parseInt(ad);
        if(num%2==0){
            System.out.println(ad);
        }else{
            System.out.println("empty");
        }
        
        int nums[]={1,2,3,4,5};
        for(int i=1;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        int as=27;
        System.out.println();
        int aa=Math.abs((int)Math.sqrt(as));
        System.out.println("\n"+aa);
    

        

        // char[] arr = s.toCharArray();
        // for(int i=0;i<k/2;i++){
        //     char temp=s.charAt(i);
        //     arr[i]=s.charAt(k);
        //     arr[k]=temp;
            
        // }
        // for (char c : arr) {
        //     System.out.print(c);
        // }
    }
}
