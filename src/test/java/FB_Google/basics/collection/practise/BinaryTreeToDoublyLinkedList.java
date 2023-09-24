package FB_Google.basics.collection.practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author achatterjee ON 3/4/22
 * @project testautomation
 */
public class BinaryTreeToDoublyLinkedList {
    class Node{
        Node next;
        Node prev;
        int data;
        Node(Node next,Node prev, int data)
        {
            this.next=next;
            this.prev=prev;
            this.data=data;
        }
    }
    class BSTNode{
        BSTNode right;
        BSTNode left;
        int data;
        BSTNode(BSTNode right, BSTNode left, int data)
        {
            this.right=right;
            this.left=left;
            this.data=data;
        }
    }
    BSTNode root=null;
    Node head=null;

    public static void main(String[] args) {
        BinaryTreeToDoublyLinkedList BST = new BinaryTreeToDoublyLinkedList();
        BST.insertToBST(8);
        BST.insertToBST(3);
        BST.insertToBST(6);
        BST.insertToBST(10);
        BST.insertToBST(4);
        BST.insertToBST(7);
        BST.insertToBST(1);
        BST.insertToBST(14);
        BST.insertToBST(13);
        System.out.println("Completed!!");
        //Traverse through a BST

        Stack<BSTNode> st = new Stack<>();
        BSTNode n = BST.root;
        Stack<BSTNode> al = new Stack<>();
        //st.push(n);
        while(true)
        {
            if(n!=null)
            {
                st.push(n);
                n=n.left;
            }else{
                if(st.isEmpty())
                    break;
                BSTNode s = st.pop();
                al.push(s);
                System.out.print(s.data+" ");
                n=s.right;
            }
        }

      BST.convertToDLL(al);
    }
    public void convertToDLL(Stack<BSTNode> al)
    {
        while(!al.isEmpty())
        {
            BSTNode bn = al.pop();
            Node n = new BinaryTreeToDoublyLinkedList.Node(null,null,bn.data);
            insertToLL(n);
        }

        Node temp = head;
        System.out.println("\n");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void insertToLL(Node n)
    {
        //Node n = new Node(null,null,data);
        Node temp = head;
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=head;
        head.prev=n;
        head=n;
    }
  public void insertToBST(int data) {
        BSTNode bNode = new BSTNode(null,null,data);
        BSTNode bn = root;
        if(root==null)
        {
            root=bNode;
            return;
        }
        BSTNode leaf = traverseLast(data);
        if(leaf.data<data)
            leaf.right=bNode;
        else if(leaf.data>data)
            leaf.left=bNode;

  }

    private BSTNode traverseLast(int data) {
        BSTNode temp = root;
        while(true)
        {
            if(temp!=null && temp.data>data && temp.left!=null)
            {
                temp = temp.left;
            } else if(temp!=null && temp.data<data && temp.right!=null)
            {
                temp=temp.right;
            } else
                 break;
        }
    return temp;
    }
}
