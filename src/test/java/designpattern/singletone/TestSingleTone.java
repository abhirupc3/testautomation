package designpattern.singletone;

public class TestSingleTone {
 public static void main(String[] args) {
	System.out.println(SingleTonePattern.getInstance());
	System.out.println(SingleTonePattern.getInstance());
}
}
