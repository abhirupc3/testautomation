package FB_Google.basics.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author achatterjee ON 2/7/22
 * @project testautomation
 * https://www.youtube.com/watch?v=9PHkM0Jri_4&t=71s
 */
public class LevelOrderBinTree {
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
        levelOrder(BST.root);
    }

    private static void levelOrder(BinaryTree.Node root) {
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        BinaryTree.Node tempNode = root;
        if(tempNode==null)
        {
            return;
        }
        queue.add(tempNode);
        while(!queue.isEmpty())
        {
            BinaryTree.Node tN = queue.poll();
            System.out.print(tN.data+" ");
            if(tN.leftNode!=null)
                queue.add(tN.leftNode);
            if(tN.rightNode!=null)
                queue.add(tN.rightNode);
        }
    }
}
