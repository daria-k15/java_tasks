import java.util.*;
public class mergeTwoSortedList {
   public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
        int[] arr1 = new int[] {1, 3, 5, 6};
        int[] arr2 = new int[] {2, 4, 6, 20, 34};
        ListNode list_head1 = LinkedList.create_linked_list(arr1);
        System.out.print("Original1: ");
        LinkedList.display(list_head1);

        LinkedListNode list_head2 = LinkedList.create_linked_list(arr2);
        System.out.print("Original2: ");
        LinkedList.display(list_head2);

        System.out.println("\nMerged:");

        LinkedListNode newHead = merge_sorted(list_head1, list_head2);
        LinkedList.display(newHead);
    }
}

