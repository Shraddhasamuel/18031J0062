
import java.util.Scanner;

public class Solution 
{
	static void med(int a[])
	{
		int n=a.length;
		int i,b=0;
		float[] mid=new float[n];
		for(i=0;i<n;i++)
		{
			mid[i]=(b+a[i]) / 2;
			b=a[i]+b;
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(mid[k]);
		}
	}
	
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		med(a);
	}	
	}
}
