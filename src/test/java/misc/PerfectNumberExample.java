package misc;

public class PerfectNumberExample {
public static void main(String[] args) {
	int n = 28;
	System.out.println("28 is a perfect Number : "+isPerfect(n));
	System.out.println("29 is a perfect Number : "+isPerfect(29));
}

private static boolean isPerfect(int n) {
	int sum=0;
	for(int m=1;m<n;m++)
	{
		if(n%m==0)
		sum=sum+m;
	}
	
	return sum==n;
}
}
