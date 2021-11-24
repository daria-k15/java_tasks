import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

public class addTwonumbers {
	static class ListNode {
		int val;
		ListNode next;
		ListNode() {}

		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	static ListNode newNode(int val) {
		ListNode node = new ListNode();
		node.val = val;
		node.next = null;
		return (node);
	}

	public static void addBack(ListNode a, int data) {
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

	public static void printList(ListNode a) {
		while (a != null) {
			System.out.printf("%d ", a.val);
			a = a.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode();
		ListNode tmp = res;
		int reminder = 0;

		while (l1 != null || l2 != null){
			int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
			int sum = val1 + val2 + reminder;
			tmp.next = new ListNode(sum % 10);
			reminder = sum / 10;
			tmp = tmp.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (reminder > 0)
			tmp.next = new ListNode(reminder);
		return (res.next);
	}


	public static void main(String[] args) {
		ListNode l1 = newNode(9);
		addBack(l1, 9);
		addBack(l1, 9);
		addBack(l1, 9);
		addBack(l1, 9);
		addBack(l1, 9);
		ListNode l2 = newNode(9);
		addBack(l2, 9);
		addBack(l2, 9);
		addBack(l2, 9);

//		addBack(l2, 4);
		ListNode res = addTwoNumbers(l1, l2);
		printList(res);
	}
}
