package singletone;

public class HumanFactory {

	public static Human getHuman(String gender){
		if(gender.equalsIgnoreCase("male"))
		{
			return new Male();
		}else if(gender.equalsIgnoreCase("female")){
			return new Female();
		} else return null;
	}

}
