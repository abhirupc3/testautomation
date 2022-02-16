package io;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;

public class ReadFile_Usilg_Fileutils {

	private static String fileData;
	private static String filePath;
	private static String fileName="readFileutils.txt";
	public static void main(String[] args) {
		try {
		filePath = new File("src/resource").getCanonicalPath();
		fileData =null; //FileUtils.readFileToString(new File(filePath+"/"+fileName));
		System.out.println("The File Data Is :" + fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
