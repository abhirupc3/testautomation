package FB_Google.basics.Revision.may.collection;

/**
 * @author achatterjee ON 5/19/22
 * @project testautomation
 */
public class LIRev {


    public static void main(String[] args) {
        LIRev li = new LIRev();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        li.add("E");
        li.add("F");
        Node h = li.head;
        while(h!=null) {
            System.out.print(h.data);
            h=h.next;
        }
        li.reverse(li.head);


    }

    private void reverse(Node head) {
        Node prev=null;
        Node next=head.next;
        while(true)
        {
            head.next=prev;
            prev=head;
            head=next;
            next=next.next;
            if(next==null) {
                break;
            }
        }
        head.next=prev;
        Node h = head;
        System.out.println("\n");
        while(h!=null) {
            System.out.print(h.data);
            h=h.next;
        }
    }

    Node head=null;
    private void add(String a) {
         Node n = new Node(null,a);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    class Node{
        Node next;
        Object data;
        public Node(Node next,Object data)
        {
            this.data=data;
            this.next=next;
        }
    }
}
