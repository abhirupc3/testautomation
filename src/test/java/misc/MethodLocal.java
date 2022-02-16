package misc;

public class MethodLocal {
	public static void main(String[] args) {
		display();
	}
  public static void display()
  {
	  
	  class TestMe{
		 public void display()
		 {
			 System.out.println("hello Java Hi");
		 }
	  }
	  new TestMe().display();
  }
}
