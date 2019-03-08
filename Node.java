package com.bridgelabz.Datastructure;

public class Node {
	public int data;
	
	public String data1;
	public Node nextNode;
	public Node() {
		
		this.nextNode=null;
	}

	public void setData(String data1) {
		
		this.data1=data1;
		nextNode=null;
	}
	
	public void setData(int data) {
		
		this.data=data;
		nextNode=null;
}

	

}
