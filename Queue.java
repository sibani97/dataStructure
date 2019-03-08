package com.bridgelabz.Datastructure;

import java.util.Scanner;

public class Queue<T> {
	int size;
	int front;
	int rear;
	int capacity;
	Object arr[];
	public Queue(int capacity)
	{
		this.capacity=capacity;
		front=0;
		rear=capacity-1;
		arr=new Object[capacity];
	}
	public Queue()
	{
		
	}
	public boolean isEmpty(Queue  queue)
	{
		return(queue.size==0);
	}
	public boolean isFull(Queue  queue)
	{
		return(queue.size==queue.capacity);
	}
	public void enqueue()
	{
		double data = 0;
		//double data=front;
		if(isFull(this))
	       return;
		rear = (rear + 1) % capacity;
		arr[rear] = data;
		size = size + 1;
		System.out.println(data + "enqueued to the queue");
	}
	
	public T dequeue()
	{
		if(isEmpty(this))
			return null;
		T data = (T)arr[front];
		front = (front + 1) % capacity;
		size = size - 1;
		return data;
	}
	
	public int front()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return front;
	}
	
	public int rear()
	{
		if(isEmpty(this))
		    return Integer.MIN_VALUE;
		return front;
}
	

}
