package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take  Prime and Anagrams in the 0 to 1000 in that range using stack
 * date:1/03/2019
 * version:1.0
 */
import java.util.ArrayList;
import java.util.List;

//import com.bridgelabz.utility.AlgorithmUtility;

public class AnagramStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utility1 ut=new Utility1();
		
		StackLinkedList<Integer> stack=new StackLinkedList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		list=Utility1.primeNumbers(0, 1000);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
			if(Utility1.isAnagram(String.valueOf(list.get(i)),String.valueOf( list.get(j)))){
				 
				
				//com.bridgelabz.util package
				  stack.push(list.get(i));
				  stack.push(list.get(j));
			}
		}
}
		System.out.println("Printing the elements in reverse order using pop function of stack");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop()+"\t"+stack.pop());
		}
		
	}

}
