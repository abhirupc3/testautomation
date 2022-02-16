package FB_Google.basics.collection;

/**
 * @author achatterjee ON 2/2/22
 * @project testautomation
 */
public class LinkedListImpl {

    class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head;

    /**
     * Insert the data in the begining of the linked list;
     * @param data
     */
    public void insertFirst(Object data) {
        Node start = head;
        Node newNode = new Node(data, null);
        if (start == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    /**
     * Insert the data in the begining of the linked list;
     * @param data
     */
    public void insertLast(Object data) {
        Node start = head;
        Node newNode = new Node(data, null);
        if (start == null) {
            head = newNode;
            return;
        }
        while(start.next!=null)
        {
            start=start.next;
        }
        start.next = newNode;
    }
    /**
     * Insert the data in the begining of the linked list;
     * @param data
     */
    public void inserAtIndex(Object data,int index) {
        Node start = head;
        Node newNode = new Node(data, null);
        if (start == null) {
            head = newNode;
            return;
        }
        for(int y=0;y<index-1;y++)
        {
            start=start.next;
        }
        Node temp = start.next;
        start.next = newNode;
        newNode.next=temp;
    }

    /**
     * Removed from the start
     */
    public void remove()
    {
        if(head!=null) {
            Node temp = head.next;
            head = temp;
        }
    }
    /**
     * Removed from the index
     */
    public void remove(int index)
    {
        Node temp = head;

        for(int y=0;y<index-1;y++)
        {
            temp=temp.next;
        }
        temp.next = temp.next.next;
    }

    /**
     * returns the first element of the linked list.
     * @return
     */
    public Object get()
    {
        if (head!=null)
            return head.data;
        return null;
    }
    /**
     * returns the first element of the linked list.
     * @return
     */
    public Object getAtIndex(int index)
    {
        if (head==null)
            return null;
        Node temp=head;
        for(int y=0;y<index-1;y++)
        {
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        LinkedListImpl lImpl = new LinkedListImpl();
        lImpl.insertFirst("A");
        lImpl.insertFirst("B");
        lImpl.insertFirst("C");
        lImpl.insertFirst("D");
        lImpl.insertFirst("E");
        lImpl.insertLast("X");
        lImpl.inserAtIndex("pos",2);
        System.out.println(lImpl);
        //lImpl.remove();
        //lImpl.remove(1);
        System.out.println(lImpl.get());
        System.out.println(lImpl.getAtIndex(3));

    }


}
