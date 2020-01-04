package newPreperation.jan1st2020;
/**
 * Perform an implementation of Binary Search Tree:
 * 7,8,9,10,11,12,13,14,15,16
 * @author 19094
 *
 */
public class BinarySearchTree {

	class Node{
		int data;
		public Node right;
		public Node left;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head=null;
	public Node insert(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		Node leaf = traverseLast(data);
		if(data<leaf.data)
		{
			leaf.left=newNode;
				
		} else if(data>leaf.data)
		{
			leaf.right=newNode;
		} return leaf;
	}
	private Node traverseLast(int data) {
		Node temp=head;
		if(data<temp.data && temp.left!=null)
		{
			temp=temp.left;
		} else if(data>temp.data && temp.right!=null)
		{
			temp=temp.right;
		}
		return temp;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(7);
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);
		bst.insert(11);
		bst.insert(12);
		bst.insert(13);
		bst.insert(14);
		bst.insert(15);
		bst.insert(16);
		System.out.println(bst);
	}
}
