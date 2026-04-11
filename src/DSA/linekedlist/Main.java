package DSA.linekedlist;


class MyLinkedList {
    // i have create first class oky - now i want to design linkedlist oky

    // have functionality crate node add at tail add at head and insert at specific index oky

    // node class (Building class )
    static class Node {
        // i have crate  static class and inner static class because no need to create object and this class only application within the linkedlist
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    // 2. LinkedList properties
    private Node head; // first node
    private int size;  // track number of elements

    // 3. Constructor
    public MyLinkedList() {
        head = null;
        size = 0;
    }


    // 1. add at head beginning of the linked list
    public void addAtHead(int data) {
        Node newNode = new Node(data); // crete node
        newNode.next = this.head;
        this.head = newNode;
        this.size++;

    }

    // 2 add at tail means end of the linked list
    public void addAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.size++;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        this.size++;
    }

    // add at index
    public void addAtIndex(int index, int data) {

        if (index < 0 || index > size) {
            System.out.println("please enter valid index ");
            return;
        } else if (index == 0) {
            addAtHead(data);
        } else if (index == this.size) {
            addAtTail(data);
        } else {
            Node newNode = new Node(data);
            Node current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            this.size++;

        }
    }

//   // 7. Print LinkedList
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // get element at the index
    public int getElement(int index){
        if(index<0 || index > this.size){
            System.out.println("enter valid index");
            return -1;
        }else{
            Node current=this.head;
            for(int i=0;i<index;i++){
                current=current.next;

            }
            return current.data;

        }


    }

    public void deleteAtIndex(int index){
       // 1 check at index 0
       if(index <0 || index>=this.size){
           System.out.println("please enter valid index");
           return;
       }
       else if(this.head==null){
           System.out.println("list is empty ");

       }
       else if(index==0){
           this.head=this.head.next;
           this.size--;
           return;
       }
       else{
           Node curr=this.head;
           for(int i=0;i<index-1;i++){
               curr=curr.next;
           }
           curr.next=curr.next.next;
           this.size--;
       }
    }
    public int getSize() {
        return this.size;
    }

}

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(10);
        myLinkedList.addAtHead(30);
        myLinkedList.addAtHead(40);
        myLinkedList.addAtTail(11);
        myLinkedList.addAtIndex(2, 20);

//        myLinkedList.printList();
//        System.out.println(myLinkedList.getSize());

       int elementAtIndex= myLinkedList.getElement(3);
        System.out.println(elementAtIndex);
    }

}

