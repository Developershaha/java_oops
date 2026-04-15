package DSA.linekedlist;


class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class LinkedList{
    private Node head;
    private int size;    // write a logic to add at last
    public LinkedList(){
        this.head=null;
        size=0;
    }
    public void addLast(int val){
        Node newNode=new Node(val);
        if(this.head==null){
            this.head=newNode;
            size++;
            return;
        }
        Node current=this.head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        size++;

    }

    //find middle of the node

    public Node middleOfNode(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        Node middle = list.middleOfNode();
        System.out.println("Middle node value: " + middle.val);
    }

}
