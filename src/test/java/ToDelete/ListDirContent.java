package ToDelete;

import java.io.File;

public class ListDirContent {
	private File[] fileArray;

	public static void main(String[] args) {
		String path = "C:/SIE/To_Be_Deleted";
		ListDirContent listdirCont = new ListDirContent();
		listdirCont.listFiles(path);
	}

	/**
	 * This method lists all the file name in the given directory and all it sub
	 * directories
	 * 
	 * @param path
	 */
	public void listFiles(String path) {
		fileArray = listFolderContent(new File(path));
		for (File file : fileArray) {
			if (isFile(file)) {
				System.out.println(file.getName());
			} else {
				listFiles(file.getAbsolutePath().toString());
			}
		}
	}

	private File[] listFolderContent(File dir) {
		File[] fList = dir.listFiles();
		return fList;
	}

	private boolean isFile(File file) {
		return file.isFile();
	}
}
