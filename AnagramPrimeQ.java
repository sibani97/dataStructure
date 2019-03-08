package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take  Prime and Anagrams in the 0 to 1000 in that range using Queue
 * date:1/03/2019
 * version:1.0
 */
import java.util.ArrayList;
import java.util.List;

public class AnagramPrimeQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utility1 ut=new Utility1();
		List<Integer> list=new ArrayList<Integer>();
		Queue1<Integer> queue=new Queue1<Integer>();
		list=Utility1.primeNumbers(0, 1000);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(Utility1.isAnagram(String.valueOf(list.get(i)),String.valueOf(list.get(j))))
				{   
					//queue.enqueue(list.get(i));
					queue.insert(list.get(i));
					queue.insert(list.get(j));
					
					
					}
			}

		}
		System.out.println("Elements in a queue are :");
                //Method 4- using function of Queue class of
		//com.bridgelabz.util package
queue.display();

	}

}
