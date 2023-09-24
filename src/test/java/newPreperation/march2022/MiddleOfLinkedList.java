package newPreperation.march2022;

/**
 * @author achatterjee ON 2/26/22
 * @project testautomation
 */
public class MiddleOfLinkedList {
    class Node {
        Object data;
        public Node next;

        public Node(Object data, Node next) {
            this.next=next;
            this.data = data;
        }

    }
    Node head;
    public static void main(String[] args) {
        MiddleOfLinkedList lList = new MiddleOfLinkedList();
        lList.add(12);
        lList.add(13);
        lList.add(14);
        lList.add(15);
        lList.add(16);
        lList.add(17);
        lList.add(18);
        lList.add(19);
        //lList.add(21);
        lList.findMiddle(lList);
    }

    private void findMiddle(MiddleOfLinkedList lList) {
        Node p=head;
        Node q=head;
        while(q!=null && q.next!=null && q.next.next!=null)
        {
            p=p.next;
            q=q.next.next;
        }
        System.out.println("The middle of the list is: "+ p.data);
    }

    public void add(int data)
    {
        Node nNode = new Node(data,null);
        if(head == null)
        {
            head = nNode;
            return;
        }
        nNode.next=head;
        head=nNode;
    }
}
