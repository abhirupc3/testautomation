package FB_Google.basics.simpleexample.practice.collection;

import FB_Google.basics.collection.BinaryTree;
import FB_Google.basics.collection.LevelOrderPrintOfBTNewLine;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author achatterjee ON 2/26/22
 * @project testautomation
 */
public class DepthOfTree {
    public static void main(String[] args) {
        DepthOfTree lot = new DepthOfTree();
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
        lot.levelOrder(BST.root);


    }

    private void levelOrder(BinaryTree.Node root) {
        Queue<BinaryTree.Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        int level = 1;
        while(!qu.isEmpty())
        {
            BinaryTree.Node node = qu.poll();
            if(node==null)
            {
                if(qu.isEmpty())
                {
                    break;
                } else{
                    qu.add(null);
                    level++;
                    System.out.println("\n");
                    continue;
                }
            } else{
                System.out.print(node.data + " ");
            }
            if(node.leftNode!=null)
                qu.add(node.leftNode);
            if(node.rightNode!=null)
                qu.add(node.rightNode);
        }

        System.out.println("The depth of Tree is: "+level);
    }
}
