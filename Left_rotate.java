import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements: ");
		
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
		
		System.out.print("enter the index of element to be rotated: ");
		int ele = scan.nextInt();
		
		//left rotate
		for(int i=0; i<ele; i++)
		{
		    int first = arr[0];
		    for(int j=0; j<n-1; j++)
		    {
		        arr[j] = arr[j+1];
		    }
		    arr[n-1] = first;
		}
		for(int i=0; i<arr.length; i++)
		{
		    System.out.print(arr[i]+", ");
		}
		
	}
}