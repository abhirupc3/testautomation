package FB_Google.basics.simpleexample.practice.new1;

import FB_Google.basics.collection.LinkedListReverse;

import java.util.Stack;

/**
 * @author achatterjee ON 2/25/22
 * @project testautomation
 */

public class LlRev {
    class Nod {
        Object data;
        Nod next;

        Nod(Object data, Nod next) {
            this.data = data;
            this.next = next;
        }
    }
 static Nod head;

    public void insert(Object o)
    {
        Nod nod = new Nod(o,null);
        if(head==null)
        {
            head = nod;
            return;
        }
        nod.next=head;
        head=nod;
    }
    public static void main(String[] args) {
        LlRev liRev = new LlRev();
        liRev.insert("A");
        liRev.insert("B");
        liRev.insert("C");
        liRev.insert("D");
        liRev.insert("E");
        liRev.insert("F");
        Nod n = head;
        Stack<Nod> st = new Stack<Nod>();
        while(n!=null)
        {
            System.out.println(n.data);
            st.push(n);
            n=n.next;
        }
        LlRev liRe = new LlRev();

        Nod nn = st.pop();
        head = nn;
        while(!st.isEmpty())
        {
             nn.next = st.pop();
             nn = nn.next;
             if(nn.next!=null)
                 nn.next=null;
            //liRe.insert(st.pop().data);
            //System.out.println(st.pop().data);

        }
        printData();
        //liRev.Nod te = liRev.head;


    }
    static void printData()
    {
        Nod n =head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
}
