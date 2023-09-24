package FB_Google.basics.collection.practise;

import FB_Google.basics.collection.SumLinkList;

/**
 * @author achatterjee ON 3/4/22
 * @project testautomation
 */
public class SumLink {
    class Node{
        Node next;
        int data;
        Node(Node next, int data)
        {
            this.next=next;
            this.data=data;
        }
    }

    Node head = null;

    public static void main(String[] args) {
        SumLink sL1 = new SumLink();
        SumLink sL2 = new SumLink();

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
        Node res = sum(sL1,sL2);
        while(res!=null)
        {
            System.out.print(res.data);
            res=res.next;
        }
    }

    private static Node sum(SumLink sl1, SumLink sl2) {
        SumLink res = new SumLink();
        int sum=0;
        int carry=0;
        Node n1 = sl1.head;
        Node n2 = sl2.head;
        while(true)
        {
            if(n1==null && n2 ==null && carry==0)
                break;
            int s1 = n1==null ? 0: n1.data;
            int s2 = n2==null ? 0:n2.data;
            int x = s1+s2+carry;
            sum = x%10;
            carry = x/10;
            res.insert(sum);
            n1=n1==null? null:n1.next;
            n2=n2==null? null: n2.next;

        }
        if(carry>0)
            res.insert(carry);
        return res.head;
    }

    public void insert(int data)
    {
        Node n = new Node(null, data);
        Node temp = head;
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }

}
