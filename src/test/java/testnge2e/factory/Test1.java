package testnge2e.factory;

import org.testng.annotations.Test;

public class Test1 {
 int i =0;
 public Test1(int i)
 {
	 this.i = i;
 }
	@Test
	public void test1() {
		System.out.println("Test1 test method"+i);
	}
}