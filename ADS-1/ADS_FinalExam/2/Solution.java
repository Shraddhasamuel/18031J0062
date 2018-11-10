package ADSFINAL2;

import java.util.Scanner;

class Student
{
	String name;
	String rollno;
	double marks;
	public Student(String name, String rollno, double marks) 
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	class Node
	{
		int key;
		Node left,right;
		
		Node(int key)
		{
			this.key=key;
			left=right=null;
		}
	}
	Node root;
	Student()
	{
	root=null;
	}
	
    void insert(int key) { 
       root = insertele(root, key); 
    } 
   
    Node insertele(Node root, int key) 
    { 
          if (root == null) { 
            root = new Node(key); 
            return root; 
        } 

        if (key < root.key) 
            root.left = insertele(root.left, key); 
        else if (key > root.key) 
            root.right = insertele(root.right, key); 
  
        return root; 
    } 

    void getless(int key)
    {
    	while(root!=null)
    	{
    		if(root.key < key)
    		{
    			System.out.println(root.key);
    		}
    	}
    }
    
    void getmore(int key)
    {
    	while(root!=null)
    	{
    		if(root.key > key)
    		{
    			System.out.println(root.key);
    		}
    	}
    }
    void getbw(int key1,int key2)
    {
    	while(root!=null)
    	{
    		if(root.key >= key1 && root.key <= key2)
    		{
    			System.out.println(root.key);
    	}
    		
    }
    }
}

class Solution {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		int n=sc.nextInt();
		int i=0;
		while(i<n)
		{
		String str=sc.next();
		String[] str1=str.split(",");
		for(int j=0;j<n;j++)
		{
			int r=Integer.parseInt(str1[0]);
			str1[1]=s.name;
			double m=Double.parseDouble(str1[2]);
			
			s.insert(r);
		}
		i++;
		}
		int m=sc.nextInt();
		int k=0;
		while(k<m)
		{
			String st=sc.next();
			String[] st1=st.split(" ");
			for(int l=0;l<st.length();l++)
			{
				String a=sc.next();
				switch(a)
				{
				case "BE": s.getbw(sc.nextInt(),sc.nextInt());
							break;
				case "LE": s.getless(sc.nextInt());
							break;
				case "GE": s.getmore(sc.nextInt());
							break;
				}
			}
			k++;
		}
	}
}

