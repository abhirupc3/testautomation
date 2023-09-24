package FB_Google.basics.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author achatterjee ON 2/10/22
 * @project testautomation
 * https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/
 */
public class BinaryTreeToCircularLL {

    BinaryTree bt = new BinaryTree();
    BinaryTree.Node head =null;
    public static void main(String[] args) {
        BinaryTree BST = new BinaryTree();
        BST.insert(4);
        BST.insert(2);
        BST.insert(5);
        BST.insert(1);
        BST.insert(3);
        BinaryTreeToCircularLL bct = new BinaryTreeToCircularLL();
        BinaryTree.Node node = bct.treeToDoublyList(BST.root);
        BinaryTree.Node StartNode = node;
        while(node!=null)
        {
            System.out.println(StartNode.data);
            StartNode=StartNode.rightNode;
            if(StartNode==node.leftNode) {
                System.out.println(StartNode.data);
                break;
            }
        }
        System.out.println("Success!!");
    }
    public BinaryTree.Node treeToDoublyList(BinaryTree.Node root) {
        if(root==null)
            return null;
        BinaryTree.Node temp = root;
        BinaryTree.Node result=null;
        Stack<BinaryTree.Node> st = new Stack<BinaryTree.Node>();
        List<Integer> li = new ArrayList<Integer>();
        while(true)
        {
            if(temp!=null)
            {
                st.push(temp);
                temp=temp.leftNode;
            }else{
                if(st.isEmpty())
                {
                    break;
                }
                BinaryTree.Node te = st.pop();
                li.add(te.data);
                temp=te.rightNode;
            }
        }
        for(int i:li)
        {
            add(i) ;
        }

        return head;
    }

    public void add(int li)
    {
        BinaryTree.Node newNode = new BinaryTree.Node(null,null,li);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        BinaryTree.Node temp = head;
        //Traversing to the last element;
        while(temp!=head.leftNode && head.rightNode!=null)
        {
            temp=temp.rightNode;
        }
        temp.rightNode = newNode;
        newNode.leftNode = temp;
        newNode.rightNode = head;
        head.leftNode=newNode;
    }
}
