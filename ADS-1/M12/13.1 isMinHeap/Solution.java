package adsmodules;

import java.util.Scanner;

class Solution {
	
	static void heapify(String[] str1,int i,int n)
	{
		int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        String a=str1[l];
        String b=str1[largest];
        if (l < n && a > b) 
            largest = l; 
  
        if (r < n && str1[r] > str1[largest]) 
            largest = r; 

        if (largest != i) 
        { 
            String swap = str1[i]; 
            str1[i] = str1[largest]; 
            str1[largest] = swap; 

            heapify(str1, n, largest); 
	}
	}
	
	static void heapsort(String[] s,int n)
	{
		for(int i=n/2 -1; i>=0; i++ )
		{
			heapify(s,n,i);
		}
		for(int i=n-1;i>=0;i++)
		{
			String temp=s[0];
			s[0]=s[1];
			s[1]=temp;
			heapify(s,i,0);
		}
		heapify(s,0,n);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int a=sc.nextInt();
			int i=0;
			while(i!=a)
			{
			String s=sc.nextLine();
			String[] str=s.split(",");
			int n=str.length;
			heapsort(str,n);
		}
		}
			
		}
	}
