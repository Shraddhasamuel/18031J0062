import java.util.Scanner;

class Node
{
	Node front,rear;
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		front=null;
		rear=null;
		next=null;
	}
}
class Steque
{
	private Node front,rear;
	
	Steque()
	{
		front=null;
		rear=null;
	}
	
void push(int d)
{
	if(rear==null)
	{
		rear=new Node(d);
	}
	else
	{
		rear=rear.next;
		rear=new Node(d);
	}
}

int pop()
{
	if(front==null)
	{
		System.out.println("Empty");
	}
	else
	{
		front=null;
		front=front.next;
	}
	while(front!=null)
	{
		System.out.println(front);
	}
	return 0;
}


void enqueue(int d)
{
	if(rear==null)
	{
		rear=new Node(d);
	}
	else
	{
		rear=rear.next;
		rear=new Node(d);
	}
}

}

class Solution
{
	public static void main(String args[])
	{
		Steque st=new Steque();
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String ch=sc.nextLine();
	}
}