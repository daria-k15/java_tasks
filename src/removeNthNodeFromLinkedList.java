public class removeNthNodeFromLinkedList {
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

    public static int findLen(ListNode head){
        ListNode tmp = head;
        int i = 1;
        while (tmp.next != null){
            tmp = tmp.next;
            i++;
        }
        return (i);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode tmp = head;
        int len = findLen(head);
        int find = len - n;
        int i = 1;
        if (find == 0){
            head = tmp.next;
            return (head);
        }
        while (tmp.next != null && i < find){
            tmp = tmp.next;
            i++;
        }
        if (tmp == null || tmp.next == null)
            return head;
        ListNode next = tmp.next.next;
        tmp.next = next;
        return head;
    }



    public static void main (String[] args){
        ListNode a = new ListNode();
        a = newNode(1);
//        addBack(a,2);
//        addBack(a,3);
//        addBack(a,4);
//        addBack(a,5);
//        addBack(a,10);
//        addBack(a,0);

        ListNode res = removeNthFromEnd(a, 1);
        printList(res);
    }
}
