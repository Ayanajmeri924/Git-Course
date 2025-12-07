public class Leet8 {
    public static void main(String[] args) {
        String s="-0023 word";
        // String s1="";
        StringBuilder s1=new StringBuilder();

        
        for(int i=0;i<s.length();i++){
            // System.out.println(s.length());

            if(i<2){
                if(i==0){

                    System.out.println("ehe");
                    if(s.charAt(0)=='-'){
                        // s+=s.concat("-");
                        s1.append('-');
                        
                    }else if(Character.isDigit(s.charAt(0))){ 
                        s1.append(s.charAt(0));
                    }
                    // else if(s.charAt(0)=='+' || s.charAt(0)=='0'){
                        
                    // }
                }
                if(i==1){
                    System.out.println("2");
                    if((s.charAt(1)!='0') && Character.isDigit(s.charAt(1))){
                        // s+=s.concat("-");
                        s1.append(s.charAt(1));
                        // break;
                        
                    }else{
                        
                        // s1.append("0");
                        // break;
                    }
                    // else if(Character.isDigit('1'))

                    
                }


            }else{
                if(Character.isDigit(s.charAt(i))) {
                s1.append(s.charAt(i));

                }else{
                // s1.append("0");
                    break;
                }
            }
            
           
            
        }
        System.out.println(s1);
    }

}
