package misc.helper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleBean {
String userName;
String password;
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
}
