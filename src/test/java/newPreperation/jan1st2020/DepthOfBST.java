package newPreperation.jan1st2020;
/**
 * Write a program to find the depth of a binary Tree
 * @author 19094
 *
 */
public class DepthOfBST {

	  class Node{
		  int data;
		  Node left;
		  Node right;
		  public Node(int data)
		  {
			  this.data=data;
		  }
	  }
	  Node head =null;
	  public void insert(int data)
	  {
		  Node newNode = new Node(data);
		if(head==null) 
		{
			head=newNode;
			return;
		}
		Node leaf = traverseLast(data);
		if(data>leaf.data)
			leaf.right=newNode;
		else if(data<leaf.data)
			leaf.left=newNode;
		System.out.println("Data inserted");
	  }
	private Node traverseLast(int data) {
		if(head==null)
			return null;
		Node temp = head;
		while(true) {
		if(temp.left!=null  && data<temp.data)
			temp=temp.left;
		else if(temp.right!=null && data>temp.data )
			temp=temp.right;
		 else 
			break;
		}
		return temp;
	}
	public static void main(String[] args) {
		DepthOfBST bst = new DepthOfBST();
		bst.insert(12);
		bst.insert(13);
		bst.insert(11);
		bst.insert(15);
		int depth = findDepth(bst.head);
		System.out.println("The value of BST depth is: "+depth);
		
	}
	private static int findDepth(Node start) {
		int left=0;
		int right=0;
		int depth=0;
		if(start==null)
			return 0;
		Node leftNode = start.left;
		Node rightNode = start.right;
		left=findDepth(leftNode);
		right=findDepth(rightNode);
		System.out.println("right node is:"+right);
		if(left>right)
			depth = left+1;
		else
			depth = right+1;
		return depth;
		
		
	}
}
