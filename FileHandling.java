package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandling {

	public static List<String> readFile(String fileName) {

		List<String> list = Collections.emptyList();
		try {

			list = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		System.out.println("Enter 1 to Read");
		System.out.println("Enter 2 to Write");
		System.out.println("Enter 3 to Append");

		System.out.println("Enter your choice: ");
		choice = sc.nextInt();

		if (choice == 1) {
			
			System.out.println("Enter file name");
			String fname=sc.next();
			List<String> result=readFile("D:\\TestFile\\"+fname);
			Iterator<String> it = result.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else if (choice == 2) {
			try {
				FileWriter fw = new FileWriter("D:\\TestFile\\NewFile.txt");
				fw.write("File writer wrote this file");
				fw.close();
				System.out.println("Done with writing");
			} catch (Exception e) {
				System.out.println("Exception");
			}
		} else if (choice == 3) {
			
			String filename = ("D:\\TestFile\\NewFile.txt");
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
				bw.write("This file has been Appended");
				bw.close();
				System.out.println("Appended");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}










//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner; 
//
//public class FileHandling {
//	public static List<String> readFile(String fileName) {
//		List<String> list = Collections.emptyList();
//		try {
//			list = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		System.out.println("1. Read");
//		System.out.println("2. write");
//		System.out.println("1. Append");
//		System.out.println("Enter choice");
//		
//		if(choice == 1) {
//			String fname = sc.next();
//			List<String> result = readFile("D:\\TestFile"+fname);
//			Iterator<String> it = result.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.hasNext());
//			}
//		}
//		else if (choice == 2) {
//			try {
//				FileWriter fw = new FileWriter("NewFile.txt");
//				fw.write("Hii Hello jyd,utdx");
//			    fw.close();
//			    System.out.println("File erite Done");
//			}
//			catch (Exception e) {
//				System.out.println("There are some excepyions");
//			}
//		}
//	else if (choice == 3) {
//		try {
//			String data = " Simpli learn ";
//			File f = new File("D:\\TestFile\\NewFile.txt");
//			if(!f.exists()) {
//				f.createNewFile();
//				
//			}
//			FileWriter fileWriter = new FileWriter(f.getName(),true);
//			BufferedWriter bw = new BufferedWriter(fileWriter);
//			bw.write(data);
//			bw.close();
//			System.out.println("Done");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
// }
//}
//



//import java.util.*;
//import java.io.*;
//import java.nio.*;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class FileHandling {
//	public static List<String> readFile(String fileName) {
//		List<String> list = Collections.emptyList();
//		try {
//			list = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		System.out.println("1. Read");
//		System.out.println("2. write");
//		System.out.println("1. Append");
//		System.out.println("Enter choice");
//		
//		if(choice == 1) {
//			String fname = sc.next();
//			List<String> result = readFile("D:\\TestFile"+fname);
//			Iterator<String> it = result.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.hasNext());
//			}
//		}
//		else if (choice == 2) {
//			try {
//				FileWriter fw = new FileWriter("NewFile.txt");
//				fw.write("Hii Hello jyd,utdx");
//			    fw.close();
//			    System.out.println("File erite Done");
//			}
//			catch (Exception e) {
//				System.out.println("There are some excepyions");
//			}
//		}
//	else if (choice == 3) {
//		try {
//			String data = " Simpli learn ";
//			File f = new File("D:\\TestFile\\NewFile.txt");
//			if(!f.exists()) {
//				f.createNewFile();
//				
//			}
//			FileWriter fileWriter = new FileWriter(f.getName(),true);
//			BufferedWriter bw = new BufferedWriter(fileWriter);
//			bw.write(data);
//			bw.close();
//			System.out.println("Done");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
// }
//}
