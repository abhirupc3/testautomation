package ToDelete;

import java.util.Stack;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class LinkedList {
	    Node head=null;
	    public Stack<Node> st = new Stack<Node>();
	    public Stack<Node> stB = new Stack<Node>();
	    public static void main(String[] args) {
		/*
		 * Node headA = new Node(1); headA.next=new Node(1);
		 */
		  Node headA = new Node(5); headA.next=new Node(10); 
		  headA.next.next=new  Node(15); headA.next.next.next=new Node(40);
		/* Node headB = new Node(2); headB.next = new Node(4); */
		
		  Node headB = new Node(2); headB.next = new Node(3); headB.next.next = new
		  Node(20);
		 
		LinkedList li = new LinkedList();
		Node n = li.sortedMerge(headA, headB);
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		}
	    Node sortedMerge(Node headA, Node headB) {
	        Node tempA=headA;
	        Node tempB=headB;
	        int a=0;
	        int b=0;
	        while(tempA!=null)
	        {
	            tempA=tempA.next;
	            a++;
	        }
	        while(tempB!=null)
	        {
	            tempB=tempB.next;
	            b++;
	        }
	        Node longNode = a>=b?headA:headB;
	        Node shotNode=  a<b?headA:headB;
	        Node[] stB =null;
	        if(a<=b)
	        {
	        	stB = new Node[a];
	        } else {
	        	stB = new Node[b];
	        }
	        Node s = shotNode;
	        int l=0;
	        Node prefix=null;
	         while(s!=null)
	        {
	        	 stB[l++]=s;
	            s=s.next;
	        }
	        Node p = longNode;
	        Node q = longNode.next;
	        Node pRef = longNode;
	        int i = 0;
	        while(q!=null)
	        {
	        	Node np = stB[i++];
	            if(p.data<=np.data && q.data>=np.data)
	            {
	                p.next=np;
	                np.next=q;
	                p=p.next;
	            }
	            else if(p.data>np.data)
	            {
	            	if(i==1) {
	            	prefix = new Node(np.data);
	            	longNode=prefix;
	            	//prefix.next=p;
	            	}
	            	else {
	            		prefix.next=np;
	            		prefix = prefix.next;
	            	}
	            	  
	            }else
		        {
	            	Node temp=q.next;
		        q.next=np;	
		        np.next=temp;
		        //q=q.next;
		        }
	             p=p.next;
	             if(q!=null)
	             q=q.next;
	             if(i==stB.length)
	            	 break;
	        } 
	        if(prefix!=null)
	        	prefix.next=pRef;
	        return longNode;
	     // This is a "method-only" submission. 
	     // You only need to complete this method
	   } 
	}

