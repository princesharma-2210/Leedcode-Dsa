public class reverse{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    Node head= null;
    public void add(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=newNode;

    }
    public void reverse(){
        Node nex=null;
        Node prev= null;
        Node curr= head;
        while(curr!= null){
            nex= curr;
            nex.next= prev;
            prev= nex;
            curr= curr.next;

        }
        head= next;
        System.out.println(head.data);

    }

    public static void main(String[] args){
        reverse ll= new reverse();
        ll.add(2);
        ll.add(3);
        ll.reverse();
    }
}