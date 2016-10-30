package testnge2e;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testnge2e.custanno.DataSet;
import testnge2e.custanno.MyTest;
import testnge2e.custanno.MyTestNGAnnotation;
public class TestCalc {
	@Test(dataProvider="dp",dataProviderClass=DataProvidr.class, groups="bat")
	public void testAdd(Object x, Object y, Object result){
		Assert.assertEquals((Integer.parseInt(x.toString())+Integer.parseInt(y.toString())), Integer.parseInt(result.toString()));
	}
	final String s="chatterjeeEE123";
	@Test(groups="bat")
	@MyTestNGAnnotation(name="Abcd",city="LA",state="CA")
	public void testMe()
	{
		System.out.println(DataSet.city);
		System.out.println(DataSet.name);
		System.out.println(DataSet.state);
		Assert.assertTrue(true);
	}
	@Test(groups="bat")
	@Parameters("Name")
	@MyTestNGAnnotation(name="CRACK",city="BC",state="CA12")
	public void testMe1(String Name)
	{
		System.out.println(DataSet.city);
		System.out.println(DataSet.name);
		System.out.println(DataSet.state);
		System.out.println(Name);
		Assert.assertTrue(true);
	}
	@Test
	@MyTest(enable=true)
	public void tMe()
	{
		System.out.println("Hello Java World");
	}
	
}
