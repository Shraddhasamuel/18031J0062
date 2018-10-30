import java.util.Scanner;
class Solution 
{
	static void stringheap(int[] str1,int i,int n)
	{
		int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2;
        if (l < n && (str1[l]>(str1[largest])))
        {
            largest = l; 
        }
        if (r < n && str1[r]>(str1[largest]))
        {
            largest = r; 
        }
        if (largest != i) 
        { 
            int swap = str1[i]; 
            str1[i] = str1[largest]; 
            str1[largest] = swap; 
            stringheap(str1, n, largest); 
        }
     }
	
	static void stringheapsort(int[] s,int n)
	{
		for(int i=n/2 -1; i>=0; i++ )
		{
			stringheap(s,n,i);
		}
		for(int i=n-1;i>=0;i++)
		{
			int temp=s[0];
			s[0]=s[1];
			s[1]=temp;
			stringheap(s,i,0);
		}
		stringheap(s,0,n);
	}
	static void intheapsort(int[] s,int n)
	{
		for(int i=n/2 -1; i>=0; i++ )
		{
			intheap(s,n,i);
		}
		for(int i=n-1;i>=0;i++)
		{
			int temp=s[0];
			s[0]=s[1];
			s[1]=temp;
			intheap(s,i,0);
		}
		intheap(s,0,n);
	}
	static void intheap(int[] a,int i,int n)
	{
		int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2;
        if (l < n && (a[l]>(a[largest])))
        {
            largest = l; 
        }
        if (r < n && a[r]>(a[largest]))
        {
            largest = r; 
        }
        if (largest != i) 
        { 
            int swap = a[i]; 
            a[i] = a[largest]; 
            a[largest] = swap; 
            stringheap(a, n, largest); 
        }
	}
        static void floatheapsort(float[] s,int n)
    	{
    		for(int i=n/2 -1; i>=0; i++ )
    		{
    			floatheap(s,n,i);
    		}
    		for(int i=n-1;i>=0;i++)
    		{
    			float temp=s[0];
    			s[0]=s[1];
    			s[1]=temp;
    			floatheap(s,i,0);
    		}
    			floatheap(s,0,n);
    	}
    	static void floatheap(float[] a,int i,int n)
    	{
    		int largest = i;
            int l = 2*i + 1; 
            int r = 2*i + 2;
            if (l < n && (a[l]>(a[largest])))
            {
                largest = l; 
            }
            if (r < n && a[r]>(a[largest]))
            {
                largest = r; 
            }
            if (largest != i) 
            { 
                float swap = a[i]; 
                a[i] = a[largest]; 
                a[largest] = swap; 
                floatheap(a, n, largest); 
            }
	}
    	
    	static void doubleheapsort(Double[] aar,int n)
    	{
    		for(int i=n/2 -1; i>=0; i++ )
    		{
    			doubleheap(aar,n,i);
    		}
    		for(int i=n-1;i>=0;i++)
    		{
    			double temp=aar[0];
    			aar[0]=aar[1];
    			aar[1]=temp;
    			doubleheap(aar,i,0);
    		}
    		doubleheap(aar,0,n);
    	}
    	static void doubleheap(Double[] a,int i,int n)
    	{
    		int largest = i;
            int l = 2*i + 1; 
            int r = 2*i + 2;
            if (l < n && (a[l]>(a[largest])))
            {
                largest = l; 
            }
            if (r < n && a[r]>(a[largest]))
            {
                largest = r; 
            }
            if (largest != i) 
            { 
                double swap = a[i]; 
                a[i] = a[largest]; 
                a[largest] = swap; 
                doubleheap(a, n, largest); 
            }
    	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.String\n2.Integer\n3.Float\n4.Double");
		//while(true)
		{
			System.out.println("Enter choice:");
			String ch=sc.nextLine();
			switch(ch)
			{
			case "String":int a=sc.nextInt();
			int i=0;
			while(i!=a)
			{
				String str=sc.next();
				String[] str1=str.split(",");
				int n=str1.length;
				int[] ar=new int[n];
				for(int j=0;j<n;j++)
				{
					ar[j]=Integer.parseInt(str1[j]);
				}
				stringheapsort(ar,n);
			}
			break;
			
			case "Integer":int b=sc.nextInt();
			int q=0;
			while(q!=b)
			{
				String str=sc.next();
				String[] str1=str.split(",");
				int n=str1.length;
				int[] ar=new int[n];
				for(int j=0;j<n;j++)
				{
					ar[j]=Integer.parseInt(str1[j]);
				}
				intheapsort(ar,n);
			}
			break;
			
			case "Float":
				int c=sc.nextInt();
				int e=0;
				while(e!=c)
				{
					String str=sc.next();
					String[] str1=str.split(",");
					int n=str1.length;
					float arr[]=new float[n];
					for(int k=0;k<n;k++)
					{
						arr[k]=Float.parseFloat(str1[k]);
					}
					floatheapsort(arr,n);
				}
			break;
			
			case "Double":
				int d=sc.nextInt();
				int r=0;
				while(r!=0)
				{
					String str=sc.next();
					String[] str1=str.split(",");
					int n=str1.length;
					Double aar[]=new Double[n];
					for(int l=0;l<n;l++)
					{
						aar[l]=Double.parseDouble(str1[l]);
					}
					doubleheapsort(aar,n);
				}
			break;	
			}
			}
		}
	}
