package FB_Google.basics.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author achatterjee ON 2/14/22
 * @project testautomation
 * https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        BinaryTree BST = new BinaryTree();
        BST.insert(1);
        BST.insert(2);
        BinaryTreeRightSideView brsv = new BinaryTreeRightSideView();
        List lst = brsv.rightSideView(BST.root);
        System.out.println(lst);
    }
    public List<Integer> rightSideView(BinaryTree.Node root) {
        List<Integer> itemList = new ArrayList<>();
        BinaryTree.Node temp = root;
        if(temp==null)
            return itemList;
        while(temp!=null)
        {
            itemList.add(temp.data);
            temp=temp.rightNode;
        }
       return itemList;
    }
}
