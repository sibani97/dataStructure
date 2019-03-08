package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Write a program Calendar that takes the month and year as command-line arguments using 2d array
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility1 u=new Utility1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the month");
		int month=scanner.nextInt();
		System.out.println("enter the year");
		int year=scanner.nextInt();
				
		String months[] = {" ","January","February","March","April","May","June","July","August","Septeber","October","November","December"};
      
         int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      
         if((month == 2) && (u.checkLeapYear(year)))
         
        	 days[month]=29;
         
         System.out.println("\t\t " + months[month] + " " + year);
         System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		int d=u.calander(month, 1, year);
         //int cal[][]=(int) u.calander(month, 1, year);
		for(int i=0;i<d;i++)
		
			System.out.println("\t");
			for(int i=1;i<=days[month];i++)
			{
				System.out.print(i + "\t");
				 if (((i + d) % 7 == 0) || (i == days[month]))
					 System.out.println();

			}
			}	
	}
	


