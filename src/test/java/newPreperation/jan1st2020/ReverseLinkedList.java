package newPreperation.jan1st2020;
/**
 * Write a program t reverse a linked list
 * @author 19094
 *
 */
public class ReverseLinkedList {

	class Node{
		Object data;
		Node next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	int size=0;
	public void add(Object data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
		head=newNode;
		tail=newNode;
		size++;
		return;
		}
		tail.next=newNode;
		tail=tail.next;
		size++;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList rev = new ReverseLinkedList();
		rev.add("a");
		rev.add("b");
		rev.add("c");
		rev.add("d");
		rev.add("e");
		rev.add("f");
		rev.add("g");
		rev.add("h");
		printElements(rev);
		reverse(rev);
		printElements(rev);
	}

	private static void reverse(ReverseLinkedList rev) {
		Node previous=null;
		Node current=rev.head;
		Node next=current.next;
		while(current.next!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		rev.head=previous;
	}

	private static void printElements(ReverseLinkedList rev) {
		Node temp=rev.head;
		System.out.println("\n");
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
				System.out.print(",");
		}
		
	}
	
	
	
	
	
	
}
