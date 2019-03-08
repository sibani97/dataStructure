package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Take an Arithmetic Expression,where parentheses are used to order the performance of operations 
 * date:1/03/2019
 * version:1.0
 */
public class BalancedParanCstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the arithmetic expression");
		String a_exp=CustomLinkedList.userString();
		
		//Method 1- using static function of Utility class of
		//com.bridgelabz.util package
		boolean rs=Utility2.isBalanced(a_exp);
		
		if(rs)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}
	

}
