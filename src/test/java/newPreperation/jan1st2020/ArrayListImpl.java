package newPreperation.jan1st2020;

import java.util.Arrays;

/**
 * Write an implementation of ArrayList
 * 
 * @author 19094
 *
 */
public class ArrayListImpl {
	int size = 0;
	int capacity = 6;
	Object[] list;

	public ArrayListImpl() {
		this.list = new Object[capacity];
	}

	public void add(Object o) {
		if (size == capacity)
			updateSize();
		list[size++]=o;
	}
	public Object get(int index)
	{
		return list[index];
	}
	public void remove(int index)
	{
		for(int m = index-1;m<size-1;m++)
		{
			if(m<(size-1))
			list[m]=list[m+1];
		}
		list[size-1]=null;
		size=size-1;
	}
	public int getLength()
	{
		return size;
	}
	private void updateSize() {
		capacity = capacity + 12;
		Arrays.copyOf(this.list, capacity);
	}
	public static void main(String[] args) {
		ArrayListImpl aImpl=new ArrayListImpl();
		aImpl.add("A");
		aImpl.add("AB");
		aImpl.add("AD");
		aImpl.add("AE");
		aImpl.remove(2);
		System.out.println(aImpl);
	}
}
