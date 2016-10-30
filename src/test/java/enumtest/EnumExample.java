package enumtest;

public enum EnumExample {
scenario1("Abhirup","Chatterjee"),
scenario2("Abhirup2","Chatterjee2"),;
String userName;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
String password;
private EnumExample(String userName,String password){
	this.userName=userName;
	this.password=password;
}

}
