package FB_Google.basics.Revision.may.collection;

import java.util.*;

/**
 * @author achatterjee ON 5/17/22
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
        traverse(BST.root);
        LevelOrderTraverse(BST.root);
        verticalOrdering(BST.root);
    }
   static class Element{
        Node node;
        int hd;
        public Element(int hd,Node node)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void verticalOrdering(Node root)
    {
        Queue<Element> q = new LinkedList<Element>();

        Map<Integer,List<Node>> mp = new HashMap<Integer,List<Node>>();
        Node temp = root;
        int hd = 0;
        ArrayList<Node> al = new ArrayList<Node>();
       // al.add(temp);
        //mp.put(0,al);
        q.add(new Element(hd,temp));
        while(!q.isEmpty())
        {
            Element ele = q.poll();
            if(mp.containsKey(ele.hd))
            {
                List li = mp.get(ele.hd);
                li.add(ele.node);
            } else{
                List<Node> li = new ArrayList<Node>();
                li.add(ele.node);
                mp.put(ele.hd,li);
            }
            if(ele.node.left!=null)
            {
                q.add(new Element(hd-1,ele.node.left));
            }if(ele.node.right!=null)
        {
            q.add(new Element(hd+1,ele.node.right));
        }
        }

        for(Map.Entry <Integer,List<Node>> e: mp.entrySet())
        {
            System.out.println("\nLevel: "+e.getKey());
            List<Node> li = e.getValue();
            for(Node et: li)
            {
                System.out.println(et.data+" ");
            }
            System.out.println("\n");
        }
    }
    public static  void traverse(Node root)
    {
        Node temp = root;
        Stack<Node> st = new Stack<Node>();
        while(true)
        {
             if(temp!=null)
             {
                 st.push(temp);
                 temp=temp.left;
             }else{
                 if(st.isEmpty())
                     break;
                 Node n = st.pop();
                 System.out.print(n.data +" ");
                 temp = n.right;
             }
        }
    }
    Node root;
    private void insert(int i) {
        Node node = new Node(i,null,null);
        if(root==null)
        {
            root = node;
            return;
        }
        Node leaf = traverseLast(node,root);
        if(leaf.data<i)
        {
            leaf.right = node;
        } else{
            leaf.left = node;
        }
    }

    private Node traverseLast(Node node, Node root) {
        Node temp = root;
        while(true)
        {
            if(node.data<temp.data && temp.left!=null)
            {
                temp=temp.left;
            } else if(node.data>temp.data && temp.right!=null)
            {
                temp=temp.right;
            } else{
                break;
            }
        }
        return temp;
    }


    class Node{
        Node right,left;
        int data;
        public Node(int data, Node right, Node left)
        {
            this.data=data;
            this.right=right;
            this.left=left;
        }
    }
    public static void LevelOrderTraverse(Node root)
    {
        Queue<Node> qu = new LinkedList<Node>();
        Node temp = root;
        qu.add(temp);
        qu.add(null);
        while(true)
        {
            Node t = qu.poll();
            if(t==null)
            {
                if(qu.isEmpty())
                {
                    break;
                }
                qu.add(null);
                System.out.println("\n");
                continue;
            } else{
                System.out.print(t.data + " ");
            }
            if(t.left!=null)
            {
                qu.add(t.left);
            }
            if(t.right!=null)
            {
                qu.add(t.right);
            }
        }
    }
}
