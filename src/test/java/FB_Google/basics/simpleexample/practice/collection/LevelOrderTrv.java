package FB_Google.basics.simpleexample.practice.collection;

import FB_Google.basics.collection.BinaryTree;
import FB_Google.basics.collection.LevelOrderPrintOfBTNewLine;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author achatterjee ON 2/24/22
 * @project testautomation
 */
public class LevelOrderTrv {
    public static void main(String[] args) {
        LevelOrderTrv lot = new LevelOrderTrv();
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
        lot.lOT(BST.root);
    }

    public void lOT(BinaryTree.Node root)
    {
        Queue<BinaryTree.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            BinaryTree.Node node = q.poll();
            if(node==null)
            {
                if(q.isEmpty())
                    break;
                System.out.println("\n");
                q.add(null);
                continue;
            } else{
                System.out.print(node.data +" ");
            }
            if(node.leftNode!=null)
                q.add(node.leftNode);
            if(node.rightNode!=null)
                q.add(node.rightNode);
        }

    }
}
