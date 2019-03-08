package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Write a program Calendar that takes the month and year as command-line arguments using Stack
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
public class CalenderStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		if (month == 2 && Utility1.checkLeapYear(year))
		days[month] = 29;
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
		
		//com.bridgelabz.util package
		int d = Utility1.calander(month, 1, year);
		
		//Customized stack
		StackLinkedList<Queue1<Integer>> customStack= new StackLinkedList<Queue1<Integer>>();
		
		//Customized Queue
		Queue1<Integer> queue=new Queue1<Integer>();
		
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) {
		
			//Method 3- using function of Queue class of
			//com.bridgelabz.util package
			queue.insert(i);
			
			if (((i + d) % 7 == 0) || (i == days[month])) {
				
				//Method 4- using function of StackLinkedList class of
				//com.bridgelabz.util package
				customStack.push(queue);
				
				queue = new Queue1<Integer>();
				continue;
			}
		}
		
		StackLinkedList<Queue1<Integer>> stackLinkedList = new StackLinkedList<>();
		
		//Method 5- using function of StackLinkedList class of
		//com.bridgelabz.util package
		int size = customStack.getSize();
		
		for(int i=0; i < size; i++){
			
			//Method 6- using function of StackLinkedList class of
			//com.bridgelabz.util package
			stackLinkedList.push(customStack.pop());
		}

		for (int i = 0; i < size; i++) {
			Queue1<Integer> week = stackLinkedList.pop();
			for (int j = 0; j < week.getSize(); j++) {
				
				//Method 7- using function of Queue class of
				//com.bridgelabz.util package
				System.out.print(week.remove() + "\t ");
				
			}
			System.out.println();

	}

	}}
