package newPreperation.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListImpl<T> {
	private int cap=12;
	private Object[] list;
	private int size;
	public ArrayListImpl()
	{
		this.list= new Object[cap];
	}
	
	public void add(T element)
	{
		updateSize();
		list[size++]=element;
	}

	public void remove(int index)
	{
		//checking for last element
		if(index==(size-1)){
			list[index]=null;
			return;
		}
		else if((index<0) || (index>=size))
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i=index;i<size;i++)
		{
			list[i]=list[i+1];
			list[i+1]=null;
		}
		size--;
	}
	public T get(int index)
	{
		return (T)list[index];
	}
    @Override
    public String toString() {
    	StringBuffer sb1 = new StringBuffer("[");
    	int counter=0;
    	for (Object o : list) {
    		counter++;
    		sb1.append(o);
    		if(counter<list.length)
    			sb1.append(",");
    		
			
		}sb1.append("]");
		return sb1.toString();
    	
    }
    public int size()
    {return size;}
	private void updateSize() {

		if(size>=cap){
			cap=cap+12;
			Arrays.copyOf(list, cap);
		}
	}
	public static void main(String[] args) {
		ArrayListImpl<String> aList = new ArrayListImpl<String>();
		aList.add("Ab");
		aList.add("Ab1");
		aList.add("Ab2");
		aList.add("Ab3");
		aList.remove(3);
		System.out.println(aList);
		System.out.println(aList.get(1));
		System.out.println(aList.size());
	}
}