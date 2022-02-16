package FB_Google.basics.simpleexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * @author achatterjee ON 2/15/22
 * @project testautomation
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * https://www.youtube.com/watch?v=xmQb5y1D8gU
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListwithRandomPointer {
    public static void main(String[] args) {
        CopyListwithRandomPointer cp = new CopyListwithRandomPointer();
        Node node1 = new Node(15);
        Node node = new Node(12);
        node.next=new Node(13);
        node.random=node1;
        node.next.next=node1;
        Node n1 = cp.copyRandomList(node);
        System.out.println(n1.val);
    }

    public Node copyRandomList(Node head) {
        Node curr = head;
        Map<Node,Node> mp = new HashMap<>();
        while(curr!=null)
        {
            mp.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr = head;
        Node n = null;
        for(Node key: mp.keySet())
        {
            n = mp.get(key);
            n.next = mp.get(key.next);
            n.random = mp.get(key.random);
        }

        return mp.get(curr);
    }
}
