package FB_Google.basics.simpleexample.practice.new1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author achatterjee ON 2/18/22
 * @project testautomation
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
public class CopyLinkedList {

    public static void main(String[] args) {
        CopyLinkedList cp = new CopyLinkedList();
       Node node1 = new Node(15);
        Node node = new Node(12);
        node.next=new Node(13);
        node.random=node1;
        node.next.next=node1;
        Node n1 = cp.coplyList(node);
        System.out.println(n1.val);
    }
    public Node coplyList(Node head)
    {
        Node temp = head;
        Map<Node,Node> mp = new HashMap<>();
        if(temp==null)
            return null;
        while(temp!=null)
        {
         mp.put(temp,new Node(temp.val));
         temp=temp.next;
        }
        Node copy=null;
        for(Node n:mp.keySet())
        {
            copy = mp.get(n);
            copy.next=mp.get(n.next);
            copy.random = mp.get(n.random);

        }
        return mp.get(head);
    }
}
