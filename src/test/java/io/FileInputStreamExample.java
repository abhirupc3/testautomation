package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	private static FileInputStream fis ;
    private static String filePath;
    private static String fileName="fileinput_stream_example.txt";
	public static void main(String[] args) {

		try{
		filePath = new File("src/resource").getCanonicalPath();
		fis = new FileInputStream(new File(filePath+"/"+fileName));
		int c=0;
		while((c = fis.read())!=-1)
		{
			System.out.print((char)c);
		}
		} catch(Exception e){e.printStackTrace();}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
