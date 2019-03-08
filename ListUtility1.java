package com.bridgelabz.Datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListUtility1 {
	public Node readFile(Node head)
	{
		
		
		try{
	           	FileInputStream fis = new FileInputStream("/home/admin1/eclipse-workspace/FirstProject/src/input.txt");
	           	char ch;
	           	String word3="";
	           	while (fis.available() > 0)
	           	{
					ch = (char) fis.read();
	             	word3=word3+ch;
	           	}
	           	String[] wordsArray=word3.split(" ");
				for(int i =0; i < wordsArray.length ; i++)
				{
	           		//start=addWordstoList(start,wordsArray[i]);
					head=addWordstoList(head,wordsArray[i]);
				}
			}
	     	catch(NullPointerException ne)
	     	{
	     		System.out.println(ne.toString());
	     	}
			catch(IOException e){
			}
			return head;
	 }//End of read method
	public Node addWordstoList(Node node1,String str)
	{
	   Node node2=node1;
	   Node newNode=new Node();
	   newNode.data1=str;
	   newNode.nextNode=null;
	   if(node1==null)
	   {
	     return newNode;
	   }
	   else{
	     while(node1.nextNode!=null)
	     {
	       node1=node1.nextNode;
	     }
	     node1.nextNode=newNode;
	   }
	   return node2;
}
	public Node searchData(Node node,String word)
	{
	     Node temp1=node;
	     while(node.nextNode!=null){
	       if(word.compareTo((node.nextNode).data1)==0)
	       {
	         node.nextNode=(node.nextNode).nextNode;
	         System.out.println("Word is Found");
	         System.out.println("the founded word is deleted from the file");
	         System.out.println("file saved");
	         return temp1;
	       }
	       node=node.nextNode;
	     }
	     System.out.println("Word is not Found");
	     System.out.println("the not founded word is added to the file");
	     System.out.println("file saved");
	      Node temp=addWordstoList(temp1,word);
	     return temp;
	}//End of Search word

	//writeToFile
	public void writeDataToFile(String nWord)
	{
		File fi=new File("file.txt");
      	//fi.createNewFile();
		fi.canWrite();
		System.out.println("Writed");
		try{
			FileWriter fw = new FileWriter(fi);
			BufferedWriter br = new BufferedWriter(fw);
	        br.write(nWord+" ");
	        br.flush();
		}
		catch(IOException e){
		}
}

}
