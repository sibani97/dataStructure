package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Number of Binary Search Tree
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of test cases");
		int ch=CustomLinkedList.userInt();
		List<Integer> lst=new ArrayList<Integer>();
		int i=0;
		while(i<ch){
			System.out.println("Enter the number of nodes");
			int nodes=CustomLinkedList.userInt();
			
			//Method 1- using function of Utility class of
			//com.bridgelabz.util package
			int res=Utility2.numberOfBST(nodes);
			
			lst.add(res);
			i++;
		}
		System.out.println("The number of binary search tree for the following nodes are:");
		System.out.println(lst);

	}

}
