package trash;

public class Grasshopper {
	 public Grasshopper(String n) {
	 name = n;
	 }
	public static void main(String[] args) {
	 Grasshopper one = new Grasshopper("g1");
	 Grasshopper two = new Grasshopper("g2");
	 one = two;
	 two = null;
	 one = null;
	 int y = 10;
	 int x; // x is declared here
	 x = 3; // and initialized here
	 int reply = x + y;
	
}
	 private String name;
}