package newPreperation.datastructure;

import collection.LinkedListImpl.Node;

public class SingleLinkedListImpl<T> {

	private int size;
	class Node<T>{
		public Node()
		{
			
		}
		T data;
		Node<T> nextRef;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNextRef() {
			return nextRef;
		}
		public void setNextRef(Node<T> nextRef) {
			this.nextRef = nextRef;
		}
	}
	Node<T> head;
	Node<T> tail;
	public void add(T element)
	{
		Node<T> node = new Node<T>();
		node.setData(element);
		if(head==null){
			head=node;
		    tail=node;
		    size++;
		    }
		else{
			tail.setNextRef(node);
			tail=node;
			size++;
		}
	}
	
	public void add(int index,T element)
	{
		if(size<=index)
			return;
		Node<T> node = new Node<T>();
		node.setData(element);
		Node<T> temp=head;
		node.setData(element);
		for(int k=0;k<index-1;k++)
		{
				temp=temp.nextRef;
		}
	   node.setNextRef(temp.nextRef);
	   temp.setNextRef(node);
	   size++;
		
	}
	public void remove()
	{
		if(head==null)
			return;
		head=head.getNextRef();
		size--;
	}
	private int getSize()
	{
		return size;
	}
	public void remove(int index)
	{
		if(index>=size || index<0)
			return;
		Node<T> current = head;
		for(int k=0;k<index-1;k++)
		{
			current=current.nextRef;
		}
		current.setNextRef(current.getNextRef().getNextRef());
		size--;
	}
	public void traverse()
	{
		Node<T> temp=head;
		while(true)
		{
			if(temp==null)
				break;
			System.out.println(temp.getData());
			temp=temp.getNextRef();
		}
	}
	public T get(int index)
    {
    	for(int y=0;y<index;y++)
    	{
    		head=head.getNextRef();
    	}
    	
    	return head.getData(); 
    }
	public static void main(String[] args) {
		SingleLinkedListImpl<String> lImpl = new SingleLinkedListImpl<String>();
		lImpl.add("Abhirup");
		lImpl.add("Chatt");
		lImpl.add("Chatt1");
		lImpl.add(1, "Avanish");
		lImpl.add("Chatt2");
		lImpl.add(2, "Avanish23");
		System.out.println("New Data Is :"+lImpl.get(0));
		System.out.println(lImpl);
		lImpl.remove();
		System.out.println(lImpl);
		lImpl.remove(3);
		System.out.println(lImpl);
		lImpl.traverse();
		System.out.println(lImpl.getSize());
	}
	@Override
	public String toString() {
		Node<T> temp = head;
		StringBuffer sb = new StringBuffer("[");
		while(temp!=null && temp.data!=null)
		{
			sb.append(temp.data);
			temp=temp.nextRef;
			if(temp!=null && temp.data!=null)
			{
				sb.append(",");
			}
		}sb.append("]");
		return sb.toString();
	}
}
