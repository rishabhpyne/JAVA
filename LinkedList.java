import java.util.Scanner;

public class LinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		//Constructor.
		Node(int d){
			data=d;
			next=null;
			}
	}
	
	//To insert a new node
	public static LinkedList insert(LinkedList list,int data){
		
		//Create a new node with the given data
		Node new_node=new Node(data);
		new_node.next=null;
		
		//If linked list is empty then make new node as head.
		if(list.head==null){
			list.head=new_node;
		}
		else{
			//Traverse till the end and insert the new node.
			Node last=list.head;
			while(last.next!=null)
				last=last.next;
			//Insert the new node at last node
			last.next=new_node;
	}
	return list;
	}
	//Method to print linked list
	public static void printList(LinkedList list){
		Node currNode=list.head;
		
		//Traverse through the Linked List.
		while(currNode!=null){
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println();
	}
	
	//Method to delete an element
	public static LinkedList delete(LinkedList list,int d){
		System.out.println("Inside delete function");
		Node p=list.head;
		Node n=p.next;
		while(n!=null){
			if (n.data==d){
				p.next=n.next;
			}
			p=p.next;
			n=n.next;
		}
		return list;
	}
	//Method to modify data
	public static LinkedList modify(LinkedList list,int m,int n){
		Node temp=list.head;
		while(temp!=null){
			if(temp.data==m)
				temp.data=n;
			temp=temp.next;
		}
		return list;
	}
	
	//Driver's code
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		//Insert Values
		list=insert(list,1);
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,4);
		list=insert(list,5);
		//Print the Linked List
		printList(list);
		list=delete(list,4);
		printList(list);
		modify(list,3,7);
		printList(list);
	}
}
