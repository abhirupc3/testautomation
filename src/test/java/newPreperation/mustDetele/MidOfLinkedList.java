package newPreperation.mustDetele;

public class MidOfLinkedList {
	class Node {
		public Node next;
		public Object data;

		public Node(Object data) {
			this.data = data;
		}

	}
	static int size=0;
	Node head = null;
	Node tail = null;

	public void add(Object data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			tail = head;
			size++;
			return;
		} else {
			tail.next = temp;
			tail = tail.next;
			size++;
		}
	}

	public static void main(String[] args) {
		MidOfLinkedList mid = new MidOfLinkedList();
		mid.add(12);
		mid.add(13);
		mid.add(14);
		mid.add(15);
		mid.add(16);
		mid.add(17);
		mid.add(18);
		mid.add(19);
		mid.add(20);
		mid.add(21);
		findMid(mid.head);
	}

	private static void findMid(Node head) {
		Node p = head;
		Node q = head;
		while (q != null && q.next != null) {
			p = p.next;
			q = q.next.next;
		}
		System.out.println("value of mid element is:");
		if (size % 2 == 0) {
			System.out.println(p.data);
			System.out.println(p.next.data);
		} else {
			System.out.println(p.data);
		}
	}
}
