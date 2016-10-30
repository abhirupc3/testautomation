package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpytStreamExample {
	private static String filePath ;
	private static String fileName="fileoutput_stream_example.txt";
	private static String ln;
	private static BufferedWriter bw;
	private static FileOutputStream foStream;
	private static String s = "Hello Java , Writing to a file using outputStream";
	public static void main(String[] args) {

		try{
		filePath=new File("src/resource").getCanonicalPath();
		foStream = new FileOutputStream(new File(filePath+"/"+fileName));
		foStream.write(s.getBytes());
		}catch(Exception e){
			e.printStackTrace();
		} finally{
			
			try {
				foStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
