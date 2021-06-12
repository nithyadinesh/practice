package com.learning.samples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filewriter {

	public static void main(String[] args) {

		try {
			final File obj = new File("C:\\Users\\dinesh.ilangovan\\Desktop\\jlearn\\newfile.txt");
			final Scanner filename = new Scanner(obj);
			while (filename.hasNextLine()) {
				final String content = filename.nextLine();
				System.out.println("content of file is : " + content);
			}
			filename.close();
		} catch (final FileNotFoundException e) {
			System.out.println("problem in creating file");
			e.printStackTrace();
		}

	}

}
