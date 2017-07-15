package com.tanu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CoptBytes {

	public static void main(String args[]) throws FileNotFoundException {

		/*
		 * FileInputStream fileInputStream =null; FileOutputStream
		 * fileOutputStream =null;
		 */
		try (
				FileOutputStream fileOutputStream = new FileOutputStream("D:/outputFile.txt");
						FileInputStream fileInputStream = new FileInputStream("D:/inputFIle.txt")) {
			while (fileInputStream.read() != -1) {
				fileOutputStream.write(fileInputStream.read());
				System.out.println(fileInputStream.read());
				System.out.println((char) fileInputStream.read());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}