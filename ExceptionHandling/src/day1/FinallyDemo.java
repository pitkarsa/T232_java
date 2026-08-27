package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {
		// create the fis, we will read file, close them
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("data.txt");// fis object creation
			int content = fis.read();
			System.out.println("file contents are:"+content);
//			fis.close();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			try {
//				fis.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		}
		finally {
			// resource(object) closing code
			// it gets executed irrespective of exception
			System.out.println("within finally");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
