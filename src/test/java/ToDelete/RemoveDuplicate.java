package ToDelete;

public class RemoveDuplicate {
	static String s = "Hello Java World";
	static String sNew = "";

	public static void main(String[] args) {
		removeDuplicate(s);
	}

	public static void removeDuplicate(String u) {
		for (int i = 0; i < u.length(); i++) {
			if (!sNew.contains(String.valueOf(u.charAt(i)))) {
           sNew=sNew+String.valueOf(u.charAt(i));
			}
		}
		System.out.println("Before removal:");
		System.out.println(s);
		System.out.println("After removal:");
		System.out.println(sNew);
	}
}
