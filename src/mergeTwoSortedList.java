import java.util.*;
public class mergeTwoSortedList {
   static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    static ListNode newNode(int val){
        ListNode node = new ListNode();
        node.val = val;
        node.next = null;
        return (node);
    }

    public static void addBack(ListNode a, int data){
        ListNode last;
        ListNode tmp;
        tmp = new ListNode();
        while (a.next != null)
            a = a.next;
        last = a;
        tmp.val = data;
        tmp.next = null;
        last.next = tmp;
    }
    public static void printList(ListNode a){
        while (a != null){
            System.out.printf("%d ", a.val);
            a = a.next;
        }
    }
    public static ListNode merge_sorted(ListNode l1, ListNode l2) {

        // if both lists are empty then merged list is also empty
        // if one of the lists is empty then other is the merged list
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode mergedHead = null;
        if (l1.val <= l2.val) {
            mergedHead = l1;
            l1 = l1.next;
        } else {
            mergedHead = l2;
            l2 = l2.next;
        }
        ListNode mergedTail = mergedHead;
        while (l1 != null && l2 != null) {
            ListNode temp = null;
            if (l1.val <= l2.val) {
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }
            mergedTail.next = temp;
            mergedTail = temp;
        }
        if (l1 != null) {
            mergedTail.next = l1;
        } else if (l2 != null) {
            mergedTail.next = l2;
        }
        return mergedHead;
    }

    public static void main(String[] args) {
       ListNode l1 = new ListNode();
       l1 = newNode(1);
       addBack(l1, 2);
       addBack(l1,3);
       addBack(l1, 4);
       ListNode l2 = new ListNode();
       l2 = newNode(1);
       addBack(l2, 2);
       addBack(l2,5);
       addBack(l2, 6);
       ListNode res = merge_sorted(l1,l2);
       printList(res);

    }
}

