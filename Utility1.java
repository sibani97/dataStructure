package com.bridgelabz.Datastructure;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


//import com.sun.tools.javac.util.List;

public class Utility1 {
BufferedReader br;
	
	//private final String s_name="<<name>>";
	//private final String s_fullname="<<name>>";
	//private final String s_mobileno="<<name>>";
	//private final String s_date="<<name>>";
	public Utility1(){
		br = new BufferedReader(new InputStreamReader(System.in));
		
	}

	public String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
}
	public int inputInteger(){
		try{
			try{	
				return Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0;
}
	public double inputDouble(){
		try{
			try{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0.0;
}
	
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
}
	//LeapYear search
	public  static boolean checkLeapYear(int y)
	{
		
		    //To make sure input year contains 4 digit 
			//If the year is completely divisible by 4 then it's a leap year. 
			if(y>1000 && y<10000 && y%4==0)
			{
				System.out.println(y + " is a leap year"); 
				return true;//year is leap year
			}
		    else if(y>1000 && y<10000 && y%4 != 0)
			{
				System.out.println(y + " is a not leap year"); 
				return false;//year is not leap year
			}
		    else
			{
				System.out.println("Please enter 4 digit number to check leap year");
				return false;
			}
	
}
	public static int calander(int m,int d,int y)
	{
		int y0 = y - ((14 - m) / 12);
 		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
 		int m0 = m + 12 * ((14 - m) / 12) - 2;
 		int d0 = (d + x + (31 * m0 / 12)) % 7;
        return d0; 	
	}
	//prime number search
	public static List<Integer>primeNumbers(int start,int end)
	{
	List<Integer>list=new ArrayList<Integer>();
	int flag=1;
	for(int i=start+2;i<end;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
			}
			else
				flag=1;
		}
		if(flag==1)
		{
			list.add(i);
		}
	}
	return list;
		
	}
	//anagram detect
	public static boolean isAnagram(String str1,String str2) {
		char[] array1=str1.toCharArray();
		char temp1,temp2;
		char[] array2=str2.toCharArray();
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			return false;
		}
		else{
			for(int i=0;i<len1;i++){
				for(int j=0;j<len1-1;j++){
					if(array1[j]>array1[j+1]){
						temp1=array1[j];
						array1[j]=array1[j+1];
						array1[j+1]=temp1;
					}
				}
			}
			for(int i=0;i<len2;i++){
				for(int j=0;j<len2-1;j++){
					if(array2[j]>array2[j+1]){
						temp2=array2[j];
						array2[j]=array2[j+1];
						array2[j+1]=temp2;
					}
				}
			}
			str1=String.valueOf(array1);
			str2=String.valueOf(array2);
			if(str1.equals(str2))
				return true;
			else
				return false;
		}	
}
	//call checkanagram method from anagramprime method
	
	public static List<Integer> anagramPrime(List<Integer> new_lst){
		List<Integer> listOfAnagrams=new ArrayList<Integer>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(Utility1.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
					listOfAnagrams.add(new_lst.get(i));
					listOfAnagrams.add(new_lst.get(j));
					System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
				}
			}
		}
		return listOfAnagrams;
	}
	
	public static void printPrimeAndAnagram(List<List<Integer>> list)
    {
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            aList = list.get(i);
            if (i == 0) {
                System.out.println("Numbers which are prime and anagram are:");
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            } else {
                System.out.println("Numbers which are prime but not anagram are:");
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            }
            System.out.println();
        }
}

}


