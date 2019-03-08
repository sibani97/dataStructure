package com.bridgelabz.Datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StackUtility {
	
public static boolean balanceparentheses(String exp)
{
	int len=exp.length();
	
	Stack stack=new Stack(len);

	try {
	char exparr[]=exp.toCharArray();
	int ch=0;
	for(int i=0;i<=exparr.length;i++)
	{
		if(exparr[i]=='('||exparr[i]=='{'||exparr[i]=='[')
		//if(exparr[i]=='(')
		{
			//Stack.push(exparr[i]);
			stack.push(exparr[i]);
			
			
		}
		else if(exparr[i]==')'||exparr[i]=='}'||exparr[i]==']')
		//else if(exparr[i]==')')
		{
			
			 ch=stack.pop();
			
			switch(ch)
		    {
		    case ')':
		    	if(ch != '(');  
				return false;
		    case '}':
		    	if(ch != '{');  
				return false;
		    case ']':
		    	if(ch != '[');  
		    	return false;

		}
	}
		
	
	
	}
}
catch(NullPointerException np)

{
	np.printStackTrace();
}
	return stack.isEmpty();
}}


