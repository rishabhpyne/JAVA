import java.util.Scanner;

public class Linked
{
Node head;
static int c[];

static class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
}
public static Linked insert(Linked list,int m){
	Node n=new Node(m);
	n.next=null;
	
	if(list.head==null)
		list.head=n;
	else{
		Node t=list.head;
		while(t.next!=null)
			t=t.next;
		t.next=n;
	}
	return list;
}
		
public int getNthfromlast(Linked list,int k){
	int n=0;
	Node temp=head;
	while(temp!=null){
		temp=temp.next;
		n++;
	}
	int count=n-k;
	if(count<0) return -1;
	temp=head;
	while(count>0)
	{
		temp=temp.next;
		count--;
	}
	return (temp.data);
}
public static void main(String[] args){
	Linked list=new Linked();
	Linked r=new Linked();
	Scanner sc=new Scanner(System.in);
	int i=0;
	int j=0;
	int k,num,data;
	int noc=sc.nextInt();
	int b[]=new int[noc];
	c=new int[noc];
	while(i<noc)
	{
		num=sc.nextInt();
		b[i]=sc.nextInt();
		for(j=0;j<num;j++){
			if(j==0)
				r=insert(list,0);
			data=sc.nextInt();
			list=insert(list,data);
		}
		c[i]=list.getNthfromlast(list,b[i]);
		System.out.println();
		i++;
	}
	i=0;
	while(i<noc){
		System.out.print(c[i]+"\n");
		i++;
	}
	sc.close();
}
}
