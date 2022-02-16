package misc.delete;

public class Rev {
		public static void main(String[] args) {
			System.out.println(revString("Abhirup"));
		}

		private static String revString(String text) {
			String rev="";
			for(int i=text.length()-1;i>=0;i--)
			{
				rev=rev+text.charAt(i);
			}
			return rev;
		}
}
