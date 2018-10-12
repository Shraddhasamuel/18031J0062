import java.util.Scanner;

class Node
{
	Node head;
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}
class Steque
{
	private Node head;
	private Node tail;
	Steque()
	{
		head=null;
		tail=null;
	}
	
void push(int d)
{
	if(head==null)
	{
		head=tail=head.next;
		head=new Node(d);
		System.out.println(head);
	}
	else
	{
		head=tail=new Node(d);
	}
}

int pop()
{
	if(head==null)
	{
		System.out.println("List is empty");
	}
	else
	{
		head=null;
		head.next=head;
	}
	while(head!=tail)
	{
		System.out.println(head);
	}
	return 1;
}


void enqueue(int d)
{
	if(tail==null)
	{
		tail=new Node(d);
	}
	else
	{
		tail=tail.next;
		tail=new Node(d);
	}
}

}

class Solution
{
	public static void main(String args[])
	{
		Steque st=new Steque();
		Scanner sc=new Scanner(System.in);
		String a =sc.nextLine() ;
		int num=a.length();
		String b[] = a.split("\n");
	}
}