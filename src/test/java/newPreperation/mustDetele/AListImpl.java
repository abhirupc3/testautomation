package newPreperation.mustDetele;

import java.util.Arrays;

public class AListImpl {
	int cap = 6;
	int size=0;
	public Object[] list = new Object[cap];
    public void add(Object data)
    {
    	if(size==cap)
    	{
    		updateSize();
    	}
    	list[size++]=data;
    }
    public Object get(int index)
    {
    	return list[index];
    }
    public void remove(int index)
    {
    	for(int m=index-1;m<size-2;m++)
    	{
    		list[m]=list[m+1];
    	}
    	list[size-1]=null;
    }
	private void updateSize() {
		cap = cap+6;
		Arrays.copyOf(list, cap);
	}
	public static void main(String[] args) {
		AListImpl al = new AListImpl();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
	}
}
