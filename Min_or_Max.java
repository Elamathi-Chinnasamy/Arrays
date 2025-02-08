import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements: ");
		
		for(int i=0; i<n; i++)
		{
		    arr[i] = scan.nextInt();
		}
		System.out.println("Displaying the array elements: ");
		for(int i=0; i<n; i++)
		{
		    System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<n; i++)
		{
		    if(arr[i]<min)
		    {
		        min = arr[i];
		    }
		    if(arr[i]>max)
		    {
		        max = arr[i];
		    }
		}
		System.out.println("the minimum element: "+min);
		System.out.println("the maximum element: "+max);
	}
}