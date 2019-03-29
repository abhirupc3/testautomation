package misc;

public class StaticClassExample {
	public static class StaticInner{
		public void display()
		{
			System.out.println("Hello display");
		}
	}
  public static void main(String[] args) {
	 new StaticClassExample.StaticInner().display();
}
}
