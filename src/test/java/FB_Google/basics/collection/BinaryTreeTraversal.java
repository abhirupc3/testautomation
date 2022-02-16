package FB_Google.basics.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/7/22
 * @project testautomation
 * https://www.youtube.com/watch?v=nzmtCFNae9k&t=525s
 */
public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTree BST = new BinaryTree();
        BST.insert(8);
        BST.insert(3);
        BST.insert(6);
        BST.insert(10);
        BST.insert(4);
        BST.insert(7);
        BST.insert(1);
        BST.insert(14);
        BST.insert(13);
        List<Integer> li = traverse(BST.root);
        findInRangeNumbers(li);
    }

    private static void findInRangeNumbers(List<Integer> li) {
        int sum =0;
        for(Integer i:li)
        {
            if(i>=7 && i<=14)
            {
                sum=sum+i;
            }
        }
        System.out.println("Value is: "+sum);
    }

    private static List traverse(BinaryTree.Node root) {
        Stack<BinaryTree.Node> st = new Stack<>();
        List<Integer> li = new ArrayList<Integer>();
        BinaryTree.Node temp = root;
        if (root == null) {
            return null;
        }
        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.leftNode;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                temp = st.pop();
                li.add(temp.data);
                System.out.println(temp.data);
                temp = temp.rightNode;


            }
        } return li;
    }
}
