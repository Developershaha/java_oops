package DSA.array;

import java.util.ArrayList;
import java.util.List;

class ListNode{
     int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;

    }
}
class MyLinkedList{
    ListNode head;
    int size;
//    MyLinekList(){
//
//    }

    public void addLast(int val){
        ListNode newNode=new ListNode(val);
        if(this.head==null){
            head=newNode;
            return;
        }
        ListNode curr=this.head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    public  void printList(){
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public ArrayList<Integer> toArray(){
ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=this.head;
        while (curr!=null){
            arr.add(curr.val);
            curr=curr.next;

        }
        return  arr;
    }
}
public class ConvertLinkedListToArray {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
// time complexity is O(n) and space is O(1)
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        System.out.println(list.toArray());

    }
}
