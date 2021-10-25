public class middleOfTheLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;};
        ListNode(int val, ListNode next){this.val = val;this.next = next;}
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
        ListNode tmp;
        tmp = head;
        int i = 1;
        while (tmp.next != null){
            tmp = tmp.next;
            i++;
        }
        return (i);
    }

    public static ListNode middleNode(ListNode head){
        ListNode tmp;
        tmp = head;
        int mid;
        int len = findLen(head);
        int start = 1;
        int end = 1;
        if (len % 2 == 0)
            mid = start + (len - start) / 2 + 1;
        else
            mid = start + (len - start) / 2;
        while (end != mid){
            head = head.next;
            end++;
        }
        return (head);
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode();
        l1 = newNode(65);
        addBack(l1, 66);
        addBack(l1, 26);
        addBack(l1, 77);
        addBack(l1, 96);
        addBack(l1, 86);
        addBack(l1, 11);
        addBack(l1, 21);
        addBack(l1, 13);
        addBack(l1, 80);
        ListNode res = middleNode(l1);
        printList(res);
    }
}
