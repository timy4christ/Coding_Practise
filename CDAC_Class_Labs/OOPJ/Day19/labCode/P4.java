// write a program to extract all valid phone numbers from a file

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


class P4{
	
	public static void main(String[] args){
		File fin = new File("input.txt");
		File fout = new File("output.txt");
		
		if(!fin.exists()){
			System.out.println("File not found");
			return;
		}
		
		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fin);
		
		
		
		
		
		
	}
	
}