package misc.delete;

public class Fact {

	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	private static int fact(int i) {
		
		if(i==0||i==1)
			return i;
		return i*fact(i-1);
	}
}
