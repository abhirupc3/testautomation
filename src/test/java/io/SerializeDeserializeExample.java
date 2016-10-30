package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDeserializeExample implements Serializable{

	public String user;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public static void main(String[] args) {
		SerializeDeserializeExample s = new SerializeDeserializeExample();
		s.setUser("Abhirup");
		try {
			String filepath = new File("src/io/resource").getCanonicalPath();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filepath+"/serialize.txt")));
			oos.writeObject(s);
			// De-Serialize example
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath+"/serialize.txt"));
			SerializeDeserializeExample s2 = (SerializeDeserializeExample)ois.readObject();
			System.out.println(s2.getUser());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
