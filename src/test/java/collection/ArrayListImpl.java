package collection;

import java.util.Arrays;
import java.util.Collections;

public class ArrayListImpl {

	int current_Cap=2;
	int size=0;
	public Object[] table = new Object[current_Cap];
	
	
	public void add(Object o)
	{
		if(size==current_Cap)
			updateList();
		table[size]=o;
		size++;
	}

   public void remove(int i)
   {
	   if(i==size-1)
	   {
		   table[size-1]=null;
		   return;
	   } 
	   else if(i<(size-1) && i>=0)
	   {
		   for(int m=i;m<(size-1);m++)
		   {
			   table[i]=table[i+1];   
		   }
		   table[size-1]=null;
		   size --;
	   }
		   
		/*
		 * for(int m=i;m<size-2;m++){ table[i]=table[i+1]; } table[size-1]=null; size
		 * --;
		 */
   }
   public Object get(int i){
	   return table[i];
   }
	private void updateList() {

		this.table = Arrays.copyOf(this.table, current_Cap*2);
	}
	public static void main(String[] args) {
		ArrayListImpl aimpl = new ArrayListImpl();
		aimpl.add("A");
		aimpl.add("B");
		aimpl.add("A1");
		aimpl.add("B1");
		System.out.println("++"+aimpl.get(0));
		aimpl.remove(3);
		for (int i=0 ; i<4 ;i++) {
			System.out.println(aimpl.get(i));
		}
	}
}
