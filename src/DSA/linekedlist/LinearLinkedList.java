package DSA.linekedlist;


// create node for linkedlist oky
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head; // this is starting point of linked list
    int size;
    // Constructor
    MyLinkedList() {
        head = null;
        size = 0;
    }

    // add at head functionality
    public void addAtHead(int data) {
        Node newNode = new Node(data); // created node
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add at tail

    // Add at Tail
    public void addAtTail(int data) {

        Node newNode = new Node(data);

        // Corner case: Linked List is empty
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node current = head;

        // Move to last node
        while (current.next != null) {
            current = current.next;
        }

        // Add new node at tail
        current.next = newNode;

        // Increase size
        size++;
    }

    // Insert at Index
    public void insertAtIndex(int index, int data) {

        // Invalid index
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }

        // Insert at beginning
        if (index == 0) {
            addAtHead(data);
            return;
        }

        // Insert at end
        if (index == size) {
            addAtTail(data);
            return;
        }

        Node newNode = new Node(data);

        Node current = head;

        // Move to node BEFORE the index
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Connect new node
        newNode.next = current.next;

        // Connect previous node to new node
        current.next = newNode;

        size++;
    }
    // print linked list oky
    public void printList() {
        // check for empty list
        if (head == null) {
            System.out.println("Linked list is empty ");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    // check is empty list
    public boolean isEmpty() {
        return this.size == 0;
    }

    // get size
    public int getSize() {
        return this.size;
    }
}

public class LinearLinkedList {


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);

        list.printList();

        System.out.println("Size: " + list.getSize());


        // Insert 25 at index 2
        list.insertAtIndex(2, 25);

        list.printList();

        System.out.println("Size: " + list.getSize());


        // Insert at beginning
        list.insertAtIndex(0, 5);

        list.printList();

        System.out.println("Size: " + list.getSize());


        // Insert at end
        list.insertAtIndex(list.getSize(), 50);

        list.printList();

        System.out.println("Size: " + list.getSize());


        // Invalid index
        list.insertAtIndex(100, 500);


    }

}
