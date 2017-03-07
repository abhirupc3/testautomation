package misc;

public class String_Rev_recruicive {

	public static void main(String[] args) {
         System.out.println(rec("Hello Java World Hi"));
	}
	
	public static  String rec(String s){
		
		char c = s.charAt(s.length()-1);
		if(s.length()==1) return Character.toString(c);
		return c+rec(s.substring(0,s.length()-1));
	}

}
