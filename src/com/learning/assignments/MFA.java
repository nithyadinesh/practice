package com.learning.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MFA {
	private static final String DIRECTORY_PATH = "D:\\jlearn\\";
	private static final int MINIMUM_NO_OF_TOKENS = 3;

	public static void main(String[] args) {

		try {

			if (args.length > 0 && args[0].equals("help")) {
				printHelpMessage();
			} else if (args.length == 0) {

				getFileNames(DIRECTORY_PATH);
			}

			else {
				final String originalFileName = args[0];

				printFirstLineAndRemove(originalFileName, true);
			}
		} catch (final IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}

	}

	private static void printHelpMessage() {
		System.out.println(
				"mfa filename - prints the first line from the text file and remove the line from the text file");
	}

	private static void printFirstLineAndRemove(final String originalFileName, boolean appendFileExtention)
			throws FileNotFoundException, IOException {
		final String tmpdir = System.getProperty("java.io.tmpdir");

		File originalfile;
		if (appendFileExtention) {
			originalfile = new File(DIRECTORY_PATH + originalFileName + ".txt");
		} else {
			originalfile = new File(DIRECTORY_PATH + originalFileName);

		}
		final Scanner myreader = new Scanner(originalfile);

		final String newFileName = tmpdir + "\\file1.txt";

		final FileWriter temporaryFileWriter = new FileWriter(newFileName);

		boolean isFirstLine = true;
		int counter = 0;
		while (myreader.hasNext()) {
			final String nextToken = myreader.nextLine();
			if (isFirstLine) {

				System.out.println(nextToken);
				isFirstLine = false;
				continue;
			}

			temporaryFileWriter.write(nextToken);
			temporaryFileWriter.write("\n");

			counter++;

		}
		if (counter < MINIMUM_NO_OF_TOKENS) {
			System.out.println("MFA tokens available are less than three please replenish");
		}

		temporaryFileWriter.close();
		myreader.close();
		originalfile.delete();
		final File newFile = new File(newFileName);
		newFile.renameTo(originalfile);
	}

	private static void getFileNames(String path) throws FileNotFoundException, IOException {
		final File folder = new File(path);
		final File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			System.out.println((i + 1) + " " + listOfFiles[i]);
		}

		final Scanner fileIndex = new Scanner(System.in);
		System.out.println("please select the index of File to be executed");
		final int num = fileIndex.nextInt();
		while (num >= 1 && num <= listOfFiles.length) {

			final String fileName = listOfFiles[num - 1].getName();
			printFirstLineAndRemove(fileName, false);
			break;
		}

		/*
		 * for (final File listOfFile : listOfFiles) { if (listOfFile.isFile()) {
		 * System.out.println("File " + listOfFile.getName()); } }
		 */
	}
}
