package collection;

public class MapImpl {
	 
	 Entry[] mapTable = new Entry[16];
	 
	  public void put(Object key,Object value){
		  int index = key.hashCode()%16;
		  Entry e = new Entry(key,value);
		  mapTable[index]=e;
	  }
	  public Object get(Object key){
		  int index = key.hashCode()%16;
		 
		  return mapTable[index].getValue();
	  }
	  
	  public void remove(Object key){
		  int index = key.hashCode()%16;
		  mapTable[index]=null;
	  }
	  public static void main(String[] args) {
			MapImpl mp = new MapImpl();
			mp.put("Abhi", "chat");
			mp.put("A2", "CC");
			MapImpl mI = new MapImpl();
			mI.put("A0", "V1");
			mI.put("A1", "V2");
			mI.put("A2", "V3");
			mI.put("A3", "V4");
			System.out.println(mp.get("Abhi"));
			System.out.println(mI.get("A"));
			System.out.println(mI.get("A1"));
			System.out.println(mI.get("A2"));
			System.out.println(mI.get("A3"));
		}
	public class Entry{
		Object key;
		Object value;
		public Entry(Object key, Object value) {
		  this.key=key;
		  this.value=value;
		}
		public Object getKey() {
			return key;
		}
		public void setKey(Object key) {
			this.key = key;
		}
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		
	}
}
