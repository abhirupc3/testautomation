package enumtest;

public class EnumTest1 {
public static void main(String[] args) {
	System.out.println(EnumExample.values()[0].getUserName());
	for(EnumExample s:EnumExample.values()){
		System.out.println(s.password);
	}
}
}
