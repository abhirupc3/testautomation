package newPreperation.jan1st2020;

/**
 * Write a program to find the if the linked list has a loop, and if it has a 
 * loop then find the start of the loop
 * 
 * @author 19094
 *
 */
public class CheckMiddleOfLinkedList {
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
	public void makeLoop()
	{
		Node temp = head;
		for(int i=0;i<size/2;i++)
		{
			temp=temp.nextRef;
		}
		tail.nextRef=temp;
	}

	public static void main(String[] args) {
		CheckMiddleOfLinkedList lList = new CheckMiddleOfLinkedList();
		lList.add(12);
		lList.add(13);
		lList.add(14);
		lList.add(15);
		lList.add(16);
		lList.add(17);
		lList.add(18);
		lList.add(19);
		lList.add(21);
		lList.makeLoop();
		lList.isLoop();
	}
	private void isLoop() {
		Node p=head;
		Node q=head;
		boolean isLoop=false;
		while(q!=null && q.nextRef!=null)
		{
			p=p.nextRef;
			q=q.nextRef.nextRef;
			if(p==q)
			{
				isLoop=true;
				System.out.println("Yes, This Linked list is a loop");
				findStartOfLoop(p);
				return;
			}
		}
		System.out.println("This Linked list has no loop");
	}
	private void findStartOfLoop(Node p) {
		Node q=head;
		while(p!=q)
		{
		p=p.nextRef;
		q=q.nextRef;
		}
		System.out.println("The start of the loop is");
		System.out.println(p.data);
	}
}
