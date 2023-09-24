package amazon;

public class LongestPallinodrome {
 public static void main(String[] args) {
	String s = "madam";
	isPallon(s);
}

private static void isPallon(String s) {

	char[] str = s.toCharArray();
	int p=0;
	int q=0;
	while(p<q)
	{
		if (str[p]==str[q])
		{
			p=p+1;
			q=q-1;
		}
		else {
			
		}
	}
}
}
