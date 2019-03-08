package com.bridgelabz.Datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stack {
	static int top=0;
	
	 char arr[];
		 
	
	public  void push(char data)
	{
		if(top==arr.length)
		{
			System.out.println("stack is full");
		}
		else
		{
			arr[top]=data;
			top++;
		}
		
	}
	public  void show()
	{
		for(char n:arr)
		{
			System.out.println(n+"");
		}
	}
	public char pop()
	{
		char data;
		top--;
		data=arr[top];
		arr[top]=' ';
		return data;
	}
	public  char peek() 
	{
		char data;
		data=arr[top-1];
		return data;
	}
	public static boolean isEmpty() 
	{
		return top<=0;
	}
	}

