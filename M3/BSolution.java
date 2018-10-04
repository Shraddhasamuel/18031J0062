import java.util.Scanner;

class BSolution {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the array values");
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();	
	}
	System.out.println("***enter the element to search");
	int m=sc.nextInt();
	Binary b=new Binary();
	b.search(a,n,m);
	}

}
