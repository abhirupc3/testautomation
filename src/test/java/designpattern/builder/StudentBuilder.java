package designpattern.builder;

public class StudentBuilder {
  String firstName;
  public String getFirstName() {
	return firstName;
}
public StudentBuilder setFirstName(String firstName) {
	this.firstName = firstName;
	return this;
}
public String getLsateName() {
	return lsateName;
}
public StudentBuilder setLsateName(String lsateName) {
	this.lsateName = lsateName;
	return this;
}
public String getMiddleName() {
	return middleName;
}
public StudentBuilder setMiddleName(String middleName) {
	this.middleName = middleName;
	return this;
}
public String getAge() {
	return age;
}
public StudentBuilder setAge(String age) {
	this.age = age;
	return this;
}
public Student build()
{
   return new Student(this.firstName,this.lsateName,this.middleName,this.age);
}
String lsateName;
  String middleName;
  String age;
}
