package FB_Google.basics.simpleexample.practice.new1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/16/22
 * @project testautomation
 * // RightSide View
 */
public class BT {
// Binary Tree to circular linked List
    BinaryTree.Node head =null;
    public static void main(String[] args) {
        FB_Google.basics.simpleexample.practice.new1.BinaryTree BST = new FB_Google.basics.simpleexample.practice.new1.BinaryTree();
        BST.insert(4);
        BST.insert(2);
        BST.insert(5);
        BST.insert(1);
        BST.insert(3);
        BT bt = new BT();

        BinaryTree.Node StartNode = bt.convert(BST.root);
        while(StartNode!=null)
        {
            System.out.println(StartNode.data);
            StartNode=StartNode.right;
            if(StartNode==bt.head.left) {
                System.out.println(StartNode.data);
                break;
            }
        }
        System.out.println("Completed !!!");
    }

    public FB_Google.basics.simpleexample.practice.new1.BinaryTree.Node convert(FB_Google.basics.simpleexample.practice.new1.BinaryTree.Node root)
    {
        BinaryTree.Node temp = root;
        Stack<BinaryTree.Node> st = new Stack<BinaryTree.Node>();
        List<Integer> li = new ArrayList<>();
        while (true)
        {
            if(temp!=null)
            {
                st.push(temp);
                temp=temp.left;
            } else if(st.isEmpty())
            {
                break;
            }else if(temp==null)
            {
                BinaryTree.Node node = st.pop();
                li.add(node.data);
                temp=node.right;

            }
        }
        for(Integer n: li)
        {
            addToCircularList(n);
        }
        return head;
    }

    private void addToCircularList(Integer n) {
        BinaryTree.Node ne = new BinaryTree.Node(null,null,n);
        if(head==null)
        {
            head=ne;
            return;
        }
        BinaryTree.Node temp=head;
        while(head.left!=temp && head.right!=null)
        {
            temp=temp.right;
        }
        temp.right=ne;
        ne.left=temp;
        ne.right=head;
        head.left=ne;

    }

}
