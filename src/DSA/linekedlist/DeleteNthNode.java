package DSA.linekedlist;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode2 removeNthFromEnd(ListNode2 head, int n) {

        // Step 1: sentinel node
        ListNode2 sentinel = new ListNode2(0);
        sentinel.next = head;

        // Step 2: move first pointer n steps
        ListNode2 first = sentinel;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        // Step 3: move both pointers
        ListNode2 second = sentinel;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        // Step 4: delete node
        second.next = second.next.next;

        return sentinel.next;
    }
    // ✅ Add Node at End
    public ListNode2 addAtEnd(ListNode2 head, int val) {
        ListNode2 newNode = new ListNode2(val);

        // if list is empty
        if (head == null) {
            return newNode;
        }

        ListNode2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }
}

public class DeleteNthNode {
    public static void main(String[] args) {

//        ListNode2 head = new ListNode2(1,
//                new ListNode2(2,
//                        new ListNode2(3,
//                                new ListNode2(4,
//                                        new ListNode2(5)))));

//        Solution sol = new Solution();
        Solution sol = new Solution();
        ListNode2 head = null; // start with empty list

        // build list using addAtEnd
        head = sol.addAtEnd(head, 1);
        head = sol.addAtEnd(head, 2);
        head = sol.addAtEnd(head, 3);
        head = sol.addAtEnd(head, 4);
        head = sol.addAtEnd(head, 5);

        printList(head);
        head = sol.removeNthFromEnd(head, 2);

        printList(head);
    }

    public static void printList(ListNode2 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}