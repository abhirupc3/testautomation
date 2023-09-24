package FB_Google.basics.collection.practise;

/**
 * @author achatterjee ON 3/3/22
 * @project testautomation
 */
public class LinkedList {
    class Node{
        Node next;
        Object data;
        Node(Node next, Object data)
        {
            this.next = next;
            this.data= data;
        }
    }
    Node head;
    public void insert(Object data)
    {
        Node temp = head;
        Node ne = new Node(null,data);
        if(temp==null)
        {
            head = ne;
            return;
        }
        ne.next=head;
        head=ne;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert("A");
        ll.insert("B");
        ll.insert("C");
        ll.insert("D");
        ll.insert("E");
        ll.insert("F");
        ll.insert("G");
        ll.insert("H");

        Node te = ll.head;
        while(te!=null)
        {
            System.out.println(te.data);
            te=te.next;
        }
       Node te1 = reverse(ll.head);
        System.out.println("\n\n");
        while(te1!=null)
        {
            System.out.println(te1.data);
            te1=te1.next;
        }
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node next = head.next;
        while(head!=null && head.next!=null)
        {
            head.next=prev;
            prev=head;
            head=next;
            next=next.next;

        }
        head.next=prev;
        return head;
    }
}
