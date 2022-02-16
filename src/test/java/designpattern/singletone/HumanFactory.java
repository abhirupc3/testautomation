package designpattern.singletone;

public class HumanFactory {

	public static Human getHuman(HumanBeing gender){
		
		if(gender.name().equalsIgnoreCase("male"))
		{
			return new Male();
		}else if(gender.name().equalsIgnoreCase("female")){
			return new Female();
		} else return null;
	}

}
