package FB_Google.basics.simpleexample.practice.collection;

/**
 * @author achatterjee ON 2/24/22
 * @project testautomation
 */
class Node{
    Node prev;
    Node next;
    Object data;
    Node(Node prev,Node next, Object data)
    {
        this.prev=prev;
        this.next=next;
        this.data=data;
    }
}
public class Doublelnklst {
    Node head;
    public static void main(String[] args) {
        Doublelnklst dll = new Doublelnklst();
        dll.addFirst("Abc1");
        dll.addFirst("Abc2");
        dll.addFirst("Abc3");
        dll.addLast("AbcLast");
        dll.insertAt("between",2);
        System.out.println("Completed");


    }

    private void addFirst(String a) {

        Node newNode = new Node(null,null,a);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    private void addLast(String a) {

        Node newNode = new Node(null,null,a);
        Node last = head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        while(last.next!=null)
            last=last.next;
        last.next=newNode;
        newNode.prev=last;
    }
    private void insertAt(String a,int t) {

        Node newNode = new Node(null,null,a);
        Node last = head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        int m=0;
        while(m<t) {
            last = last.next;
            m++;
        }
        Node temp = last.next;
        last.next=newNode;
        newNode.prev=last;
        newNode.next=temp;
        if(temp!=null)
        temp.prev=newNode;
    }

}
