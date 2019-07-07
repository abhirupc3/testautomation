package amazon;
class Node{
	public Node(int data)
	{
		this.data=data;
	}
	Node left;
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	Node right;
	int data;
}
public class CheckBST {
// 10 20 L 10 30 R 20 40 L 20 60 R
	public boolean isBST(Node node,int min,int max)
	{
		if(node==null)
		{
			return true;
		}
		if(node.data<min || node.data>max)
		{
			return false;
		}
		return (isBST(node.left,min,node.data-1) && isBST(node.right,node.data+1,max));
	}
	Node root;
	public static void main(String[] args) {
		CheckBST cBST = new CheckBST();
		cBST.root=new Node(10);
		cBST.root.setLeft(new Node(20));
		cBST.root.setRight(new Node(30));
		cBST.root.getLeft().setLeft(new Node(40));
		cBST.root.getLeft().setRight(new Node(60));
		System.out.println(cBST.isBST(cBST.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}
