package com.bridgelabz.Datastructure;

import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	private int read;

	public FileInputStreamDemo(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStreamDemo fis=null;
		int available=0;
		int i=0;
		try
		{
			fis=new FileInputStreamDemo("/home/admin1/eclipse-workspace/FirstProject/src/file.txt");
			while((i = fis.read)!=-1) {
		         
	            // available bytes
	            available = fis.available();
	            
	            
	            // convert integer to character
	            char c = (char)i;
	            
	            // prints
	            System.out.print("Available: "+available);
	            System.out.println("; Read: "+c);
	         }
	         
	      } catch(Exception ex) {
	         // if an I/O error occurs
	         ex.printStackTrace();
	      } /*finally {
	         // releases all system resources from the streams
	         if(fis!=null) {
	            fis.close();
	         }*/
		}

	private int available() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
