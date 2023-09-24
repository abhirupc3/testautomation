package newPreperation.datastructure;

public class SumLinkedList {
  class Node{
	  Integer data;
	  public Integer getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextref() {
		return nextref;
	}
	public void setNextref(Node nextref) {
		this.nextref = nextref;
	}
	Node nextref;
	Node(int data)
	{
		this.data=data;
	}
  }
  Node head;
  Node tail;
  int size=0;
  public void addFirst(int data)
  {
	  Node newNode=new Node(data);
	  if(head==null)
	  {
		  head=newNode;
		  tail=head;
		  size++;
	  } else {
		  newNode.setNextref(head);
		  head=newNode;
		  size++;
	  }
  }
  public int getSize()
  {
	  return size;
  }
  public static SumLinkedList add2Num(Node n1,Node n2,int s1,int s2)
  {
	  SumLinkedList res= new SumLinkedList();
	  int maxSize=s1;
	  int carry=0;
	  int sum=0;
	  if(s2>s1)
	  {
		  Node tmp=n1;
		  n1=n2;
		  n2=tmp;
		  maxSize=s2;
	  }
	  for(int i=0;i<maxSize;i++)
	  {
		  int x =((n2==null)?0:n2.getData());
		  sum=n1.getData()+x+carry;
		  int rem=sum%10;
		  carry=sum/10;
		  res.addFirst(rem);
		  n1=n1.getNextref();
		  if(n2!=null)
		  n2=n2.getNextref();
	  }
	  if(carry==1)
	  {
		 res.addFirst(carry);
	  }
	  return res;
   	  
  }
  public static void printData(SumLinkedList list)
  {
	  Node n = list.head;
	  for(int y=0;y<list.getSize();y++)
	  {
		 if(n!=null)
		 {
			 System.out.println(n.getData());
			 n=n.getNextref();
		 }
	  }
  }
  public static void main(String[] args) {
	  SumLinkedList l1 = new SumLinkedList();
	  l1.addFirst(9);
	  l1.addFirst(9);
	  SumLinkedList l2 = new SumLinkedList();
	  //l2.addFirst(3);
	  l2.addFirst(1);
	  SumLinkedList re =  add2Num(l1.head, l2.head, l1.getSize(), l2.getSize());
	  printData(re);
}
}
