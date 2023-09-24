package FB_Google.basics.collection.practise;

import FB_Google.basics.collection.VerticalOrderBinTree;

import java.util.*;

/**
 * @author achatterjee ON 3/3/22
 * @project testautomation
 */
public class VertTravrseBin {
    class Node{
        Node right;
        Node left;
        int data;
        public Node(Node left,Node right,int data)
        {
            this.left=left;
            this.right=right;
            this.data=data;
        }
    }

    Node root= null;

    public static void main(String[] args) {
        VertTravrseBin BST = new VertTravrseBin();
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
        BST.verticalOrder();
    }

    class ElementNode{
        int hd;
        Node node;
        public ElementNode(int hd,Node node)
        {
            this.hd=hd;
            this.node=node;

        }
    }
    private  void verticalOrder() {
        Node t = root;
        Queue<ElementNode> qu = new java.util.LinkedList<ElementNode>();
        qu.add(new ElementNode(0,t));
        Map<Integer, ArrayList<Node>> mp = new HashMap<>();
       int hd=0;
       Node node=null;

        while(!qu.isEmpty())
        {
            ElementNode el = qu.poll();
            hd = el.hd;
            node = el.node;
            if(mp.containsKey(hd))
            {
                ArrayList al = mp.get(hd);
                al.add(node);
                mp.put(hd,al);
            } else{
                ArrayList<Node> l = new ArrayList<Node>();
                l.add(node);
                mp.put(hd,l);
            }
            if(node.left!=null)
            {
                qu.add(new ElementNode(hd-1,node.left));
            }
            if(node.right!=null)
            {
                qu.add(new ElementNode(hd+1,node.right));
            }
        }

        for(Map.Entry<Integer,ArrayList<Node>> e: mp.entrySet())
        {
            System.out.println("Horizontal Level"+e.getKey());
            for(Node en:e.getValue())
            {
                System.out.print(en.data+" ");
            }
            System.out.println("\n");
        }
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
}
