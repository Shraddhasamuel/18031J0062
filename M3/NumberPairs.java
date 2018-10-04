import java.util.Arrays;
public class NumberPairs {
	int[] arr;
	int n;
public void Sort(int[] arr, int n)
{
	this.arr=arr;
	this.n=n;
int count=0;
int temp=0;
	Arrays.sort(arr);
	
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]!=temp)
		{
			if(arr[i]==arr[i+1])
			{
				temp =arr[i];
				count=count+1;
			}
		}
	}
	System.out.println(count +" number pairs");
	
	
}
}
