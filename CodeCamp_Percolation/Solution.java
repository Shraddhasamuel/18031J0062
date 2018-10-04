import java.util.Scanner;

class Percolation {

	public int n;
	public boolean[][] id;
	public Percolation(int n)
	{
		id=new boolean[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			id[i][j]=false;
			System.out.println("Value:" +i +j +id[i][j]);
			}
		}
	}
	
	public void open(int row, int column)
	{
				id[row][column]=true;
				System.out.println(id[row][column]);
	}
	
	public boolean isOpen(int row, int col)  

	{
				if(id[row][col]==true)
				{
					return true;
				}
				else
				{
					return false;
				}
	}
	
	public boolean isFull(int row, int col)  

	{
				if(id[row][col]==true)
				{
					return true;
				}
				else
				{
				return false;
				}
	}
	
	public int numberOfOpenSites()

	{
		return n;	
	}
	
	public boolean percolates() 

	{
		return true;
	}
}

class Weighted
{
	public int id[][];
	int row,col;
	public int root(int i)
	{
		
		while(i!=id[row][col])
			i=id[row][col];
		return i;
	}
	
	public boolean connected(int row,int col)
	{
		
		return root(row)==root(col);
	}
	
	public void union(int p,int q)
	{
		int i=root(p);
		int j=root(q);
		id[i][j]=j;
	}
}

class Solution
{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		Weighted w=new Weighted();
		Percolation p=new Percolation(size);
		
		while(sc.nextBoolean())
		{
			System.out.println("Enter row: ");
			int r=sc1.nextInt();
			System.out.println("Enter column: ");
			int c=sc1.nextInt();
			p.open(r,c);
		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				w.connected(i,j);
			}
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("Open: " +p.isOpen(i,j));
			}
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(p.isFull(i,j)==true)
				{ 
					System.out.println("Full");
					System.out.println("Percolates: " +p.percolates());
				}
				else
				{
					System.out.println("Does not percolate" );
				}
			}
		}
		sc.close();
		sc1.close();
	}
}
