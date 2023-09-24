package ToDelete;

public class Fact {
	int fact=1;
 public static void main(String[] args) {
	new Fact().fact(5);
	System.out.println(new Fact().factRecr(5));
}
 public void fact(int y)
 {
	 for(int i=1;i<=y;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("The value of fact is:");
	 System.out.println(fact);
 }
 
 public int factRecr(int y)
 {
	 if(y==0)
	 {
		 return 1;
	 }
	 fact=y*factRecr(y-1);
	 return fact;
 }
}
