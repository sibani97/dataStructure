package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Read the Text from a file, split it into words and arrange it as Linked List.
   Take a user input to search a Word in the List.
 * date:1/03/2019
 * version:1.0
 */


//import sun.tools.asm.CatchData;

public class UnorderedList {
	static Node start;
	Node head=start;
	
	Utility1 u1=new Utility1();
	ListUtility1 ul=new ListUtility1();
	public UnorderedList()
	{ 
//		try {
		
		//start=ul.readFile(start);
		head = ul.readFile(head);
		System.out.println("enter the word to search");
		String word1=u1.inputString();
		
	
		
		//start=ul.searchData(start, word1);
		head=ul.searchData(head, word1);
		String word2="";
		//while(start!=null)
		while(head!=null)
		{
			//word2=word2+start.data;
			word2=word2+head.data1+" ";
			//word2=word2+"";
			String word3=word2+"";
			//start=start.nextNode;
			head=head.nextNode;
		}
		
		System.out.println(word2);
		ul.writeDataToFile(word2);

	
	}

	

	public static void main(String[] args) {
		UnorderedList lu=new UnorderedList();

	}

}
