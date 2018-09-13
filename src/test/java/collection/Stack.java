package collection;

public class Stack {
	
	public Long[] stack;
	int size = 0;
	int top=0;
	public Stack(int size)
	{
		this.size = size;
		stack = new Long[size];
	}
	
	public void push(Long i)
	{
		stack[top++]= i;
		System.out.println(i);
	}
	
	public long pop()
	{
		return stack[--top] ;
	}
	
	public boolean isEmpty()
	{
		return top==0;
	}
	public boolean isFull()
	{
		return size==top;
	}
	 public static void main(String[] args) {
	      Stack theStack = new Stack(10); 
	      System.out.println("PUSHED DATA");
	      theStack.push(10l);
	      theStack.push(20l);
	      theStack.push(30l);
	      theStack.push(40l);
	      theStack.push(50l);
	      System.out.println("POPPED DATA");
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.println(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
}
