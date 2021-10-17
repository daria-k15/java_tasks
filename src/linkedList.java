public class linkedList {
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
    public static void main(String[] args){
        ListNode l1 = new ListNode();
        l1 = newNode(1);
        addBack(l1, 2);
        addBack(l1, 3);
        printList(l1);
    }

}
