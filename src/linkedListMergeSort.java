public class linkedListMergeSort {
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

    public static ListNode getMiddle(ListNode a){
        if (a == null)
            return (a);
        ListNode slow = a, fast = a;
        while (fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return (slow);
    }

    public static ListNode sortedMerge(ListNode a, ListNode b){
        ListNode res = null;
        if (a == null)
            return (b);
        if (b == null)
            return (a);
        if (a.val <= b.val){
            res = a;
            res.next = sortedMerge(a.next, b);
        } else {
            res = b;
            res.next = sortedMerge(a, b.next);
        }
        return (res);
    }

    public static ListNode mergeSort(ListNode head){
        if (head == null || head.next == null)
            return (head);
        ListNode middle = getMiddle(head);
        ListNode nextofmiddle = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextofmiddle);
        ListNode sorted = sortedMerge(left, right);
        return (sorted);
    }

    public static void main (String[] args){
        ListNode a = new ListNode();
        a = newNode(2);
        addBack(a,1);
        addBack(a,6);
        addBack(a,0);
        addBack(a,-2);
        addBack(a,4);
        ListNode res = mergeSort(a);
        printList(res);
    }

}
