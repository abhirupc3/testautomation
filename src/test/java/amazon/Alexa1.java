package amazon;

public class Alexa1 {
 public static void main(String[] args) {
	int[] a = {12,12,13,14,15,16,17};
	boolean exit =false;
	for (int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.println("i value "+i);
			System.out.println("j value "+j);
			exit=true;
			break;
		}
		if(exit)
			break;
	}
}
}
