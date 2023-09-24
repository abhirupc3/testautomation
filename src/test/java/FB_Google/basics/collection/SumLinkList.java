package FB_Google.basics.collection;

/**
 * @author achatterjee ON 2/3/22
 * @project testautomation
 */
public class SumLinkList {
    class Node {
        Node next;
        Integer data;

        Node(Integer data, Node next) {
            this.next = next;
            this.data = data;
        }
    }

    Node head = null;

    public void insert(Integer data) {
        Node newNode = new Node(data, null);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SumLinkList sL1 = new SumLinkList();
        SumLinkList sL2 = new SumLinkList();

        sL1.insert(6);
        sL1.insert(7);
        sL1.insert(8);
        sL1.insert(9);
        sL2.insert(9);
        sL2.insert(8);
        sL2.insert(7);
        sL2.insert(6);
        sL2.insert(3);
        sL2.insert(4);
        sL2.insert(1);
        System.out.println("Data Inserted");
        Node n = sL1.head;
        while(n!=null)
        {
            System.out.print(n.data+"\t");
            n=n.next;
        }
        System.out.println("\n");
        n = sL2.head;
        while(n!=null)
        {
            System.out.print(n.data+"\t");
            n=n.next;
        }
        System.out.println("\n");
        SumLinkList cl =sumAndPrint(sL1,sL2);
        n = cl.head;
        while(n!=null)
        {
            System.out.print(n.data+"\t");
            n=n.next;
        }
        cl.revLinkList();
        System.out.println("\n After Data reverse:");
        n = cl.head;
        while(n!=null)
        {
            System.out.print(n.data+"\t");
            n=n.next;
        }
    }

    private static SumLinkList sumAndPrint(SumLinkList sL1, SumLinkList sL2) {
        SumLinkList sumList = new SumLinkList();
        int sum=0;int carry=-1;
        Node nl1= sL1.head;
        Node nl2 = sL2.head;
        while(true)
        {
            if(nl1==null && nl2==null && carry==0)
                break;
            carry=carry==-1?0:carry;
            int data1 = nl1==null?0:nl1.data;
            int data2 = nl2==null?0:nl2.data;
            sum = (data1 + data2)%10+carry;
            carry = (data1+ data2)/10;
            sumList.insert(sum);
            nl1=nl1==null?null:nl1.next;
            nl2=nl2==null?null:nl2.next;

        }
        System.out.println("Added!!!");
        return sumList;
    }

    public void revLinkList()
    {
        Node prev=null;
        Node next = head.next;
        while(next!=null)
        {
            head.next=prev;
            prev=head;
            head=next;
            next=next.next;
        }
        head.next=prev;
    }
}
