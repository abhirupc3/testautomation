package newPreperation.jan1st2020.basics;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program to store an instance as a key in hash map and retrieve the value
 * for ex. hm.put(new EqualAndHashCodeOverride(),"A")
 * @author 19094
 *
 */
public class EqualAndHashCodeOverride {
	int data;
	public EqualAndHashCodeOverride(int data)
	{
		this.data=data;
	}
	public boolean equals(Object obj) {
	    return (obj instanceof EqualAndHashCodeOverride);	
	}
	@Override
	public int hashCode() {
		
		return data*17;
	}
	public static void main(String[] args) {
		HashMap<EqualAndHashCodeOverride,String> hm = new HashMap<EqualAndHashCodeOverride,String>();
		hm.put(new EqualAndHashCodeOverride(17),"A");
		hm.put(new EqualAndHashCodeOverride(18),"B");
		for(Map.Entry<EqualAndHashCodeOverride,String> e:hm.entrySet())
		{
			System.out.println("Key: "+e.getKey());
			System.out.println("Val: "+e.getValue());
		}
		
	}
}
