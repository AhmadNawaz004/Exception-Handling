//Java program to demonstrate FileNotFoundException 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader;

import java.*;
class File_notFound_Demo { 

	public static void main(String args[]) { 
		try { 

			// Following file does not exist 
			File file = new File("E:\\File.txt"); 

			FileReader fr = new FileReader(file); 
		} catch (FileNotFoundException e) { 
		System.out.println("File does not exist"); 
		} 
	} 
}
