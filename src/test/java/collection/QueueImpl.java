package collection;

public class QueueImpl {

	int size = 0;
	int top =0;
	int bottom=0;
	int  q[] ;
	public QueueImpl(int size)
	{
		this.size = size;
		q = new int[size];
	}
	
	public void push(int i)
	{
		q[top++]=i;
	}
	
	public int pop()
	{
		return q[bottom++];
	}
	public static void main(String[] args){
		 
		 QueueImpl q = new QueueImpl(12);
		 q.push(12);
		 q.push(122);
		 q.push(112);
		 q.push(123);
		 q.push(1112);
		 q.push(12234);
		 q.push(12556);
		 System.out.println(q.pop());
		 System.out.println(q.pop());
		 
	 }
}
