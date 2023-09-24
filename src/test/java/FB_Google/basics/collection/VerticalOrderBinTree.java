package FB_Google.basics.collection;

import java.util.*;

/**
 * @author achatterjee ON 2/7/22
 * @project testautomation
 * https://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/?ref=gcse
 */
public class VerticalOrderBinTree {
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
        VerticalOrder(BST.root);
    }
    static class ElementNode{
        int hd;
        BinaryTree.Node node;
        ElementNode(int hd, BinaryTree.Node node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    private  static void VerticalOrder(BinaryTree.Node root) {
        Queue<ElementNode> qe = new LinkedList<ElementNode>();
        Map<Integer, ArrayList<BinaryTree.Node>> elementMap = new HashMap<Integer,ArrayList<BinaryTree.Node>>();
        ElementNode eN = new ElementNode(0,root);
        qe.add(eN);
        while(!qe.isEmpty()){
            ElementNode ele = qe.poll();
            BinaryTree.Node node = ele.node;
            int hd = ele.hd;
            if(elementMap.containsKey(hd))
            {
                ArrayList tempList = elementMap.get(hd);
                tempList.add(node);
                elementMap.put(hd,tempList);
            } else{
                ArrayList tempList = new ArrayList();
                tempList.add(node);
                elementMap.put(hd,tempList);
            }
            if(node.leftNode!=null)
            {
                qe.add(new ElementNode(hd-1,node.leftNode));
            } if(node.rightNode!=null) {
                qe.add(new ElementNode(hd + 1, node.rightNode));
            }
        }
        List<List<Integer>>  list = new ArrayList<List<Integer>>();
        for(Map.Entry<Integer,ArrayList<BinaryTree.Node>> e: elementMap.entrySet())
        {
            System.out.println("Value of level is :"+e.getKey());
            for(BinaryTree.Node n: e.getValue())
            {
                System.out.print(n.data+"\n");
            }
            System.out.println("\n");
        }
    }
}
