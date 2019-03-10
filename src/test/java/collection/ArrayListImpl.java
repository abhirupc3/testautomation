package collection;

import java.util.Arrays;
import java.util.Collections;

public class ArrayListImpl {

	int default_Cap=2;
	int size=0;
	public Object[] table = new Object[default_Cap];
	
	
	public void add(Object o)
	{
		if(size==default_Cap)
			updateList(table);
		table[size]=o;size++;
	}

   public void remove(int i)
   {
	    for(int m=i;m<size-2;m++){
	    	table[i]=table[i+1];
	    }
	    table[size-1]=null;
	    size --;
   }
   public Object get(int i){
	   return table[i];
   }
	private void updateList(Object[] table2) {

		default_Cap = default_Cap*2;
		table2 = Arrays.copyOf(table2, default_Cap);
	}
	public static void main(String[] args) {
		ArrayListImpl aimpl = new ArrayListImpl();
		aimpl.add("A");
		aimpl.add("B");
		aimpl.add("A1");
		aimpl.add("B1");
		System.out.println("++"+aimpl.get(0));
		aimpl.remove(2);
		for (int i=0 ; i<4 ;i++) {
			System.out.println(aimpl.get(i));
		}
	}
}
