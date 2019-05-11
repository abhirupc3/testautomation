package testnge2e;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

public class DataProvidr {
	@DataProvider(name = "dp")
	public Object[][] tedtDataProvider() {
/*
		Object[][] st = new Object[2][3];
		ArrayList<Object> aList = new ArrayList<Object>();
		aList.add("15,5,20");
		aList.add("20,22,42");
		for (int i = 0; i < 2; i++) {
			String[] s = aList.get(i).toString().split(",");
			for (int j = 0; j < 3; j++) {
				st[i][j] = s[j];
			}
		}
		return st; */

		Object[][] obj = new Object[][] { { 5, 15, 12 }, { 20, 22, 42 } };
		return obj;
	}
}
