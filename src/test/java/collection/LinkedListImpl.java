package collection;

import java.util.LinkedList;

public class LinkedListImpl {

	public Node head;
    
	 int size=0;
    public void add(Object data)
    {
    	Node current = head; 
    	Node temp = new Node(data);
    	if(current==null)
    	{
    		head=temp;
    		return;
    	}
    	while(current.getNext()!=null) 
    	{ 
    		current=current.getNext(); 
    	}
    	current.setNext(temp);
    	size++;
    }

    public void add(Object data, int index)
    {
    	Node current = head;
    	Node temp = new Node(data);
    	for(int y=0;y<index;y++)
    	{
    		current=current.getNext();
    	}
    	temp.setNext(current.getNext());
    	current.setNext(temp); size++;
    }

     public void remove(int index)
     {
    	 Node current = head;
     	for(int y=0;y<index;y++)
     	{
     		current=current.getNext();
     	}
     	
     	current.setNext(current.getNext().getNext()); 
     	size--;
     }

     public Object get(int index)
     {
    	 Node current = head;
     	for(int y=0;y<index;y++)
     	{
     		current=current.getNext();
     	}
     	
     	return current.getData(); 
     }

     public static void main(String[] args) {
    	 LinkedList<String> li = new LinkedList<String>();
 		LinkedListImpl limp = new LinkedListImpl();
 		limp.add("Ab");
 		limp.add("Ab12");
 		limp.add("Ab123");
 		limp.add("Ab12345");
 		limp.add("Ab123456");
 		limp.add("cccc", 3);
 		//limp.remove(2);
 		for(int i=0;i<limp.size;i++){
 		System.out.println(limp.get(i));
 		}
 	}





public class Node{
	public Object data;
	public Node next;
	public Node(Object data) {
		this.data=data;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
}
