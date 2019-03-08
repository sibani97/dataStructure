package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Write a program Calendar that takes the month and year as command-line arguments using Queue
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
public class CalenderQue {

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
			
		int d=Utility1.calander(month, 1,year);
				//Customized Queue
		Queue1<Queue1<Integer>> customQueue = new Queue1<Queue1<Integer>>();
		Queue1<Integer> queue = new Queue1<Integer>();
		
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) {
			
			
			queue.insert(i);
			if (((i + d) % 7 == 0) || (i == days[month])) {
				customQueue.insert(queue);
				queue = new Queue1<Integer>();
				continue;
			}
		}
		
		
		//com.bridgelabz.util package
		for (int i = 0; i < customQueue.getSize(); i++) {
			
			Queue1<Integer> week = customQueue.remove();
			
			for (int j = 0; j < week.getSize(); j++) {
				System.out.print(week.remove() + "\t");
			}
			System.out.println();
		}


	}

	
}
