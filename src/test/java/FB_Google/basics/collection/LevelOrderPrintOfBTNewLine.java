package FB_Google.basics.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author achatterjee ON 2/12/22
 * @project testautomation
 */
public class LevelOrderPrintOfBTNewLine {
    //https://www.youtube.com/watch?v=7uG0gLDbhsI&t=36s

    public static void main(String[] args) {
        LevelOrderPrintOfBTNewLine lot = new LevelOrderPrintOfBTNewLine();
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
    public void levelOrder(BinaryTree.Node root) {
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty())
        {
            BinaryTree.Node n = queue.poll();
            if(n==null)
            { if(queue.isEmpty())
                break;
                queue.add(null);
                System.out.println("\n");
                continue;
            } else{
                System.out.print(n.data + " ");
            }
            if(n.leftNode!=null)
                queue.add(n.leftNode);
            if(n.rightNode!=null)
                queue.add(n.rightNode);

        }
    }
}
