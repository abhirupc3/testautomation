package misc;

public class String_Rev_recruicive {

	public static void main(String[] args) {
         System.out.println(rec("Abhirup"));
	}
	
	public static  String rec(String s){
		
		if(s.length()==1)
		{
			return s;
		}
		return s.charAt(s.length()-1)+rec(s.substring(0,s.length()-1));
	}

}
