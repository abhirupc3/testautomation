package FB_Google.basics.simpleexample.practice.new1;

/**
 * @author achatterjee ON 2/16/22
 * @project testautomation
 */

public class BinaryTree {
    static class Node{
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
    public static void main(String[] args) {
        FB_Google.basics.simpleexample.practice.new1.BinaryTree BST = new FB_Google.basics.simpleexample.practice.new1.BinaryTree();
        BST.insert(8);
        BST.insert(3);
        BST.insert(6);
        BST.insert(10);
        BST.insert(4);
        BST.insert(7);
        BST.insert(1);
        BST.insert(14);
        BST.insert(13);
        System.out.println("Completed");
        BST.right();
    }
    Node root;
    public void insert(int data)
    {
        Node temp =root;
        Node n = new Node(null,null,data);
        if(root==null)
        {
            root = n;
            return;
        }
        Node leaf = traverse(data);
        if(data>=leaf.data)
            leaf.right=n;
        else
            leaf.left=n;
    }

    private Node traverse(int data) {
        Node temp = root;
        while(temp!=null) {
            if (data >= temp.data && temp.right != null)
                temp = temp.right;
            else if (data < temp.data && temp.left != null) {
                temp = temp.left;
            } else
                break;
        } return temp;
    }

    public void right()
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.right;
        }
    }
}
