package misc;

public class FiboExample {
	public static void main(String[] args) {

		int prev=0;
		int present =1;
		System.out.println(prev);
		System.out.println(present);
		for (int k=0;k<8;k++)
		{
			int next = prev+present;
			System.out.println(next);
			prev=present;
			present=next;
		}
	}
}
