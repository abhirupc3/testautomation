package newPreperation.sort.comparable;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{

	public Integer age;
	public String name;
	public Dog(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Dog o) {
	//return	this.age.compareTo(o.age);
	//	return	this.age-o.age;
		
		return	this.name.compareTo(o.name);
	}
	
}