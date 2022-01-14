package practiceprogrammes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class collectiuons {
	
	private node head;
	static private class node
	{
		private int data;
		private node next;
		
		public node(int data)
		{
			this.data=data;
		}
	}
	
	public void display()
	{
		node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void length()
	{
		int count = 0;
		node current=head;
		while(current!=null)
		{
			current=current.next;
			count++;
		}
		System.out.println("the length of linked list is "+count);
	}
	
	public void insertfirst(int value)
	{
		node newnode=new node(value);
		newnode.next=head;
		head=newnode;
	}

	public void insertlast(int value)
	{
		node newnode=new node(value);
		node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newnode;
	}
	
	public void insertbetween(int nodedata,int value)
	{
		node current=head;
		node newnode=new node(value);
		while(current.data!=nodedata)
		{
			current=current.next;
		}
		newnode.next=current.next;
		current.next=newnode;
	}
	
	public void deletefirst()
	{
		int element=head.data;
		head=head.next;
		System.out.println("the deleted element is "+element);
	}
	
	public void deletelast()
	{
		
	}
	
	public static void main(String[] args) {
		collectiuons ll=new collectiuons();
		ll.head=new node(10);
		node secondnode=new node(20);
		node thirdnode=new node(30);
		node fourthnode=new node(40);
		
		
		ll.head.next=secondnode;
		secondnode.next=thirdnode;
		thirdnode.next=fourthnode;
		
		ll.insertfirst(60);
		ll.insertlast(100);
		ll.insertbetween(20,57);
		
		ll.length();
		
		ll.display();
		
		
		
	}

	
}


