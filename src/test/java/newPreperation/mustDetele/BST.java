package newPreperation.mustDetele;

class Node{
	public Node right;
	public Node left;
	public int data;
	public Node(int data)
	{
		this.data=data;
	}
}
public class BST {

	Node head=null;
	public static void main(String[] args) {
		BST bst= new BST();
		bst.insert(8);
		bst.insert(9);
		bst.insert(6);
		bst.insert(16);
		bst.insert(15);
		bst.insert(44);
		bst.insert(1);
		bst.insert(7);
		bst.print(bst.head);
	}
	private Node print(Node bst) {
		Node temp=bst;
		if(temp==null) {
			return null;
		}
			System.out.println(temp.data);
				print(temp.left);
				print(temp.right);
		return null;	
		
	}
	public void insert(int data)
	{
		Node temp = new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node leaf = traverseLastNode(data);
		if(data>leaf.data)
		{
			leaf.right=temp;
		}else if(data<leaf.data) {
			leaf.left=temp;
		}
	}
	private Node traverseLastNode(int data) {
		Node temp=head;
		while(true) {
		if(data>temp.data && temp.right!=null )
		{
			temp=temp.right;
		} else if(data<temp.data && temp.left!=null)
		{
			temp=temp.left;
		} else {
			return temp;
		}
		}
	}
	
	
}
