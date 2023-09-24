package FB_Google.basics.collection.practise;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author achatterjee ON 3/3/22
 * @project testautomation
 */
public class LevelOrderDepth {
    class Node{
        Node right;
        Node left;
        int data;
        public Node(Node left, Node right, int data)
        {
            this.left=left;
            this.right=right;
            this.data=data;
        }
    }
    Node root=null;
    public Node traverseLast(int data)
    {
        Node temp = root;
        while(true) {
            if (temp != null &&  temp.left!=null && temp.data > data) {
                temp=temp.left;
            }
            else if(temp!=null && temp.right!=null && temp.data<data)
            {
                temp=temp.right;
            } else break;
        }
        return temp;
    }
    private void insert(int i) {
        Node te = root;
        Node n = new Node(null,null,i);
        if(te==null)
        {
            root = n;
            return;
        }
        Node leaf = traverseLast(i);
        if(leaf.data<i)
            leaf.right=n;
        else
            leaf.left=n;
    }
    public static void main(String[] args) {
        LevelOrderDepth BST = new LevelOrderDepth();
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
        BST.levelOrder();
    }

    private void levelOrder() {
        Node temp = root;
        if(temp==null)
            return;
        Queue<Node> qu = new LinkedList<>();
        qu.add(temp);
        qu.add(null);
        int depth = 1;
        while(!qu.isEmpty())
        {
            Node node = qu.poll();
            if(node==null)
            {
                if(qu.isEmpty())
                    break;
                else{
                    qu.add(null);
                    System.out.println("\n");
                    depth++;
                    continue;
                }
            } else{
                System.out.print(node.data+" ");
                if(node.left!=null)
                    qu.add(node.left);
                if(node.right!=null)
                    qu.add(node.right);
            }
        }
        System.out.println("Depth of the Tree is: "+depth);
    }
}
