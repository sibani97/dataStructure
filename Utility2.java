package com.bridgelabz.Datastructure;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility2 {
	public static int factorial(int nodes){ 
	    if(nodes==0)
	    	return 0;
	    return nodes*factorial(nodes-1); 
	} 
	  
	/**
	 * Function that finds the bionomial co effecient of a number
	 * 
	 * @param nodes the number whose binomial co efficient is to be found
	 * @param k the number
	 * @return the number that represents the binomial coeff
	 */
	public static int binomialCoeff(int nodes, int k){ 
	    int res = 1; 
	    if (k > nodes - k) 
	        k = nodes - k; 
	    for (int i = 0; i < k; ++i){ 
	        res *= (nodes - i); 
	        res /= (i + 1); 
	    } 
	    return res; 
	} 
	  
	/**
	 * FUnction that calculates the catalan number of a number
	 * 
	 * @param nodes the number whose catalan number is to be found
	 * @return the catalan number
	 */
	//Count the number of possible Binary Search Trees with n keys 
	public static int catalan( int nodes) 
	{
	    int c = binomialCoeff(2 * nodes, nodes); 
	    return c / (nodes + 1); 
	} 

	/**
	 * Function that counts the number of binary search trees are possible
	 * for a given number of nodes
	 * 
	 * @param nodes the number of nodes
	 * @return the count of binary search tree
	 */
	public static int numberOfBST(int nodes){
		int count = catalan(nodes); 
		return count; 
	}
	
	/**
	 * Function that checks if the prime numbers are anagram or not
	 * 
	 * @param new_lst the list of prime numbers 
	 * @return the list of prime numbers that are anagram
	 */
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
	
	/**
	 * Function that prints the list of prime numbers that are anagram 
	 * 
	 * @param list of prime numbers that anagram 
	 */
	public static void printPrimeAndAnagram(List<List<Integer>> list)
    {
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            aList = list.get(i);
            if (i == 0) {
                System.out.println("Numbers which are prime and anagram are:"+aList.size());
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            } else {
                System.out.println("Numbers which are prime but not anagram are:"+aList.size());
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
	
	/**
	 * Function to sort any kind of data
	 * 
	 * @param array the array of any type that needs to be sorted
	 * @return the array that is sorted
	 */
	public static <T extends Comparable<T>> T[] sort(T[] array) {
		T temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

	/**
	 * Function that checks whether the parantheses in a arithematic
	 * expression is balanced or no
	 * 
	 * @param str the arithematic expression 
	 * @return true if balanced else false
	 */
	public static boolean isBalanced(String str){
	    if (str.isEmpty())
	        return true;
	    StackLinkedList<Character> stack = new StackLinkedList<Character>();
	    for (int i = 0; i < str.length(); i++){
	        char current = str.charAt(i);
	        if (current == '('){
	            stack.push(current);
	            System.out.println("element is pushed"+current);
	        }
	        if (current == ')'){
	            if (stack.isEmpty())
	                return false;
	            char last = stack.peek();
	            if (current == ')' && last == '(')
	            {
	                stack.pop();
	            System.out.println("element is poped"+current);
	            }
	            else 
	                return false;
	        }
	    }
	    return stack.isEmpty();
	}
	
	/**
	 * Function that writes the data into the file
	 * 
	 * @param sorted the sorted array of elements
	 * @param filename the name of the file to be write on
	 * @throws IOException throws input/output exception
	 */
	public static void fileWriter(String[] sorted,String filename) throws IOException{
		FileWriter fw=new FileWriter(filename);
		for(String str:sorted){
			if(str!=null){
				fw.write(str);
				fw.write(",");
			}
		}
		fw.close();
}
	}
