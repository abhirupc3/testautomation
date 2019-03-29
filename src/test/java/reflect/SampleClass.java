package reflect;

import org.omg.Messaging.SyncScopeHelper;

public class SampleClass {

	private String field1 = "Hello";
	private int add(Integer i, Integer j,String mess)
	{
		System.out.println("messag Is :   "+mess);
		return i+j;
	}
	private void display()
	{
		System.out.println("Hello World");
	}
}
