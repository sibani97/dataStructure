package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
  Store the prime numbers in a 2D Array
 * date:1/03/2019
 * version:1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Prime2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility1 utility=new Utility1();
		List<Integer>list=new ArrayList<Integer>();
		int start=0;
		int end=100;
		for(int i=0;i<10;i++)
		{
			List<Integer>listPrime=utility.primeNumbers(start, end);
			list.addAll(listPrime);
			start+=100;
			end+=100;
		}
		for(int i=0;i<list.size();i++)
		{
			
			int primeno=list.get(i);
			System.out.print(primeno+"\t");
			
		}

	}

	
}
