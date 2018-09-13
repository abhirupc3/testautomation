package newPreperation.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByAge {

	public static void main(String[] args) {

		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("Messy",5));
		dogList.add(new Dog("Bosky",1));
		dogList.add(new Dog("Dev",3));
		dogList.add(new Dog("Moul",2));
		Collections.sort(dogList);
		for (Dog dog : dogList) {
			System.out.println(dog.getAge()+"******"+dog.getName());
		}
	}

}
