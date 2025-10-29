public class RemoveDemicalZero {
   public static void main(String[] args) {
        long n=0;

        String s=String.valueOf(n);

        StringBuilder add=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                add.append(s.charAt(i));
            }
        }
        System.out.println(add);
        // String c=add.toString();
        if(add.length()==0){
            System.out.println("0");
        }else{
            long x=Long.parseLong(add.toString());
            System.out.println(x);
        }
        // System.out.println(x);

   }

}
