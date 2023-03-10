import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
	static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		try{
			File fileobj1 = new File("A:\\Assignment 10 Java\\create file\\file1.txt");
			if (fileobj1.createNewFile()) {
				System.out.println("File Methods");
				System.out.println("Successfully created file");
				print(fileobj1.getName());
				print(fileobj1.getPath());
				print(fileobj1.getAbsolutePath());
				print(fileobj1.getParent());
				print("size : "+fileobj1.length()+" bytes");
				print(fileobj1.exists()?"file exists":"file does not exists");
				print(fileobj1.canRead()?"file readable":"file not readable");
				print(fileobj1.canWrite()?"file writable":"file not writable");
				print(fileobj1.isDirectory()?"is a directory":"not a directory");
			}
			else {
				System.out.println("file already exists");
			}
		}
		catch(IOException e) {
			System.out.println("Error has occured");
			e.printStackTrace();
		}
		
		// Writing to a file
		try {
			FileWriter fileobjw = new FileWriter("A:\\Assignment 10 Java\\write file\\filew.txt");
			fileobjw.write("Abhishek Jain");
			fileobjw.write("\nWriting in the file");
			fileobjw.close();
		}
		catch(IOException e) {
			System.out.println("Error has occured");
			e.printStackTrace();
		}
		
		// Reading from a file
		try {
			System.out.println();
			System.out.println("Reading from the file");
			FileReader fileobjr = new FileReader("A:\\Assignment 10 Java\\write file\\filew.txt");
			Scanner obj = new Scanner(fileobjr);
			while (obj.hasNextLine()) {
				String s = obj.nextLine();
				System.out.println(s);
			}
			obj.close();	
		}
		catch(IOException e) {
			System.out.println("\nError has occured");
			e.printStackTrace();
		}
		
		// Reading and writing to a file 
		try {
			System.out.println();
			System.out.println("Reading from one file and storing its contents to another file");
			FileReader fr1 = new FileReader("A:\\Assignment 10 Java\\write file\\filew.txt");
			FileWriter fw1 = new FileWriter("A:\\Assignment 10 Java\\write file\\fw1.txt");
			int c;
			while ((c=fr1.read())!=-1) {
				System.out.print((char)c);
				fw1.append((char)c);
			}
			fr1.close();
			fw1.close();
		}
		catch(IOException e) {
			System.out.println("Error has occured");
			e.printStackTrace();
		}	
	}
}
