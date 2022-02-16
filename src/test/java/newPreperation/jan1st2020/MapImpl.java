package newPreperation.jan1st2020;
/**
 * Write a program to implement map
 * @author 19094
 *
 */
class Entry{
	private Object key;
	public Object getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
	private Object value;
	public Entry(Object key, Object value)
	{
		this.key=key;
		this.value=value;
	}
}
public class MapImpl {
	Entry [] mapTable = new Entry[16];
	public void put(Object key, Object value)
	{
		int ind = key.hashCode()%16;
		System.out.println(ind);
		mapTable[ind]=new Entry(key,value);
	}
	public Object get(Object key)
	{
		System.out.println(key.hashCode()%16);
		return mapTable[key.hashCode()%16].getValue();
	}
	public void remove(Object key)
	{
		mapTable[key.hashCode()%16]=null;
	}
	public static void main(String[] args) {
		MapImpl mI = new MapImpl();
		mI.put("A0", "V1");
		mI.put("A1", "V2");
		mI.put("A2", "V3");
		mI.put("A3", "V4");
		System.out.println(mI.get("A"));
		System.out.println(mI.get("A1"));
		System.out.println(mI.get("A2"));
		System.out.println(mI.get("A3"));
	}
}
