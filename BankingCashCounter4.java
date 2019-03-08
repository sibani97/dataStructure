package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Banking Cash Counter where people come in to deposit Cash and withdraw Cash using 
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
//import java.util.Scanner;

import com.bridgelabz.utility.Utility;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.SAXConnector;

public class BankingCashCounter4 {
	public void bankCashCounter(double accBalance)
	{
		//Utility ut=new Utility();
		//Queue
		Queue<Double> queue = new Queue<Double>();
        
        System.out.println("1. Add person to the queue");
        System.out.println("2. remove person from the queue");
        //int choice1 = inputInt();
        int choice1=Utility.singleIntrgerInput();
        System.out.println("Enter your choice:");
        
        int count = 0;
        
        while(choice1 != 0)  
        {  
          //Switch case to add or remove person from the queue	
          switch(choice1)
          {
             case 1:
            	//To add person
        	        queue.enqueue();
        	        System.out.println("1. Deposit cash");
                    System.out.println("2. Withdraw cash");
                    System.out.println("Enter your choice:");
                    int choice = Utility.singleIntrgerInput();
                  
                    while(choice != 0)
                    {
                    //Switch case to deposit or withdraw money from bank	
                    switch(choice)
                    {
                    case 1:
                    	count++;
                        System.out.println("Enter the money you want to deposit:");
                        double deposit = Utility.singleDoubleInput();
                        if(deposit < 0) 
                        {
                            System.out.println("Enter valid amount to deposit");
                        }
                        else
                        {
                        	//total balance after deposit
                            accBalance = accBalance + deposit;
                            System.out.println("Updated account balance is: " + accBalance);
                        }  
                        System.out.println("1. Deposit cash");
                        System.out.println("2. withdraw cash");
                        System.out.println("3. Remove existing person from the queue");
                        System.out.println("Enter your choice:");
                        choice = Utility.singleIntrgerInput();
                        break;
                    case 2:
                    	count++;
        	            System.out.println("Enter the money you want to withdraw:");
                        double withdraw = Utility.singleDoubleInput();
                        if(withdraw < 0)        
                        {
                            System.out.println("Enter valid amount to withdraw");
                        }
                        else if(withdraw > accBalance)
                        {
                        	System.out.println("Enter ");
                        }
                        else
                        {
                        	//total balance after withdrawal
                            accBalance = accBalance - withdraw;
                            System.out.println("Updated account balance is: " + accBalance);
                        }
                        System.out.println("1. Deposit cash");
                        System.out.println("2. withdraw cash");
                        System.out.println("3. Remove existing person from the queue");
                        System.out.println("Enter your choice:");
                        choice = Utility.singleIntrgerInput();
                        break;
                    case 3:
                    	
                     	if(count == 0)
                     	 {
                   	    	System.out.println("Queue is empty, please add person to the queue"); 
                    		System.out.println("press 4 to add person:");
                    		choice = Utility.singleIntrgerInput();
                     	 }
                   	     else
                     	 {
                   	    	//to remove person
                   	        queue.dequeue();
                   	        count--;
                   	        System.out.println("Person is removed from the queue");
                 	    	System.out.println("press 4 to add person:");
                 	     	choice = Utility.singleIntrgerInput();
                   	     }  
                     	 break;
                    case 4:
                    	//To add person
                    	queue.enqueue();
            	        System.out.println("1. Deposit cash");
                        System.out.println("2. Withdraw cash");
                        System.out.println("Enter your choice:");
                        choice = Utility.singleIntrgerInput();
                     default:
        	                System.out.println("Enter valid choice to deposit, withdraw or remove person.");
                     }
                    }
             case 2:
            	 if(count == 0)
            	 {
            		System.out.println("Queue is empty, please add person to the queue"); 
           	    	System.out.println("press 1 to add person:");
           	    	choice1 =Utility.singleIntrgerInput();
            	 }
            	 else
            	 {
                   //to remove person
            	   queue.dequeue();
            	   count--;
            	   System.out.println("Person is removed from the queue");
        	       System.out.println("press 1 to add person:");
        	       choice1 = Utility.singleIntrgerInput();
            	 }
            	 break;
              default:
              {
            	 System.out.println("Enter valid choice to add or remove person from queue.");
              }
           } 
	    }  
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingCashCounter4 bank=new BankingCashCounter4();
		System.out.println("welcome to the Bank");
		double accBalance=20000;
		System.out.println("saving balance"+accBalance);
		bank.bankCashCounter(accBalance);
		
	}

}
