package newPreperation.jan1st2020;

/**
 * Write a program to find the middle of a linked List: Algorithm - Add to
 * pointer pointing at start of the linked list and increment first with 1 and
 * second with 2 until the second one becomes null, Once second one becomes null
 * then the first one will be the middle.
 * 
 * @author 19094
 *
 */
public class MiddleOfLinkedList {
	class Node {
		Object data;
		public Node nextRef;

		public Node(Object data) {
			this.data = data;
		}

	}

	Node head = null;
	static int size=0;
	Node tail = null;
	static Node previousNode=null;

	public void add(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
		}
		tail.nextRef = newNode;
		tail=tail.nextRef;
		size++;
	}

	public static void main(String[] args) {
		MiddleOfLinkedList lList = new MiddleOfLinkedList();
		lList.add(12);
		lList.add(13);
		lList.add(14);
		lList.add(15);
		lList.add(16);
		lList.add(17);
		lList.add(18);
		lList.add(19);
		//lList.add(21);
		Node middle = lList.findMiddle(lList);
		System.out.println("The middle is: ");
		
		if(size%2==0)
		{
			System.out.println(previousNode.data+","+middle.data);
		} else {
			System.out.println(middle.data);
		}
	}

	private Node findMiddle(MiddleOfLinkedList lList) {
		Node p=head;
		Node q=head;
		while(q!=null && q.nextRef!=null)
		{
		  previousNode=p;
		  p=p.nextRef;
		  q=q.nextRef.nextRef;
		}
		return p;
	}
}
