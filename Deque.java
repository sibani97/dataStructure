package com.bridgelabz.Datastructure;

public class Deque<T> {
	
		Node head;
		int length = 0;
		class Node<T>
		{
			T data;
			Node next;
			 Node(T data)
			{
				this.data = data;
				next = null;
			}
			
		}
		public Deque()
		{
			
		}

		public void addFront(T data)
		   {
	    	 Node new_node = new Node(data);
	 		if(head == null)
	 		{
	 			head = new_node;
	 			length++;
	 			new_node.next = null;
	 			return;
	 		}
	 		new_node.next = head;
	 		head = new_node;
	 		length++;
		   }
	     

	     public void addRear(T data)
	     {
	    	 Node new_node = new Node(data);
	    		Node temp = head;
	    		boolean flag = false;
	    		if(head == null)  // if no element present in List
	    		{
	    			head = new_node;
	    			length++;
	    			return;
	    		}
	    		while(temp.next != null ) // traverse upto temp.next become null
	    		{
	    			temp = temp.next;
	    		}
	    		temp.next = new_node;// add element after present element
	    		length++;
	    		new_node.next = null;
	    }
	     

	     public <T>T removeFront()
	     {
	    	 T first = frontElement();
	    	 if(length == 0)
	 		{
	 			System.out.println("No element present in List");
	 			return null;
	 		}
	 		head = head.next;
	 		length--;
	 		return first;
	    	 
	     }
	     

	     
	     public <T>T removeRear()
	     {
	    	 
	    	 T lastElement = lastElement();
	    	 Node prev_node = head;
	 		 Node temp = head;
	 		 if(length == 0)
	 		 {
	 			System.out.println("No element present in List");
	 			return null;
	 		 }
	 		 while(temp.next != null)
	 		 {
	 			prev_node =temp;
	 			temp= temp.next;
	 		 }
	 		 prev_node.next = null;
	 		 length--;
	    	 return lastElement;
	     }
	     

	     
	     public boolean isEmpty()
	     {
	    	 return(length == 0);
	     }
	     

	   
	     public int size()
	     {
	    	 return length;
	     }
	   

	     public <T>T frontElement()
	     {
	    	return (T)head.data;
	     }
	   

	   
	     public <T>T lastElement()
	     {
	    	 Node temp = head;
				int count = size();
				while(temp.next!=null)
				{
					temp = temp.next;
					count--;
				}
				return (T) temp.data;
	     }
	     
	     public void printList() 
		    { 
		        Node pnode = head; 
		        while (pnode != null) 
		        { 
		            System.out.print(pnode.data+" "); 
		            pnode = pnode.next; 
		        } 
		    }
	    
	}


