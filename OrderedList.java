package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Read .a List of Numbers from a file and arrange it ascending Order in 
 * a Linked List. Take user input for a number, if found then pop the number out of the list else insert 
 * the number in appropriate position
 * 
 * date:1/03/2019
 * version:1.0
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		String filename="/home/admin1/eclipse-workspace/FirstProject/src/com/bridgelabz/Datastructure/input1.txt";
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String number[]=new String[100];
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			number=num.split(delimitor);
		}
		Integer [] intArr=new Integer[number.length];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.valueOf(number[i]);
		}
		
		
		Integer[] sorted=Utility2.sort(intArr);
		
		for(int numb:sorted){
		
		
			ds.add(numb);
		}
		
		System.out.println("The numbers in the file are:");
		
				ds.printList();
		
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a number  2:Final Write  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the number to be searched");
					int user_num=CustomLinkedList.userInt();
					
					
					
					boolean rs=ds.search(user_num);
					if(rs){
						System.out.println("Number is found");
						System.out.println("Fetching the index of the number");
						
						int index=ds.index(user_num);
						
						System.out.println(index);
						
						
						ds.remove(index);
						
						System.out.println("The list after removing the number");
						
						ds.printList();
					}
					else{
						System.out.println("Number not found");
						ds.add(user_num);
						String[] array=new String[ds.size()];
						
						
						String array1[]=ds.convArray(array);
						
						
						int[] intArray=ds.convertIntArray(array1);
						
						int[] sorted_array=ds.sort(intArray);
						for(int i:sorted_array)
							ds.add(i);
						System.out.println("The list after adding the not found element");
						ds.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					
					
					
					int leng=ds.size();
					String[] res_array=new String[leng];
					String[] result=ds.convArray(res_array);
					
					Utility2.fileWriter(result, filename);
				
					break;
		   case 3: System.out.println("Invalid choice");
				   System.exit(0);
		
		}
			n++;
		}while(n<10);
		br.close();


	}

}
