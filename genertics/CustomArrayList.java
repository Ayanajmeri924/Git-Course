package genertics;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class CustomArrayList {

    private int size=0;
    private int data[];
    private int Default_SIze=10;

    CustomArrayList(){
        this.data=new int[Default_SIze];
    }
    public void add(int list){
        if(isfull()){
            resize();
        }
        data[size++]=list;
    }

    private boolean isfull() {
        return data.length==size;
       
    }

    private void resize() {
       int temp[]=new int[size*2];
       for(int i=0;i<data.length;i++){
        temp[i]=data[i];
       }
       data=temp;
        
    }
    public int remove(){
        if(size==0){
            throw new RuntimeErrorException(null, "List is empty");
        }else{
            int send=data[size-1];
            size--;
            return send;
        }
        // return 
    }
    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
    }
    @Override
    public String toString() {
       
        return "Customarray { "+"data: "+ Arrays.toString(data) +" , Size = "+size+" }";
    }

    public static void main(String[] args) {
        CustomArrayList arr=new CustomArrayList();
        for(int i=0;i<5;i++){
            arr.add(1*i);

        }
        arr.add(10);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("\nremoved element : "+arr.remove());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("\nSize = "+arr.size());
        System.out.println(arr);
    }
}
