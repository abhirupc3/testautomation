package misc;

public class SwapNumbers {

	public static void main(String[] args) {

		int x=10;
		int y=12;
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("x->"+x+"  y->"+y);
	}

}
