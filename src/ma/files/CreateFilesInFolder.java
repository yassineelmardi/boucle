package ma.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFilesInFolder {
	public static void main(String[] args) {
//		String classpath = System.getProperty("java.class.path");
		Path path =Paths.get(".\\file\\dfgd\\gfg");
		System.out.println(path.toAbsolutePath().normalize());
		System.out.println(System.getProperty("java.vendor.url"));
		
		try {
			Files.createDirectories(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String[] fileList = { classpath+"\file1.txt", classpath+"/subdir/file2.txt", classpath+"\file3.txt" };
//		for (String file : fileList) {
//			try {
//				new File(file).mkdirs();
//			} catch (Exception e) {
//				System.out.println("file creation failed");
//				System.exit(-1);
//			}
//		}
	}
}
