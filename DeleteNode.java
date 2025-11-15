class Node{
    Node next;
    int i;
    Node(){

    }
    Node(int i){
        this.i=i;
    }
    Node(int i,Node n){
        this.i=i;
        next=n;
    }
}


public class DeleteNode {

    static void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.i+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
    
    static Node remove(Node head,int j){
        if(head==null)return null;

        if(head.i==j){
            head=head.next;

        }else{
            Node curr=head.next;
            Node prev=head;
            while(curr!=null){
                if(curr.i==j){
                    prev.next=curr.next;
                    break;
                }else{
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;

    }


    public static void main(String[] args) {
        Node n1=new Node(10,null);
        Node n2=new Node(20,n1);
        Node n3=new Node(30,n2);
        Node n4=new Node(40,n3);
        Node n5=new Node(50,n4);
        Node n6=new Node(40,n5);
        Node n7=new Node(50,n6);

        Node head=n7;

        System.out.println("Initial Node : ");
        printList(head);

        //remove Node bby value : 
        head=remove(head, 50);
        printList(head);


        // after deleting first node
        // System.out.println("Front Deleted : ");
        // head=head.next;
        // printList(head);

        // //Deleting Rear end node
        // System.out.println("Delteing Rear end Node : ");
        // n2.next=null;
        // printList(head);

        // //Deleting inbetween node eg n2 i.e value = 30
        // System.out.println("Deleting inbetween Node : ");
        // n4.next=n2;
        // printList(head);

        


    }

}
