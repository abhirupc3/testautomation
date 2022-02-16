package newPreperation.mustDetele;

public class BSTDepth {

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
		int depth = findDepth(bst.head);
		System.out.println(depth);
	}

	private static int findDepth(Node node) {
		
		int left=0;
		int right=0;
		int depth=0;
		if(node==null)
			return 0;
		left = findDepth(node.left);
		right=findDepth(node.right);
		if(left<right)
		{
			depth=right+1;
		}else {
			depth=left+1;
		}
		return depth;
	}
}
