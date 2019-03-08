package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take  Prime and Anagrams in the 0 to 1000 in that range
 * date:1/03/2019
 * version:1.0
 */
import java.util.ArrayList;
import java.util.List;

public class AnagramPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int start=0;
		int end=1000;
		List<Integer> list1=Utility1.primeNumbers(start, end);
		List<Integer> list2=Utility1.anagramPrime(list1);
		List<Integer> list3=new ArrayList<>();
		//list3.add(list2);
		list3.addAll(list2);
		list.add(list3);
		for(int i=0;i<list3.size();i++)
		{
			if(list1.contains(list3.get(i)));
			{
				list1.remove(list3.get(i));
			}
		}
        list.add(list1);
		Utility1.printPrimeAndAnagram(list);

	}

	
}
