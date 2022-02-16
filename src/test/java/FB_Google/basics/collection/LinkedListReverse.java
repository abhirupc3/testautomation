package FB_Google.basics.collection;

/**
 * @author achatterjee ON 2/2/22
 * @project testautomation
 */
public class LinkedListReverse {
    class Node {
        Object data;
        Node next;

        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    public void insert(Object data) {
        Node temp = new Node(data,null);
        if(head==null)
        {
           head=temp;
           return;
        }
        temp.next=head;
        head=temp;
    }
    public Object get(int i)
    {
        Node start = head;
        for(int y=0;y<i-1;y++)
        {
           start = start.next;
        }
        if(start!=null)
            return start.next.data;
        return null;
    }
   public int size()
   {
       if(head==null)
           return 0;
       Node temp = head;
       int counter =0;
       while(temp!=null)
       {
           temp=temp.next;
           counter++;
       }
       return counter;
   }
   public void listRev()
   {
       Node prev = null;
       Node next = head.next;
       while(head!=null && head.next!=null)
       {
           head.next = prev;
           prev=head;
           head=next;
           next=next.next;
       }
       head.next = prev;
       System.out.println("Head is: "+head.data);
   }
    public static void main(String[] args) {
        LinkedListReverse liRev = new LinkedListReverse();
        liRev.insert("A");
        liRev.insert("B");
        liRev.insert("C");
        liRev.insert("D");
        liRev.insert("E");
        liRev.insert("F");
        Node te = liRev.head;
        for(int i=0;i< liRev.size();i++)
        {
            System.out.println(te.data);
            te = te.next;
        }
        liRev.listRev();
        Node te1 = liRev.head;
        System.out.println("After Data Reversal");
        for(int i=0;i< liRev.size();i++)
        {
            System.out.println(te1.data);
            te1 = te1.next;
        }

    }
}
