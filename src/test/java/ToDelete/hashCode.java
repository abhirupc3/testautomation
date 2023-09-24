package ToDelete;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashCode {
	int i;
	public hashCode(int i)
	{
		this.i=i;
	}
	public hashCode()
	{
		
	}
public static void main(String[] args) {
	hashCode hc = new hashCode();
	System.out.println(hc.equals(new String()));
	Map<Object, Object> map  =  new HashMap<Object, Object>();
	map.put(new hashCode(9), "abc");
	map.put(new hashCode(11), "def");
	//System.out.println(map.get(new hashCode(9)));
	//System.out.println(map.get(new hashCode(11)));
	for(Map.Entry<Object, Object> e:map.entrySet())
	{
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
}

  public boolean equals(Object obj)
  {
	  return obj instanceof hashCode;
	  
  }
  public int hashCode()
  {
	  return i*77;
  }
  public String toString()
  {
	  return "hello";
  }
}
