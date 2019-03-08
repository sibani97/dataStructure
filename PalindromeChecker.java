package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take string,A palindrome is a string that reads the same forward and backward We would like to construct an algorithm to input a string of characters
 *  and check whether it is a palindrome.
 * date:1/03/2019
 * version:1.0
 */
import com.bridgelabz.utility.Utility;

public class PalindromeChecker {
	public static boolean checkPalindrome(String word)
	{
		int size=word.length();
		boolean isPalindrome=true;
		
		Deque<Character> d=new Deque<>();
		char[] ch=word.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			d.addRear(ch[i]);
			
		}
		for(int i=0;i<ch.length/2;i++)
		{
			if(d.removeFront()!=d.removeRear())
			{
				isPalindrome=false;
				break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility uility=new Utility();
		PalindromeChecker pal=new PalindromeChecker();
		System.out.println("enter the word for palindrome");
		String word=Utility.singleStringInput();
		boolean isPalindrome=pal.checkPalindrome(word);
		if(isPalindrome)
		
			System.out.println("word is palindrome"+word);
		else
			System.out.println("word is not palindrome"+word);
		

	}

}
