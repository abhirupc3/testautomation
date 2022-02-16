package designpattern.singletone;

public class SingleTonePattern {

	public static final SingleTonePattern st=new SingleTonePattern();
	private SingleTonePattern()
	{
		
	}
	public static SingleTonePattern getInstance()
	{
	 	return st;
	}
}
