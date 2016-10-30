package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample  {

	private static String filePath ;
	private static String fileName="filewriterexample.txt";
	private static BufferedWriter bw;
	private static String s = "Hello Java , Writing to a file";
	public static void main(String[] args)  {
try{
		filePath = new File ("src/resource").getCanonicalPath();
		 bw = new BufferedWriter(new FileWriter(new File(filePath+"/"+fileName)));
		bw.write(s);
} catch(Exception e){e.printStackTrace();}
finally{
	try {
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
