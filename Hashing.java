package com.bridgelabz.Datastructure;
/**
 * @author:sibani barui
 * purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number
Since there are 10 Numbers divide each number by 11 and the reminder put in the appropriate slot
 * Queue to either deposit or withdraw money and dequeue the people
 * date:1/03/2019
 * version:1.0
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomLinkedList<Integer> clist1=new CustomLinkedList<>();
		CustomLinkedList<Integer> clist2=null;
		Map<Integer,CustomLinkedList<Integer>> map=new HashMap<Integer,CustomLinkedList<Integer>>();
		for(int i=0;i<=10;i++)
		{
			clist2=new CustomLinkedList<>();
			map.put(i, clist2);
		}
		FileReader file=new FileReader("/home/admin1/eclipse-workspace/FirstProject/src/com/bridgelabz/Datastructure/input3.txt");
		BufferedReader br=new BufferedReader(file);
		int rem;
		String num;
		String delimitor=",";
		
		while((num=br.readLine())!=null)
		{
			String[] number=num.split(delimitor);
			for(String numb:number)
			{
				clist1.add(Integer.parseInt(numb));
			}
		}
		System.out.println("the numbers in the file are:");
		clist1.printList();
		System.out.println();
		int len=clist1.size();
		String[] arr=new String[len];
		String[] arr2=clist1.convArray(arr);
		int[] res=clist1.convertIntArray(arr2);
		int[] sorted=clist1.sort(res);
		System.out.println("The sorted array:");
		for(int s:sorted)
		
		System.out.println(s+"");
		System.out.println();
		System.out.println("dividing each number by 11");
		for(int i=0;i<sorted.length;i++)
		{
			rem=sorted[i]%11;
			if(map.isEmpty())
			{
				clist2.add(sorted[i]);
				map.put(rem,clist2);
			}
			else
			{
				clist2=map.get(rem);
				if(clist2.size()==0)
				{
					clist2.add(sorted[i]);
				}
				else{
					
					if(!clist2.search(sorted[i])){
						
						clist2.add(sorted[i]);
					}
				}
				map.put(rem,clist2);
			}
}

	
	for(int i=0; i<map.size(); i++){
		CustomLinkedList<Integer> list = map.get(i);
		System.out.print(i+" ");
		list.printList();
		System.out.println();
	}
	int n=0;
	do{
		System.out.println("Enter choice");
		System.out.println("1:Search for the number  2:Write  3:Exit");
		int choice=CustomLinkedList.userInt();
		switch(choice){
		case 1: System.out.println("Enter the number to search");
				int user_num=CustomLinkedList.userInt();
				boolean rs=clist2.search(user_num);
				if(rs){
					System.out.println("The number is found");
					System.out.println("Fetching the index of the number");
					
					int index=clist2.index(user_num);
					
					System.out.println(index);
					
					
					
					clist2.remove(index);
					System.out.println("The list after removing the number");
					
					clist2.printList();
				}
				else{
					System.out.println("Number not found");
					
					clist2.add(user_num);
					System.out.println("The list after adding the not found element");
					
					clist2.printList();
				}
				break;
		case 2: System.out.println("Writing the modifications into the file..");
				FileWriter fw=new FileWriter("/home/admin1/eclipse-workspace/FirstProject/src/com/bridgelabz/Datastructure/input3.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				
				int leng=clist2.size();
				String[] res_array=new String[leng];
				String[] result=clist2.convArray(res_array);
				for(int i=0;i<result.length;i++){
					bw.write(result[i]+", ");
				}
				br.close();
				bw.close();
				break;
		case 3: System.out.println("Invalid choice");
				System.exit(0);
		}
		n++;
	}while(n<5);
	
br.close();
	
	}
	
}
