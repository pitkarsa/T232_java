package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
	public static void main(String[] args) {
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.readFile();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readFile() throws IOException, SQLException {
		FileInputStream fis = new FileInputStream("data1.txt");
		int content = fis.read();
		System.out.println("File contents");		
	}
}
