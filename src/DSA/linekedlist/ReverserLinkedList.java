package DSA.linekedlist;

// this is node oky
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList1{
   private ListNode head;
   private int size;
   public MyLinkedList1(){
       this.head=null;
       this.size=0;
   }
   // add at tail

    public void addAtTail(int val){
       ListNode newNode=new ListNode(val);
       if(this.head==null){
           this.head=newNode;
           this.size++;
           return;
       }

       ListNode curr=head;
       while(curr.next!=null){
           curr=curr.next;

       }
        curr.next=newNode;
       this.size++;

    }
    public void printNormal(){
       ListNode curr=this.head;
       while (curr!=null){
           System.out.print("values "+curr.val +" --> ") ;
           curr=curr.next;
       }
        System.out.println(curr); // this point at the next
    }

    public void revers(){
       if(this.head == null || this.head.next==null ) return ;
       ListNode previous= null;
       ListNode current=this.head;
       while(current!=null){
           ListNode temp=current.next;
           current.next=previous;
           previous=current;
           current=temp;
       }
       this.head=previous;

    }


}

public class ReverserLinkedList {
    public static void main(String[] args) {
        MyLinkedList1 list = new MyLinkedList1();

        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtTail(4);
        list.printNormal();
        list.revers();
        list.printNormal();
        //        System.out.println("null");

//        System.out.println("Size: " + list.getSize());
    }
}
