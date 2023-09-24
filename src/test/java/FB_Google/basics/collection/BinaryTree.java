package FB_Google.basics.collection;

import newPreperation.datastructure.BinarySearchTree;

/**
 * @author achatterjee ON 2/6/22
 * @project testautomation
 */
public class BinaryTree {
    public static class Node{
        public Node leftNode;
        public Node rightNode;
       public int data;
        Node(Node rightNode,Node leftNode,int data)
        {
            this.rightNode=rightNode;
            this.leftNode=leftNode;
            this.data=data;

        }
    }
    public Node root;
    public void insert(int data)
    {
        Node tempNode = root;
        Node newNode = new Node(null,null,data);
        if(root==null)
        {
            root=newNode;
            return;
        }
        Node leafNode=traverseToLeaf(data,tempNode);
        if(data>=leafNode.data)
        {
            leafNode.rightNode=newNode;
        } else{
            leafNode.leftNode=newNode;
        }
    }

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
        System.out.println("Completed");
    }
    public Node traverseToLeaf(int data,Node tempNode)
    {
        while(true)
        {
            if(data> tempNode.data && tempNode.rightNode!=null)
            {
                tempNode=tempNode.rightNode;
            } else if(data < tempNode.data && tempNode.leftNode!=null)
            {
                tempNode=tempNode.leftNode;
            } else{
                break;
            }
        }
        return tempNode;
    }
}
