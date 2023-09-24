package FB_Google.basics.simpleexample.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author achatterjee ON 2/13/22
 * @project testautomation
 */
public class BinaryTree {

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
        Node temp = BST.root;
        Stack<Node> q = new Stack<Node>();
        while(true)
        {
            if(temp!=null)
            {
                q.add(temp);
                temp=temp.left;

            } else{
                if(q.isEmpty())
                    break;
                Node te = q.pop();
                System.out.println(te.data);
                temp=te.right;
            }
        }
    }



    Node root;

    public void insert(int data)
    {
        Node newNode = new Node(null,null,data);
        Node temp=root;
        if(root==null)
        {
            root=newNode;
            return;
        }
        Node leaf = traverseLast(data);
        if(data>leaf.data)
        {
            leaf.right=newNode;
        } if(data< leaf.data)
    {
        leaf.left=newNode;
    }
    }
    public Node traverseLast(int data)
    {
        Node node = root;
        while(true)
        {
            if(node.left!=null && data<node.data)
            {
                node=node.left;
            } else if(node.right!=null && data>node.data)
            {
                node=node.right;
            }else {
                break;
            }
        } return node;
    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(Node left,Node right,int data)
    {
     this.left = left;
     this.right = right;
     this.data =data;

    }

}