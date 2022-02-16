package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample  {

	private static String filePath ;
	private static String fileName="filereaderexample.txt";
	private static String ln;
	private static BufferedReader br;
	public static void main(String[] args)  {
try{
		filePath = new File ("src/resource").getCanonicalPath();
		 br = new BufferedReader(new FileReader(new File(filePath+"/"+fileName)));
		
		while((ln=br.readLine())!=null){
			
			System.out.println(ln);
		}
} catch(Exception e){e.printStackTrace();}
finally{
	try {
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
