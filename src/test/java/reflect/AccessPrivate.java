package reflect;

import java.lang.reflect.Method;

public class AccessPrivate {
 public static void main(String[] args) throws Exception  {
	Class[] c = {Integer.class,Integer.class,String.class};
	Object[] o = {12,13,"Hello Java"};
	String mName = "add";
	Method m = SampleClass.class.getDeclaredMethod(mName, c);
	System.out.println(m.getName());
	m.setAccessible(true);
	SampleClass sc = new SampleClass();
	int rus = (Integer)m.invoke(sc, o);
	System.out.println(rus);
	
	Method s[] = SampleClass.class.getDeclaredMethods();
	System.out.println("Declared methods are :");
	for (Method mm : s) {
		System.out.println(mm.getName());
	}
	Method s1[] = SampleClass.class.getMethods();
	System.out.println("Methods Are : \n");
	for (Method mm1 : s1) {
		System.out.println(mm1.getName());
	}
}
}
