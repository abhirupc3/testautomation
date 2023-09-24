package FB_Google.basics.collection;

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
        while(n1!=null) {
            System.out.println(n1.val);
            n1=n1.next;
        }
    }

    public Node copyRandomList(Node head) {
        Node curr = head;
        Map<Node,Node> mp = new HashMap<Node,Node>();
        Node n;
         while(curr!=null)
         {
             mp.put(curr,new Node(curr.val));
             curr=curr.next;
         }
         for(Map.Entry<Node,Node> e: mp.entrySet())
        {
           n=e.getValue();
           n.next=e.getKey().next;
           n.random = e.getKey().random;
        }return mp.get(head);
    }

}
