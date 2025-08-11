package day11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("C:\\\\Wipro\\\\Wipro_JavaSelenium.txt")) {
			writer.write("Hello, Java Selenium Batch 7 File Handling!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
