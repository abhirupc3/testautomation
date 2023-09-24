package FB_Google.basics.Revision.may.collection;

/**
 * @author achatterjee ON 5/17/22
 * @project testautomation
 */
public class LinledList {
    public static void main(String[] args) {
        LinledList lImpl = new LinledList();
        lImpl.insertFirst("A");
        lImpl.insertFirst("B");
        lImpl.insertFirst("C");
        lImpl.insertFirst("D");
        lImpl.insertFirst("E");
        lImpl.insertLast("X");
        lImpl.insert("z",3);
        lImpl.middle(lImpl.head);
    }

    private void middle(Node head) {
        Node p = head;
        Node q=head;
        while(q.next!=null && q.next.next!=null)
        {
            p=p.next;
            q=q.next.next;
        }
        System.out.println("Middle of the LinkedList is: "+p.data);
    }

    Node head;
    private void insert(String a, int i) {
        Node node = new Node(null,a);
        if(head==null) {
            head = node;
            return;
        }
        Node temp = head;
        int c = 0;
        while(c<i)
        {
            temp=temp.next;
            c++;
        }
        Node n = temp.next;
        temp.next=node;
        node.next=n;
    }

    private void insertLast(String a) {
        Node node = new Node(null,a);
        if(head==null) {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
    }

    private void insertFirst(String a) {
        Node node = new Node(null,a);
        if(head==null) {
            head = node;
            return;
        }
        node.next=head;
        head=node;

    }



    class Node{
        Node next;
        Object data;
        public Node(Node next,Object data)
        {
            this.next=next;
            this.data=data;
        }
    }
}
