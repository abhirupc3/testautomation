package misc;

import java.util.Scanner;
/*
 * THIS CLASS WILL SHOW AN EXAMPLE TO WRITE DATA TO PROPERTY FILE
 */
public class ScannerExample {

	public static void main(String[] args) {

		System.out.println("Enter the first String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("The Entered First String is: "+s);
		System.out.println("Enter the second String");
		System.out.println(sc.next());
	}

}
