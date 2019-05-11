package testnge2e.factory;

import org.testng.annotations.Factory;

public class TestNGFactory {

	@Factory()
	public Object[] getTestClasses() {
		Object[] tests = new Object[3];
		tests[0] = new Test1(1);
		tests[1] = new Test1(2);
		tests[2] = new Test2();
		return tests;
	}
	
}