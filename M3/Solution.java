import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		NumberPairs np=new NumberPairs();
		np.Sort(arr, n);
		
	}

}
