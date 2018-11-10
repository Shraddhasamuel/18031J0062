package ADSFINAL;
import java.util.Scanner;
class Student
{
	String name;
	String rollno;
	double marks;
	public Student(String rollno, String name, double marks)
	{
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
}

class Hash
{	
	int myhash(String r,int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		sum=sum+i*r.charAt(0);
		}
		sum=sum%n;
		return sum;
	}
	

void get(String rollno,int val,int n)
{
	Student[] s=new Student[n];
	int i=0;
	while(i<n)
	{
		if(val==1)
		{
			if(rollno.equals(s[i].rollno))
			{
				System.out.print(s[i].name);
			}
		}
		
		if(val==2)
		{
			if(rollno.equals(s[i].rollno))
			{
				System.out.print(s[i].marks);
			}
		}
		i++;
	}
}
}


public class Solution 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student[] s=new Student[n];
		Hash h=new Hash();
		int b=0;
		while(b<n)
		{
		String str=sc.next();
		String[] str1=str.split(",");
		for(int i=0;i<str.length();i++)
		{
			//s[i]=new Student(str1[0],str1[1],Double.parseDouble(str1[2]));
			int x=h.myhash(str1[0],n);
			s[x]=new Student(str1[0],str1[1],Double.parseDouble(str1[2]));
		}
		b++;
		}
		int m=sc.nextInt();
		int k=0;
		while(k<=m)
		{
			String st=sc.next();
			String[] st1=st.split(" ");
			//System.out.println(st.length());
			for(int j=0;j<=st1.length;j++)
			{
				st1[0]=sc.next();
				st1[1]=sc.next();
				int f=Integer.parseInt(st1[2]);
				switch(f)
				{
				case 1: 
					h.get(st1[1],f,n);
				break;
				
				case 2: 
					h.get(st1[1],f,n);
					break;
				}
			k++;
		}
	}
	}
}
