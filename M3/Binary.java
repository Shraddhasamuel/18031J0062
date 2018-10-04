import java.util.Arrays;

public class Binary {
public void search(int[] a, int n, int m){
	Arrays.sort(a);
int low=0;
int high=n-1;
int mid;
for(int i=0;i<n;i++)
{
	mid=(low+high)/2;
	if(a[mid]<m)
	{
		low=mid+1;
	}
	if(a[mid]==m)
	{
		if(mid==0)
		{
			System.out.println("the element is stored at index" + (mid));
			break;
		}
		
		if(a[mid-1]==m)
			{
				System.out.println("the element is stored at index" + (mid-1));
				break;
			}
		else
		System.out.println("the element is stored at index" + mid);
		break;
	}
	if(a[mid]>m)
	{
		high=mid-1;
	}
}
}
}


