package newPreperation.datastructure;
// https://www.youtube.com/watch?v=81PpYQ0AN_w
public class BinarySearchTree {

	 class Node{
		 Node leftNode;
		public Node getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}
		public Node getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
		public Integer getData() {
			return data;
		}
		public void setData(Integer data) {
			this.data = data;
		}
		Node rightNode;
		 Integer data;
	 }
	 Node root=null;
	 public Node createNode(int data)
	 {
		 Node node= new Node();
		 node.setData(data);
		 return node;
	 }
	 public Node insert(int data)
	 {
		 Node tempNode=root;
		 Node node = createNode(data);
		 if(tempNode==null)
		 {
			 root = node;
			return root; 
		 }
		 tempNode = traverseLast(tempNode,data);
		 if(data>tempNode.getData())
		 {
			tempNode.setRightNode(node);
		 } else if(data<tempNode.getData())
		 {
			 tempNode.setLeftNode(node);
		 }
		 return root;
	 }
	 public Node traverseLast(Node tempNode,int data)
	 {
		 while(true)
		 {
			 if(data>tempNode.getData()&&tempNode.getRightNode()!=null)
			 {
				 tempNode=tempNode.getRightNode();
			 } else if(data<tempNode.getData()&& tempNode.getLeftNode()!=null)
			 {
				 tempNode=tempNode.getLeftNode();
			 }
			 else {
				 break;
			 }
		 }
		 return tempNode;
	 }
	 public static void main(String[] args) {
		 //8,3,6,10,4,7,1,14,13
		BinarySearchTree BST = new BinarySearchTree();
		BST.insert(8);
		BST.insert(3);
		BST.insert(6);
		BST.insert(10);
		BST.insert(4);
		BST.insert(7);
		BST.insert(1);
		BST.insert(14);
		Node node = BST.insert(13);
		System.out.println("Completed");
	}
}
