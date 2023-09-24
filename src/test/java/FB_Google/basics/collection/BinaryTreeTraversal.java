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
        BinaryTreeTraversal b = new BinaryTreeTraversal();
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
        Node n = b.circularLinkedList(li);
        System.out.println("Completed!");
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
        System.out.println("\nValue is: "+sum);
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
                System.out.print(temp.data+" ");
                temp = temp.rightNode;


            }
        } return li;
    }

    //Convert to Circular Linked List
    Node head;
    public Node circularLinkedList(List<Integer> li)
    {
        for(int data:li)
        {
           Node n = new Node(null,data);
           insert(n);
        }
        Node tem = head;
        while(tem.next!=null)
        {

            tem=tem.next;
        }
        tem.next=head;
        return head;
    }

    private void insert(Node n) {
        Node temp = head;
        if(temp==null)
        {
            head=n;
            return;
        }
        while(temp.next!=null)
        {

            temp=temp.next;
        }
        temp.next=n;
    }


    class Node {
       Node next;
       Object data;
       public Node( Node next,Object data)
       {
           this.next=next;
           this.data=data;
       }

    }
}
