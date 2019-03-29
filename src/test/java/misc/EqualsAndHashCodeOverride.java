package misc;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeOverride {
	String s;
	int x=1;
	EqualsAndHashCodeOverride e;
	public EqualsAndHashCodeOverride(int x)
	{
		this.x = x;
	}

	@Override
	public boolean equals(Object o)
	{
		return o instanceof EqualsAndHashCodeOverride;
	}
	@Override
	public int hashCode() {
		return x*17;
	}
	public static void main(String[] args) {

		Map<Object,String> map = new HashMap<Object,String>();
		map.put(new EqualsAndHashCodeOverride(12), "Abc");
		map.put(new EqualsAndHashCodeOverride(13), "Cda");
		System.out.println(map.get(new EqualsAndHashCodeOverride(12)));
		System.out.println(map.get(new EqualsAndHashCodeOverride(13)));
		
	}

}
